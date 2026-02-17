package QA_design_patterns.singleton.selenium_implementation;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;


public class WebDriverManager {
	private static WebDriverManager instance;

	// ThreadLocal is used to create a separate instance of WebDriver for each thread for parallel execution
	private static ThreadLocal<WebDriver> tlDriver = new ThreadLocal<>();

	private WebDriverManager() {
		System.out.println("This is my private constructor");
	}

	private void initializeDriver(String browser) {
		switch (browser.toLowerCase()) {
			case "chrome"-> tlDriver.set(new ChromeDriver());
			case "firefox"-> tlDriver.set(new FirefoxDriver());
			case "edge"-> tlDriver.set(new EdgeDriver());
			default -> throw new IllegalArgumentException("Invalid browser: " + browser);
		}
	}

	public static WebDriverManager createDriverInstance(String browser){
		if(instance==null){
			synchronized (WebDriverManager.class) {
				if(instance==null){
					instance = new WebDriverManager();
				}
			}
		}
		if(tlDriver.get()==null){
			instance.initializeDriver(browser);
			System.out.println("WebDriver instance created for " + browser);
		}
		return instance;
	}

	public static WebDriver getDriver(){
		return tlDriver.get();
	}

	public static void quitBrowser(){
		if(tlDriver.get()!=null){
			tlDriver.get().quit();
			tlDriver.remove();
			System.out.println("WebDriver instance quit and removed from ThreadLocal");
		}
	}
}
