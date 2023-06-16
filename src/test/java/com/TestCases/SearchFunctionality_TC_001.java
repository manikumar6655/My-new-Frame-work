package com.TestCases;


import org.apache.poi.EncryptedDocumentException;
import org.testng.annotations.Test;
import com.TestBase.BaseClass;


public class SearchFunctionality_TC_001 extends BaseClass{




	public com.PomPages.SearchFunctionality sf;


	@Test
	public void SearchFunctionality() throws EncryptedDocumentException, Throwable
	{
		sf=new com.PomPages.SearchFunctionality(driver);
		sf.getData();
		sf.validateSearchReuslts();
		logger.info("Search Functionality Test is Passed");
		
	}


}









