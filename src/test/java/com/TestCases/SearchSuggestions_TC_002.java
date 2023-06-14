package com.TestCases;

import static org.testng.Assert.assertTrue;

import java.awt.AWTException;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import com.PomPages.SearchSuggestions;
import com.TestBase.BaseClass;
import com.Utilities.webdriverUtilities;

public class SearchSuggestions_TC_002 extends BaseClass {

	public SearchSuggestions s;

	@Test
	public void searchSuggestions() throws InterruptedException, AWTException, EncryptedDocumentException, IOException
	{

		s=new SearchSuggestions(driver);
		s.GetData();
		s.validateSearchReuslts();

	}
	
	
	
}




