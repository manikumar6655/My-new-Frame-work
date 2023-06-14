package com.TestCases;

import static org.testng.Assert.assertTrue;

import org.apache.poi.EncryptedDocumentException;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import com.PomPages.SearchFunctionality;
import com.TestBase.BaseClass;
import com.Utilities.webdriverUtilities;

public class SearchFunctionality_TC_001 extends BaseClass{




	public webdriverUtilities ut=new webdriverUtilities();
	public SearchFunctionality sf;


	@Test
	public void SearchFunctionality() throws EncryptedDocumentException, Throwable
	{
		sf=new SearchFunctionality(driver);

		sf.getData();
		
	}

	@Test
	public void validations() throws InterruptedException
	{

		sf=new SearchFunctionality(driver);
		sf.validateSearchReuslts();
	}

}









