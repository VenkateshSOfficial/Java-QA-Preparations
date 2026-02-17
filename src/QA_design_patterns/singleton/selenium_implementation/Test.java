package QA_design_patterns.singleton.selenium_implementation;

import org.openqa.selenium.WebDriver;


public class Test {
	public static void main(String[] args) {
		WebDriver driver = WebDriverManager.createDriverInstance("firefox").getDriver();
		driver.get("https://www.google.com");
		driver.manage().window().maximize();
		System.out.println("The title is " + driver.getTitle());
		WebDriverManager.quitBrowser();
	}
}
