package day10;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class script2 {

	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.demoblaze.com/");
		
		//driver.findElement(By.linkText("Contact")).click();
		//driver.findElement(By.partialLinkText("Cont")).click();
		
		List<WebElement> links = driver.findElements(By.tagName("a"));
		System.out.println("-->"+links);
		System.out.println("-->"+links.size());
		
		for(int i = 0;i<links.size();i++)
		{
			System.out.println(links.get(i));
			WebElement link = links.get(i);
			System.out.println(link.getAttribute("href"));
		}
	}

}
