package day10;

import java.io.FileInputStream;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class script1 {

	public static void main(String[] args) throws IOException{
		
		//Load input file
		FileInputStream fis = new FileInputStream(".\\src\\test\\resources\\AppData.properties");
		Properties prop = new Properties();
		prop.load(fis);
		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.get(prop.getProperty("appUrl"));
		
		driver.findElement(By.name("username")).sendKeys(prop.getProperty("username"));
		
		driver.findElement(By.name("password")).sendKeys(prop.getProperty("password"));
		
		driver.findElement(By.className("orangehrm-login-button")).click();
		
		driver.findElement(By.className("oxd-userdropdown-tab")).click();
		
 		driver.findElement(By.linkText("Logout")).click();

	}

}
