package day10;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class script9 {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.get("https://demo.automationtesting.in/Register.html");
		//driver.manage().window().fullscreen();		
		driver.manage().window().maximize();

		
//		WebElement dropdown = driver.findElement(By.id("Skills"));
//		
//		Select select = new Select(dropdown);
//		
//		System.out.println(select.isMultiple());
//		System.out.println(select.getFirstSelectedOption().getText());
//
//		Thread.sleep(1000);
//		select.selectByVisibleText("Android");
//		System.out.println(select.getFirstSelectedOption().getText());
//		
//		Thread.sleep(1000);
//		select.selectByValue("Art Design");
//		System.out.println(select.getFirstSelectedOption().getText());
//		
//		Thread.sleep(1000);
//		select.selectByIndex(9);
//		System.out.println(select.getFirstSelectedOption().getText());
//		
//		List<WebElement> list = driver.findElements(By.id("Skills"));
//		for(int i=0;i<list.size();i++)
//		{
//			System.out.println(list.get(i).getText());
//		}
		
		List<WebElement> year_list = driver.findElements(By.id("yearbox"));
		
		for(int i=0;i<year_list.size();i++)
		{
			System.out.println(year_list.get(i).getText());
		}
		
		WebElement year = driver.findElement(By.id("yearbox"));
		Select year_select = new Select(year);
		System.out.println(year_select.getFirstSelectedOption().getText());
		year_select.selectByIndex(15);
		System.out.println(year_select.getFirstSelectedOption().getText());
		Thread.sleep(1000);
		
		year_select.selectByValue("1993");
		System.out.println(year_select.getFirstSelectedOption().getText());
		Thread.sleep(1000);
		
		year_select.selectByVisibleText("1971");
		System.out.println(year_select.getFirstSelectedOption().getText());
		
		
//		int i=0;
//		while(!select.getAllSelectedOptions().isEmpty()) {
//			System.out.println(select.getAllSelectedOptions().get(i));
//			i++;
//		}
		
	}

}
