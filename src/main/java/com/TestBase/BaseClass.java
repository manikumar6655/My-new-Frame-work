package com.TestBase;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

import com.Utilities.LogFile;
import com.Utilities.Validations;
import com.Utilities.webdriverUtilities;

import io.github.bonigarcia.wdm.WebDriverManager;



public class BaseClass {

	public WebDriver driver;
	public EdgeOptions options;
	public static Properties prop = new Properties();
	public static FileInputStream fis;
	public static  webdriverUtilities ut=new webdriverUtilities(); 
	public static Validations v=new Validations();
	public LogFile logger=new LogFile();



	








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
		
			WebDriverManager.edgedriver().setup();
			driver=new EdgeDriver();
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
		driver.quit();
	}



}
