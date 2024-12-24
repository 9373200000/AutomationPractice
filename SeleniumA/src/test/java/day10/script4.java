package day10;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class script4 {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.get("https://www.demoblaze.com");
		
		List<WebElement> list_name = driver.findElements(By.cssSelector("#tbodyid>div>div>div>h4>a"));
		List<WebElement> list_price = driver.findElements(By.cssSelector("#tbodyid>div>div>div>h5"));
		
		for(int i=0;i<list_name.size();i++)
		{
			WebElement name = list_name.get(i);
			WebElement price = list_price.get(i);
			
			System.out.println(name.getText()+" -------> "+price.getText());
		}

	}

}
