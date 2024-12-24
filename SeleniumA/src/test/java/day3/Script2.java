package day3;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Script2 {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		
//		driver.findElement(By.name("username")).sendKeys("Admin");
//		driver.findElement(By.name("password")).sendKeys("admin123");
//		
//		driver.findElement(By.className("orangehrm-login-button")).click();
		String str = driver.findElement(By.cssSelector(".oxd-text oxd-text--p")).getText();
		System.out.println(str);
	}

}

/*
TC2:
open browser and enter url https://opensource-demo.orangehrmlive.com/web/index.php/auth/login
get username and password from the screen 
and try to login into application
*/