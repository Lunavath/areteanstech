package com.areteans.library.drivers;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import io.github.bonigarcia.wdm.WebDriverManager;

public class Driver {

	private static WebDriver driver = null;

	private Driver() {
	}

	public static WebDriver intialize() {

		if (driver == null) {

			String browserToLaunch;
			browserToLaunch = Config.getProperty("browser");
			if (browserToLaunch == null) {
				browserToLaunch = "chrome";
			}

			Browser browser = Browser.valueOf(browserToLaunch.toLowerCase());

			switch (browser) {

			case chrome:
				WebDriverManager.chromedriver().setup();
				driver = new ChromeDriver();
				driver.manage().window().maximize();
				break;

			case ie:
				WebDriverManager.iedriver().arch32().setup();
				driver = new InternetExplorerDriver();
				driver.manage().window().maximize();
				break;

			case firefox:
				WebDriverManager.firefoxdriver().setup();
				driver = new FirefoxDriver();
				driver.manage().window().maximize();
				break;

			default:
				WebDriverManager.chromedriver().setup();
				driver = new ChromeDriver();
				driver.manage().window().maximize();
				break;
			}

			return driver;

		} else {
			return driver;
		}

	}

	public static WebDriver getDriver() {

		if (driver != null)
			return driver;
		else {
			intialize();
			return driver;
		}
	}

	protected static void closeBrowser() {
		driver.close();
		driver = null;
	}

	public static void quitBrowser() {
		driver.quit();
		driver = null;
	}
}
