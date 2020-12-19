package test_cases;

import java.util.concurrent.TimeUnit;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DoubleClickDemo {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver", "src/test/resources/drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.MILLISECONDS);

		// open URL application demoqa
		String url = "https://demoqa.com/buttons";
		driver.get(url);
		driver.manage().window().maximize();

		// instantiate action class
		Actions actions = new Actions(driver);
		// retrieve web element to perform double click
		WebElement btnDoubleClick = driver.findElement(By.id("doubleClickBtn"));
		actions.doubleClick(btnDoubleClick).build().perform();

		// storage
		String doubleClickMessage = driver.findElement(By.id("doubleClickMessage")).getText();

		Assert.assertTrue(doubleClickMessage.contains("double click")); // Boolean : true /false
		
		System.out.println("Button is double clicked");

		// Kill browser
		driver.quit();

	}

}
