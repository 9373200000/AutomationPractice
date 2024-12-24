package day11;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class script3 {

	public static void main(String[] args) {

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.get("https://sampleapp.tricentis.com/101/index.php");
		
		driver.findElement(By.id("nav_motorcycle")).click();
		
		//Make
		driver.findElement(By.id("make")).click();
		Select make_Select = new Select(driver.findElement(By.id("make")));
		make_Select.selectByIndex(3);
		
		//Model
		driver.findElement(By.id("model")).click();
		Select model_Select = new Select(driver.findElement(By.id("model")));
		model_Select.selectByIndex(3);
		
		driver.findElement(By.id("cylindercapacity")).sendKeys("120");
		driver.findElement(By.id("engineperformance")).sendKeys("140");
		driver.findElement(By.id("dateofmanufacture")).sendKeys("06/19/2024");
		
		//Seats
		driver.findElement(By.id("numberofseatsmotorcycle")).click();
		Select seats_select = new Select(driver.findElement(By.id("numberofseatsmotorcycle")));
		seats_select.selectByIndex(1);
		
		driver.findElement(By.id("listprice")).sendKeys("1200");
		driver.findElement(By.id("annualmileage")).sendKeys("120");
		
		driver.findElement(By.id("nextenterinsurantdata")).click();
		
		System.out.println("--------------------------------------");
		
		driver.findElement(By.id("firstname")).sendKeys("Sanjana");
		driver.findElement(By.id("lastname")).sendKeys("Sanju");
		driver.findElement(By.id("birthdate")).sendKeys("03/03/1994");
		
		//System.out.println(driver.findElement(By.cssSelector("input[id='gendermale']")).isEnabled());

		driver.findElement(By.id("streetaddress")).sendKeys("Address america");
		
		driver.findElement(By.id("country")).click();
		Select country_select = new Select(driver.findElement(By.id("country")));
		country_select.selectByVisibleText("Bermuda");
		
		driver.findElement(By.id("zipcode")).sendKeys("511090");
		driver.findElement(By.id("city")).sendKeys("Pune");
		
		driver.findElement(By.id("occupation")).click();
		Select occupation_select = new Select(driver.findElement(By.id("occupation")));
		occupation_select.selectByIndex(3);
		
		driver.findElement(By.id("website")).sendKeys("https://www.google.com/");
		
		driver.findElement(By.id("nextenterproductdata")).click();
		
		System.out.println("--------------------------------------");

		driver.findElement(By.id("startdate")).sendKeys("01/31/2025");
		
		driver.findElement(By.id("insurancesum")).click();
		Select insurance_select = new Select(driver.findElement(By.id("insurancesum")));
		insurance_select.selectByIndex(5);
		
		driver.findElement(By.id("damageinsurance")).click();
		Select damage_select = new Select(driver.findElement(By.id("damageinsurance")));
		damage_select.selectByValue("No Coverage");
		
		driver.findElement(By.id("nextselectpriceoption")).click();
		
	}

}
