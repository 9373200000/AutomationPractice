package day1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class Assignment {

	public static void main(String[] args) {
		String expectedData = "";
		String actualData = "";

		WebDriver driver=new EdgeDriver();
//		driver.get("https://sampleapp.tricentis.com/101/app.php");
//		expectedData = "https://sampleapp.tricentis.com/101/app.php";
//		actualData = driver.getCurrentUrl();
//		System.out.println("is registration URL entered correctly? "+expectedData.equals(actualData));
		
		driver = new ChromeDriver();
		expectedData = "Swag Labs";
		actualData = driver.getTitle();
		System.out.println("is registration page opened? "+expectedData.equals(actualData));
		
		//driver.quit();
	}

}
