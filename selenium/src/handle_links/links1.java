package handle_links;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class links1 {

	public static void main(String[] args) {
		System.setProperty("webdriver.Chrome.driver", "C:\\Users\\Mayuri\\eclipse-workspace\\selenium\\resource");
		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://www.amazon.in/");
		
		//to find all the links use tagname
		
		List<WebElement> links=driver.findElements(By.tagName("a"));
		System.out.println("total links-->"+links.size());
		
		for(WebElement link : links) {
			System.out.println(link.getAttribute("href"));
		}

	}

}
