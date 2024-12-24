package day11;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class script1 {

	public static void main(String[] args) throws InterruptedException {

		WebDriver driver = new ChromeDriver();
		//driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.get("https://demoqa.com/select-menu");
		
		WebElement dropdown = driver.findElement(By.id("cars"));
		Select select = new Select(dropdown);
		
		System.out.println(select.getAllSelectedOptions().size());
		System.out.println(select.getOptions().size());
		
		List<WebElement> list = driver.findElements(By.id("cars"));
		for(int i=0;i<list.size();i++)
		{
			System.out.println(list.get(i).getText());
		}
		
		select.selectByIndex(1);
		select.selectByValue("saab");
		select.selectByVisibleText("Audi");

		System.out.println(select.getFirstSelectedOption().getText());
		
		Thread.sleep(1000);
		System.out.println(select.getAllSelectedOptions().size());
		System.out.println(select.getOptions().size());
		System.out.println(select.isMultiple());

		select.deselectAll();
		
		driver.quit();
	}

}
