package QA_design_patterns.factory.selenium_implementation;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;


public class FirefoxBrowser implements BrowserDriver{
	@Override
	public WebDriver createDriver() {
		return new FirefoxDriver();
	}
}
