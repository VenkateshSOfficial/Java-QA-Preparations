package QA_design_patterns.factory.selenium_implementation;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class ChromeBrowser implements BrowserDriver{
	@Override
	public WebDriver createDriver() {
		return new ChromeDriver();
	}
}
