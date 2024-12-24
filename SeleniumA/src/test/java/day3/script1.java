package day3;

import org.openqa.selenium.By;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class script1 {

	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://demowebshop.tricentis.com/login");
		
		driver.findElement(By.className("login-button")).click();
		
		WebElement errorMsg = driver.findElement(By.className("validation-summary-errors"));
		Point errorMsg_cordinates = errorMsg.getLocation();
		int x = errorMsg_cordinates.getX();
		int y = errorMsg_cordinates.getY();
		
		System.out.println("Error msg=>"+x+" "+y);
		
		WebElement email = driver.findElement(By.className("email"));
		Point email_coordinbates = email.getLocation();
		int x1 = email_coordinbates.getX();
		int y1 = email_coordinbates.getY();		
		
		System.out.println("Email msg=>"+x1+" "+y1);

		System.out.println("1) Is error message displayed above email??? "+(y<y1));
		
		WebElement error_details = driver.findElement(By.className("validation-summary-errors"));
		System.out.println("2) Error message font-family => "+error_details.getCssValue("font-family"));
		System.out.println("3) Error message font-size => "+error_details.getCssValue("font-size"));
		System.out.println("2) Error message color => "+error_details.getCssValue("color"));
	}

}

/*
TC1:
open browser and url https://demowebshop.tricentis.com/login
click on login button
validate:
	error msg is getting displayed above email id input field
	error msg color
	error msg font-size
	error msg font-family
*/