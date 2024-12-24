package day2;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class Assignment_2_3 {

	public static void main(String[] args) {
		
		WebDriver driver = new EdgeDriver();
		driver.get("https://www.opencart.com/index.php?route=account/login");

	}

}
/*
TC3:
Open browser
enter application url as https://www.opencart.com/index.php?route=account/login
validate login page opened or not
close browser
*/