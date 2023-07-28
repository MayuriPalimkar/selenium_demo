package Listbox;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class redbus_dynamic_listbox {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("Webdriver.Chrome.driver", "C:\\Users\\Mayuri\\eclipse-workspace\\selenium\\resource");
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		
		driver.get("https://www.redbus.in/");
		Thread.sleep(4000);
		driver.findElement(By.id("src")).sendKeys("Pune");
		Thread.sleep(7000);
		
	    List<WebElement> fromcity =	driver.findElements(By.xpath("//text[@class=\"placeHolderMainText\"]"));
		 Thread.sleep(3000);
		 
		 System.out.println("Total cities-->"+fromcity.size());
		 Thread.sleep(3000);
		 
		 //to print all the cities in list
		 for(int i =0; i< fromcity.size(); i++) {
			String citylist= fromcity.get(i).getText();
			System.out.println("citylist="+citylist);
			
			//to select the specific city
			if(citylist.equals("Warje")) {
				Thread.sleep(3000);
				fromcity.get(i).click();
				break;
			}
			
		 }
	
		 //to select destination city
		 
		 driver.findElement(By.id("dest")).sendKeys("Mumbai");
		 Thread.sleep(4000);
		 
		List<WebElement> destcity =driver.findElements(By.xpath("//text[@class=\"placeHolderMainText\"]"));
		Thread.sleep(3000);
		System.out.println("Total count city-->"+destcity.size());
		Thread.sleep(2000);
		
		for(int i =0; i< destcity.size(); i++) {
			String cities=destcity.get(i).getText();
			System.out.println("total cities="+cities);
			
			if(cities.equals("Vashi")) {
				Thread.sleep(3000);
				destcity.get(i).click();
				break;
			}
		}
		
		
		/*driver.findElement(By.id("onwardCal")).click();
		driver.findElement(By.xpath("//text[@class=\"dateText\"]")).sendKeys("15 jun");
		
		 */
		 
		 

}
}