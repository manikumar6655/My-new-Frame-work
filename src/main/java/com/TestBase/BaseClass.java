package com.TestBase;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;
import com.PomPages.SearchFunctionality;
import com.Utilities.Validations;
import com.Utilities.LogUtilities;
import com.Utilities.webdriverUtilities;



public class BaseClass {

	public WebDriver driver;
	public EdgeOptions options;
	public static Properties prop = new Properties();
	public static FileInputStream fis;
    LogUtilities logger = new LogUtilities();
	public static  webdriverUtilities ut=new webdriverUtilities(); 
	public static Validations v=new Validations();


	








	@BeforeClass
	public void setUp() 
	{
		logger.info("Test Environment setUp");
		try {
			fis=new FileInputStream("./src/test/resources/Config.properties");
			logger.warn("---Getting file---");
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}

		try {
			prop.load(fis);
			logger.warn("---File loaded Successfully----");
		} catch (IOException e) {
			e.printStackTrace();
		}


		if(prop.getProperty("BROWSER").equalsIgnoreCase("edge"))
		{
			options=new EdgeOptions();
			options.addArguments("--disable-extensions");
			driver=new EdgeDriver(options);
			logger.error("---Edge Opened Successfully---");

		}

		else if(prop.getProperty("Browser").equalsIgnoreCase("chrome"))
		{

			driver=new ChromeDriver();
		}

		driver.get(prop.getProperty("URL"));
		driver.manage().window().maximize();
		logger.fatal("---Url laaunched Successfully---");


	}


	@AfterClass
	public void tearDown()
	{
		//driver.quit();
	}



}
