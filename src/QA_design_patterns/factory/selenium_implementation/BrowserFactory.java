package QA_design_patterns.factory.selenium_implementation;

import org.openqa.selenium.WebDriver;


public class BrowserFactory {
	public static WebDriver getDriver(String browserType){
		switch(browserType.toLowerCase()) {
			case "chrome" -> {
				return new ChromeBrowser().createDriver();
			}
			case "firefox" -> {
				return new FirefoxBrowser().createDriver();
			}
			case "edge" -> {
				return new EdgeBrowser().createDriver();
			}
			default -> throw new IllegalArgumentException("Unsupported browser type: " + browserType);
		}
	}

	public static void main(String[] args) {
		WebDriver driver = BrowserFactory.getDriver("chrome");
		driver.get("https://www.google.com");
		System.out.println("Title: " + driver.getTitle());
		driver.quit();
	}
}
