package test_cases;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MouseHover {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver", "src/test/resources/drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.MILLISECONDS);

		// open URL application demoqa
		String url = "https://demoqa.com/menu/";
		driver.get(url);
		driver.manage().window().maximize();
		
		//perform mouse hover
		Actions actions = new Actions (driver);
		WebElement mouseHover = driver.findElement(By.xpath("//*[contains(text(), 'Main Item 2')]")); //a[contains(text(),'Main Item 2')] //*[@id=\"nav\"]/li[2]/a"
		actions.moveToElement(mouseHover).perform();
		
		//close navigator
		//driver.close();

	}

}
