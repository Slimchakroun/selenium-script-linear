package test_cases;

import java.util.concurrent.TimeUnit;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;


public class RightClickDemo {

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
		WebElement btnRightClick = driver.findElement(By.id("rightClickBtn"));
		actions.contextClick(btnRightClick).perform();
		
		//Assert
		String rightClickMessage = driver.findElement(By.id("rightClickMessage")).getText();
		Assert.assertEquals("You have done a right click", rightClickMessage );
		
		System.out.println("I do my job");
		
		//Kill browser
		driver.quit();

	}

}
