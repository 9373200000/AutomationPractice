package day11;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class script2 {

	public static void main(String[] args) throws InterruptedException {
	
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.manage().window().maximize();
		driver.get("https://demoqa.com/select-menu");

		driver.findElement(By.cssSelector("#withOptGroup>div>*:first-child>*:first-child")).click();
		
		List<WebElement> list = driver.findElements(By.cssSelector("div[id^='react-select-2-option']"));
		System.out.println(list.size());
		for(WebElement e:list)
		{
			System.out.println(e.getText());
		}
		list.get(2).click();
		
		
//		Thread.sleep(10000);
//		driver.quit();
	}

}
