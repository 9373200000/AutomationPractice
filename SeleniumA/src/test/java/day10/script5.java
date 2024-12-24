package day10;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class script5 {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
	driver.get("https://www.google.com/");
	
	driver.findElement(By.className("gLFyf")).sendKeys("selenium");
//	driver.findElement(By.name("q")).sendKeys("selenium");

	List<WebElement> sugglist = driver.findElements(By.cssSelector("ul.G43f7e>li>div>*:nth-child(2)>*:first-child>*:first-child>span"));
	System.out.println("Is suggetions are 10 ? "+(sugglist.size()==10));
	
	for(int i=0;i<sugglist.size();i++)
	{
		sugglist = driver.findElements(By.cssSelector("ul.G43f7e>li>div>*:nth-child(2)>*:first-child>*:first-child>span"));
		
		WebElement item = sugglist.get(i);
		System.out.println(item.getText());
		
		if(item.getText().contains("selenium"))
		{
			System.out.println("contains selenium");
		}
		else {
			System.out.println("Not contains selenium");

		}
	}
	

	
	}

}
