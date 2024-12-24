package day12;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class script1 {

	public static void main(String[] args) {
		// get price of Sony xperia z5 using child to parent path.

		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.get("https://www.demoblaze.com/#");
		
		WebElement elt = driver.findElement(By.xpath("//div[h4[a[text()='Sony xperia z5']]]/h5"));
		String a = elt.getText();
		System.out.println(a);
	}

}
