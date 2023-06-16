package com.PomPages;


import java.awt.AWTException;

import org.apache.poi.EncryptedDocumentException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.TestBase.BaseClass;
import com.Utilities.ExcelFile;
import com.Utilities.Validations;

public class SearchFunctionality extends BaseClass{

	
	Validations v=new Validations();
	ExcelFile excel=new ExcelFile();
	
	
	public  SearchFunctionality(WebDriver driver)
	{
		
		this.driver=driver;
		PageFactory.initElements(driver, this);
		
	}
	
	@FindBy(xpath = "//textarea[@id=\"APjFqb\"]")public WebElement textbox;
	@FindBy(xpath = "//div[@class=\"FPdoLc lJ9FBc\"]//input[@value=\"Google Search\"]")WebElement googleSearch;
	
	//Validation WebElements 
	@FindBy(xpath = "//textarea[@value='Amazon']")
	 WebElement  value;
	@FindBy(xpath = "//h3[text()='Amazon.in']") WebElement element;
	@FindBy(xpath = "//span[text()='Amazon']") WebElement text;
	
	
	

	public void getData() throws InterruptedException, AWTException, EncryptedDocumentException, Throwable
	{
		String data=excel.readDataFromExcel("Amazon", 0, 0);
		ut.sendKeys(textbox,data);
		ut.robot();	
	}
	
	public void validateSearchReuslts() throws InterruptedException
	{
		v.contains(value,driver, "Amazon","Validation is passed", "Validation is failed");
		v.Displayed(element,driver, "Validation is passed", "Validation is failed");
	}

}
