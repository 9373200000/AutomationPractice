package day2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class Assignment_2_1 {

	public static void main(String[] args) {
//		WebDriver wd = new EdgeDriver();
//		wd.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
//		
//		WebElement user_field = wd.findElement(By.name("username"));
//		user_field.clear();
//		user_field.sendKeys("Admin");
//		
//		WebElement pass_field = wd.findElement(By.name("password"));
//		pass_field.clear();
//		pass_field.sendKeys("admin123");
//		
//		WebElement bt = wd.findElement(By.className("orangehrm-login-button"));
//				//oxd-button oxd-button--medium oxd-button--main orangehrm-login-button
//		bt.click();
//		
//		String current_url = wd.getCurrentUrl();
//		System.out.println("Login scussful or not->"+current_url.endsWith("index"));
		
		
		WebDriver driver=new EdgeDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		
		//identify username input field
		WebElement usernameInputField=driver.findElement(By.name("username"));
		//type user name as 'standard_user' into username input field
		usernameInputField.clear();
		usernameInputField.sendKeys("Admin");
		
		//identify password input field
		WebElement passwordInputField=driver.findElement(By.name("password"));
		passwordInputField.clear();
		passwordInputField.sendKeys("admin123");
		
		//identify login button
		WebElement loginButton=driver.findElement(By.className("oxd-button"));
		loginButton.click();
		
		String currentUrl=driver.getCurrentUrl();		
		System.out.println("Login successfull or not? "+currentUrl.endsWith("index"));

	}

}
/*
 TC1:
Open browser
enter application url as https://opensource-demo.orangehrmlive.com/web/index.php/auth/login
enter username as Admin
enter password as admin123
click login button
validate login is successful or not
click on profile icon
click logout link
close the browser
 */
 