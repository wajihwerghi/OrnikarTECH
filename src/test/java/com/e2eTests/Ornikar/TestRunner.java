package com.e2eTests.Ornikar;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

import org.junit.AfterClass;
import org.junit.runner.RunWith;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import com.cucumber.listener.Reporter;

import cucumber.api.CucumberOptions;
import cucumber.api.SnippetType;
import cucumber.api.junit.Cucumber;
import cucumber.api.testng.AbstractTestNGCucumberTests;

@RunWith(Cucumber.class)
@CucumberOptions(
		features = {"src/specs/features"},
		plugin = {"pretty", "html:target/cucumber-html-report","json:target/cucumber.json", "com.cucumber.listener.ExtentCucumberFormatter:target/cucumber-reports/Ornikar-report.html"},
		snippets = SnippetType.CAMELCASE,monochrome= true, 
		tags = {("@Estimation")}
		)

@Test
public class TestRunner extends AbstractTestNGCucumberTests {
	
	@Parameters({"profileName"})
	@BeforeClass
	public void getDevice(String profileName) {
		System.out.println(profileName);
		try {
			String urlFile = "src/test/resources/test_data/config_file_locators_qualif.json";
			
			
			PrintWriter writer = new PrintWriter("src/test/resources/test_data/config_file.json");
			writer.print("");
			writer.close();
			
			FileReader fr = new FileReader(urlFile);
			BufferedReader br = new BufferedReader(fr);
			FileWriter fw = new FileWriter("src/test/resources/test_data/config_file.json", true);
			
			String s;
			
			while((s = br.readLine()) != null) {
				fw.write(s);
				fw.flush();
			}
			
			br.close();
			fw.close();
			System.out.println("config_file copied");
			
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		try {
			
			PrintWriter write2 = new PrintWriter("src/test/resources/test_data/config_file_locators.json");
			write2.print("");
			write2.close();
			String urlFile = "src/test/resources/test_data/config_file_locators_qualif.json";
			
			FileReader fr = new FileReader(urlFile);
			BufferedReader br =  new BufferedReader(fr);
			FileWriter fw = new FileWriter("src/test/resources/test_data/config_file_locators.json", true);
			
			String s;
			while ((s = br.readLine()) != null) {
				fw.write(s);
				fw.flush();
			}
			
			br.close();
			fw.close();
			System.out.println("config_file copied");
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	

	@AfterClass
	public static void writeExtentReport() {
		Reporter.loadXMLConfig(new File("src/test/resources/configs/extent-config.xml"));
	}
}
