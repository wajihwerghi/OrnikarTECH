package com.e2eTests.Ornikar.utils;

import org.openqa.selenium.firefox.FirefoxDriver;

public class FirefoxDriverManager extends DriverManager {

	@Override
	protected void startService() {
// TODO Auto-generated method stub
		System.setProperty("webdriver.gecko.driver", "");

	}

	@Override
	protected void stopService() {
// TODO Auto-generated method stub

	}

	@Override
	protected void createDriver() {
// TODO Auto-generated method stub
		driver = new FirefoxDriver();
		driver.manage().window().maximize();
	}

}
