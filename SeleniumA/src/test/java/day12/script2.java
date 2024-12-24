package day12;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class script2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver = new EdgeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
//		driver.get("https://www.flipkart.com/samsung-mobile-store?otracker=nmenu_sub_Electronics_0_Samsung");
		
		//Answer
//		driver.get("https://www.amazon.in/gift-card-store/b?ie=UTF8&node=3704982031");
//		driver.findElement(By.xpath("//a[span[text()='Anniversary']]/div/label")).click();

		//try
//		driver.findElement(By.xpath("//li[span[a[div[label[input[@id='apb-browse-refinements-checkbox_32']]]]]]")).click();
//		driver.findElement(By.id("apb-browse-refinements-checkbox_30")).click();
		
		driver.get("https://www.amazon.in/gp/browse.html?node=3704982031&ref_=nav_em_sbc_gc_all_0_2_19_2");
	}

}


