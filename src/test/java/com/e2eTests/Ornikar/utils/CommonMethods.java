package com.e2eTests.Ornikar.utils;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class CommonMethods {

	public CommonMethods() {
		driver = Setup.driver;
	}

	public static WebDriver driver;
	public static Properties prop;

	protected static final Logger logger = LoggerFactory.getLogger(AbstractPage.class);

	public void scrollerBottom() {
		((JavascriptExecutor) driver).executeScript("window.scrollBy(0,400)", "");
	}

	public void readFromConfigFile(String url) throws IOException {
		prop = new Properties();
		FileInputStream fis = new FileInputStream("src/test/resources/configs/config.properties");
		prop.load(fis);
		driver.get(prop.getProperty(url));
	}

	public <T> void click(T elementAttr) {
		if (elementAttr.getClass().getName().contains("By")) {
			driver.findElement((By) elementAttr).click();
		} else {
			((WebElement) elementAttr).click();
		}
	}

	public <T> void writeText(T elementAttr, String text) {
		if (elementAttr.getClass().getName().contains("By")) {
			driver.findElement((By) elementAttr).sendKeys(text);
		} else {
			((WebElement) elementAttr).sendKeys(text);
		}
	}


	
	public JSONObject JsonData(int i) {
		JSONParser parser = new JSONParser();
		try  {
			Object obj = parser.parse(new FileReader("./src/test/resources/test_data/wait_config.json"));
			
			JSONArray array = (JSONArray) obj;
			JSONObject jsonObject = (JSONObject) array.get(i);
			
			return jsonObject;
		} catch (FileNotFoundException e) {
			e.printStackTrace();
			return null;
		} catch (IOException e) {
			e.printStackTrace();
			return null;
		}catch (ParseException e) {
			e.printStackTrace();
			return null;
		}
	}
	
}
