package test_cases;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Alert {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver", "src/test/resources/drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.MILLISECONDS);

		// open URL application demoqa
		String url = "https://demoqa.com/alerts";
		driver.get(url);
		driver.manage().window().maximize();
		
		// retrieve element with id
		driver.findElement(By.id("alertButton")).click();
		
//		// retrieve element with xpath relative
//		driver.findElement(By.xpath("//button[@type='button']")).click();
		
		// accept alert
		driver.switchTo().alert().accept();

	}

}
