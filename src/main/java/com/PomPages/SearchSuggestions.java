package com.PomPages;

import java.awt.AWTException;
import java.io.IOException;
import org.apache.poi.EncryptedDocumentException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import com.TestBase.BaseClass;
import com.Utilities.ExcelFile;
import com.Utilities.Validations;



public class SearchSuggestions extends BaseClass {

	Validations v=new Validations();
	ExcelFile excel=new ExcelFile();


	public SearchSuggestions(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = "//textarea[@id='APjFqb']")WebElement textbox;
	
	//validation WebElements
	//@FindBy(xpath = "//span[text()='Amazon']")WebElement text;
	@FindBy(xpath = "//textarea[@value=\"amazon\"]")WebElement text;
	//@FindBy(id = "APjFqb")WebElement value;
	@FindBy(xpath = "//h3[text()='Amazon.in']")WebElement value;




	public void GetData() throws InterruptedException, AWTException, EncryptedDocumentException, IOException
	{
		
		//String data=excel.readDataFromExcel("Amazon", 1, 1);

		textbox.sendKeys("Amz");
		ut.sleep();
		ut.keyboard(driver,"ARROW_DOWN");
		ut.keyboard(driver,"ENTER");
		ut.sleep();
		
	}
	
	
	public void validateSearchReuslts() throws InterruptedException
	{

		//v.contains(value, driver, "Amazon", "Validation is passed", "Validation is failed");
		v.Displayed(text, driver, "Validation is passed", "Validation is failed");
//		v.equals(value, "amazon - Google Search", driver, "Validation is passed", "Validation is failed");

		
	}
}
