package locators_by_index;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class demo3 {


	public static void main(String [] args) throws InterruptedException {
		System.setProperty("Webdriver.Chrome.driver", "C:\\Users\\Mayuri\\eclipse-workspace\\selenium\\resource");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.myntra.com/?");
		String title = driver.getTitle();
		System.out.println(title);
		
		//driver.findElement(By.xpath(""))
		Thread.sleep(5000);
		driver.close();
		
}
}