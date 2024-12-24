package day2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

public class Assignment_2_2 {

	public static void main(String[] args) {
		
		WebDriver driver = new EdgeDriver();
		driver.get("https://demowebshop.tricentis.com/");
		
		WebElement clickLogin = driver.findElement(By.linkText("Log in"));
		clickLogin.click();
		
		WebElement username_Field = driver.findElement(By.id("Email"));
		username_Field.sendKeys("tester01@vomoto.com");
		
		WebElement password_field = driver.findElement(By.id("Password"));
		password_field.sendKeys("Abc@12345");

		WebElement login_button = driver.findElement(By.className("login-button"));
		login_button.click();
		
		String title = driver.getTitle();
		if(title.equals("Demo Web Shop"))
			System.out.println("Login successfull");
		else
			System.out.println("Login Fail");
		
	}

}

/*
TC2:
Open browser
enter application url as https://demowebshop.tricentis.com/
click on login
enter username as tester01@vomoto.com
enter password as Abc@12345
click on login button
validate login is done or not
click on logout
close the browser


*/