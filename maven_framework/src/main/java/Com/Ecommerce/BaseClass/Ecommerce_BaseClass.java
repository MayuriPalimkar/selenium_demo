package Com.Ecommerce.BaseClass;

import java.util.concurrent.TimeUnit;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import Com.Ecommerce.Configuration.ReadCofiguration;

public class Ecommerce_BaseClass {

	public static WebDriver driver;
	public static Logger logger;
	
	
	ReadCofiguration RC = new ReadCofiguration();
	public String BaseURL = RC.getApplicationURL();
	public String Username = RC.Username();
	public String Password = RC.password();
	public String Chromepath = RC.getChromePath();


	@BeforeMethod
	public void initialization() {

		System.setProperty("Webdriver.Chrome.driver", "ChromePath");

		logger = logger.getLogger("maven_framework");
		PropertyConfigurator.configure("C:\\Users\\Mayuri\\eclipse-workspace\\maven_framework\\Configuration\\log4j.properties");
		driver = new ChromeDriver();
        logger.info("Open Browser");
        
		driver.manage().window().maximize();
		logger.info("maximize the browser");
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);

		driver.manage().timeouts().pageLoadTimeout(20,TimeUnit.SECONDS );
		driver.get(BaseURL);
		logger.info("Open application");
		
	}
	
	@AfterMethod
	public void TearDown() throws InterruptedException {
		Thread.sleep(3000);
		driver.quit();
	}
}
