package com.openMRS.TestCases;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.openMRS.PageClasses.Login_page;
import com.openMRS.baseClass.baaseclass2;
import com.openMRS.baseClass.baseclass1;

public class TC_logintest_001 extends baaseclass2 {

	@Test
	public void loginTest() throws InterruptedException {
	 Login_page TL = new  Login_page(); 
	 
	 TL.setUsername(Username);
	 Thread.sleep(3000);
	 logger.info("Enter the Username");
	 TL.setPassword(Password);
	 
	 Thread.sleep(3000);
	 logger.info("Enter the Password");
	 
	 TL.Clickbtn();
	 logger.info("click on the button");
	 
	 String title = driver.getTitle();
	 
	 if(title.equals("GTPL Bank Manager HomePage")) {
		 Assert.assertTrue(false);
		 logger.info("test case passed");
	 }else {
		 Assert.assertTrue(false);
		 logger.info("test case failed");
	 }
	
}
}