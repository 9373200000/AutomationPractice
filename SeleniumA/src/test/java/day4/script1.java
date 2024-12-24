package day4;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class script1 {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver(); 
	       driver.get("https://www.gmail.com"); 

	       //By ID
	       //driver.findElement(By.id("identifierId")).sendKeys("hello");
	       //driver.findElement(By.cssSelector("input#identifierId")).sendKeys("HElllo");
	       //driver.findElement(By.cssSelector("#identifierId")).sendKeys("hello")
	       
	       //By Class
	       //driver.findElement(By.className("whsOnd")).sendKeys("Cola");
	       //driver.findElement(By.cssSelector("input.whsOnd")).sendKeys("jdjjdj");
	       //driver.findElement(By.cssSelector(".whsOnd")).sendKeys("kkk");
	       
	       //By Attribute
	       //driver.findElement(By.name("identifier")).sendKeys("hhh");
	       //driver.findElement(By.cssSelector("input[name= identifier]")).sendKeys("hhhkk");
	       driver.findElement(By.cssSelector("input.whsOnd[name= identifier]")).sendKeys("dd");
	       
	}

}
