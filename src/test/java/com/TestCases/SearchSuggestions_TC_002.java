package com.TestCases;


import java.awt.AWTException;
import java.io.IOException;
import org.apache.poi.EncryptedDocumentException;
import org.testng.annotations.Test;
import com.PomPages.SearchSuggestions;
import com.TestBase.BaseClass;

public class SearchSuggestions_TC_002 extends BaseClass {

	public SearchSuggestions s;

	@Test
	public void searchSuggestions() throws InterruptedException, AWTException, EncryptedDocumentException, IOException
	{

		s=new SearchSuggestions(driver);
		s.GetData();
		s.validateSearchReuslts();
		logger.info("Search Suggestions Test is passed");

	}
	
}




