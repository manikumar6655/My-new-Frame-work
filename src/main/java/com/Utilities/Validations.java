package com.Utilities;

import static org.testng.Assert.assertTrue;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import com.TestBase.BaseClass;

public class Validations extends BaseClass{


	public void contains(WebElement element,WebDriver driver,String Expected, String passMessage,String failMessage) throws InterruptedException
	{

		String ActualValue=element.getAttribute("value");

		if(ActualValue.contains(Expected))
		{
			assertTrue(true,passMessage );
			ut.highlightElement(driver,element);

		}
		else
		{
			assertTrue(false, failMessage);
		}
	}


	public void Displayed(WebElement element,WebDriver driver,String passMessage,String failMessage) throws InterruptedException
	{

		if(element.isDisplayed())
		{

			ut.highlightElement(driver, element);
			assertTrue(true, passMessage);
		}
		else
		{
			assertTrue(false, failMessage);

		}
	}

	public void containsTittle(WebElement element,WebDriver driver,String passMessage,String failMessage) throws InterruptedException
	{


		String actual=driver.getTitle();
		String Expected=element.getText();
		
		ut.waitForElementToLoad(driver, element);
		ut.highlightElement(driver,element);

		if(Expected.contains(actual))
		{
			assertTrue(true, passMessage);
			System.out.println("Pass");
		}
		else
		{
			assertTrue(false, failMessage);
			System.out.println("Fail");

		}
	}

}

