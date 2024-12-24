package day10;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class script3 {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.get("https://www.demoblaze.com/");
		 
		List<WebElement> list = driver.findElements(By.cssSelector("#tbodyid>div>div>div>h4>a"));
		
		System.out.println(list.size());
		
		for(int i=0;i<list.size();i++)
		{
			WebElement listItem = list.get(i);
			System.out.println(listItem.getText());
		}
	}

}
