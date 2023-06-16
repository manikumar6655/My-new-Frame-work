package com.Utilities;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.time.Duration;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.TestBase.BaseClass;

public class webdriverUtilities extends BaseClass{

	public 	JavascriptExecutor js;
	public Actions action;
	public WebDriverWait wait;

	
	public void highlightElement(WebDriver driver, WebElement element) {
        // Create an instance of the JavascriptExecutor
        JavascriptExecutor js = (JavascriptExecutor) driver;

        // Execute JavaScript code to highlight the element
        js.executeScript("arguments[0].style.border='2px solid red'", element);

	}
	public void mouseActions(WebElement TargetElement)
	{
		
		action =new Actions(driver);
		action.moveToElement(TargetElement).build().perform();
	
	}
	
	public void sendKeys(WebElement Element,String text)
	{
		Element.sendKeys(text);
	}
	
	public void robot() throws AWTException, InterruptedException
	{
		Robot robot=new Robot();
		robot.keyPress(KeyEvent.VK_ENTER);
		ut.sleep();
		robot.keyRelease(KeyEvent.VK_ENTER);
		System.out.println("Robot Method");
	}
	public void waitForElementToLoad(WebDriver driver, WebElement element)
	{
		WebDriverWait wait = new WebDriverWait(driver, 3000);
		wait.until(ExpectedConditions.visibilityOf(element));
	}
	
	public void sleep() throws InterruptedException
	{
		Thread.sleep(3000);
	}
	public void robot1() throws AWTException, InterruptedException
	{
		
		Robot robot=new Robot();
		robot.keyPress(KeyEvent.VK_DOWN);
		robot.keyPress(KeyEvent.VK_DOWN);
		robot.keyPress(KeyEvent.VK_ENTER);
		robot.keyRelease(KeyEvent.VK_ENTER);
		System.out.println("Robot Method1");
		

		
	}
	public void keyboard(WebDriver driver,String button) throws AWTException, InterruptedException
	{
	
		Actions action=new Actions(driver);
		action.sendKeys(Keys.valueOf(button)).build().perform();

	}
}
