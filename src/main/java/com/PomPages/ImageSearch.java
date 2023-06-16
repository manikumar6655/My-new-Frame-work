package com.PomPages;

import java.awt.AWTException;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.sl.usermodel.TextBox;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.TestBase.BaseClass;
import com.Utilities.ExcelFile;
import com.Utilities.webdriverUtilities;

public class ImageSearch extends BaseClass{

	ExcelFile excel=new ExcelFile();

	
	public ImageSearch(WebDriver driver)
	{
		
		this.driver=driver;
		PageFactory.initElements(driver, this);
		
	}
	
	@FindBy(xpath = "//a[text()='Images']")WebElement imagebtn;
	
	@FindBy(xpath = "//textarea[@id=\"APjFqb\"]") WebElement textbox;
	
	//validation webElements
	//@FindBy(xpath ="//img[@class='lnXdpd']")WebElement image;
	@FindBy(xpath = "//img[@alt=\"Google Images\"]")WebElement image;
	@FindBy(xpath = "//input[@value=\"Amazon\"]")WebElement value;
	@FindBy(xpath = "//span[text()='Images']")WebElement button;

	

	
	

	
	public void getData() throws InterruptedException, AWTException, EncryptedDocumentException, IOException
	{
		String data=excel.readDataFromExcel("Amazon", 0, 0);
		imagebtn.click();
		ut.sleep();
		textbox.sendKeys(data);
		ut.sleep();
		ut.robot();
		

	}
	
	public void validation() throws InterruptedException
	{
		//v.Displayed(button, driver, "Validation passed", "Validarion is failed");
		//v.Displayed(image, driver, "Validation passed", "Validarion is failed");
		//v.contains(imagebtn, driver, "Images","Validation passed", "Validarion is failed");
		v.containsTittle(imagebtn, driver, "Validation passed", "Validation is failed");
	}

}
