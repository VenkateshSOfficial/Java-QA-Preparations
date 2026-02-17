package QA_design_patterns.factory.selenium_implementation;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;


public class EdgeBrowser implements BrowserDriver{
	@Override
	public WebDriver createDriver() {
		return new EdgeDriver();
	}
}
