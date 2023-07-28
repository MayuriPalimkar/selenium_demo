package com.openMRS.baseClass;

import java.util.concurrent.TimeUnit;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

public class baseclass1 {

	public static WebDriver driver;
	public static Logger logger; // for logging info purpose

	// hardcoded values
	public String BaseURL = "https://demo.guru99.com/V1/index.php";
	public String Username = "mngr517056";
	public String Password = "mynUnAp";
	// public String Chromepath = "";

	@BeforeClass
	public void SetUp() {

		logger = logger.getLogger("Maven_practice1");
		PropertyConfigurator
				.configure("C:\\Users\\Mayuri\\eclipse-workspace\\Maven_practice1\\Configuration\\log4j.properties");

		logger.info("Maven_practice1");
		System.setProperty("Webdriver.Chrome.driver", System.getProperty("User.dir") + "//Driver//chromedriver.exe");
		driver = new ChromeDriver();
		logger.info("open browser");

		driver.manage().window().maximize();
		logger.info("maximize the browser");
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);

		driver.manage().timeouts().pageLoadTimeout(20, TimeUnit.SECONDS);

		driver.get(BaseURL);
		logger.info("open Apllication");
	}

	@AfterClass
	public void TearDown() throws InterruptedException {
		Thread.sleep(5000);
		driver.quit();
	}

}
