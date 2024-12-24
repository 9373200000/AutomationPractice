package day10;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class script8 {

	public static void main(String[] args) {

		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.get("https://www.gsmarena.com");
		
		driver.findElement(By.cssSelector("div.brandmenu-v2>ul>li>a")).click();

		List<WebElement> list = driver.findElements(By.cssSelector("div.makers>ul>li>a>strong>span"));
		
		for(int i=0;i<list.size();i++)
		{
			WebElement item = list.get(i);
			System.out.println(item.getText());
		}
	}

}
