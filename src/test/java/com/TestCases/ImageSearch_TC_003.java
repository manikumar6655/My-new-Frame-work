package com.TestCases;

import java.awt.AWTException;
import java.io.IOException;
import org.apache.poi.EncryptedDocumentException;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import com.PomPages.ImageSearch;
import com.TestBase.BaseClass;





public class ImageSearch_TC_003 extends BaseClass{

	public ImageSearch image;
	
	
	
		
	@Test
	public void imageSearch() throws InterruptedException, AWTException, EncryptedDocumentException, IOException
	{
		image=new ImageSearch(driver);
		ut.sleep();
		image.getData();
		ut.sleep();
		logger.info("image Search Test is passed");
	}
	
	@Test
	public void ValidateGoogleImagePage() throws InterruptedException
	{
	
		WebElement image=driver.findElement(By.xpath("//img[@class='lnXdpd']"));
		if(image.isDisplayed())
		{
			ut.highlightElement(driver, image);
			System.out.println("Displayed");
		}
		System.out.println("ValidateGoogleImagePage");
	}


}
