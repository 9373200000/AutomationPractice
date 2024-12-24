package day11;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class RadioAndCheckbox {

	public static void main(String[] args) throws InterruptedException {
	
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.manage().window().maximize();
//		driver.get("https://login.yahoo.com/");
//		driver.findElement(By.cssSelector(".checkbox-container>label")).click();
		

//		driver.get("https://demo.guru99.com/test/radio.html");
//		WebElement radio1 = driver.findElement(By.id("vfb-7-1"));
//		radio1.click();
		
		driver.get("https://sampleapp.tricentis.com/101/index.php");
		driver.findElement(By.id("nav_motorcycle")).click();
		driver.findElement(By.linkText("Enter Insurant Data")).click();
		WebElement radio1 = driver.findElement(By.id("gendermale"));
		radio1.click();
		
	}

}
