package test_cases;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MouseHover2 {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver", "src/test/resources/drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.MILLISECONDS);

		// open URL application demoqa
		String url = "https://demoqa.com/slider/";
		driver.get(url);
		driver.manage().window().maximize();

		//retrieve title of the page
		String title = driver.getTitle();
		System.out.println("The title of the page is : " +title);
		
		// perform mouse hover
		Actions actions = new Actions(driver);
		WebElement slider = driver.findElement(By.id("sliderContainer"));
		actions.moveToElement(slider, 50, 0).perform();
		slider.click();
		
		// refresh page
		driver.navigate().refresh();
		Thread.sleep(2000);
		
		// back
		driver.navigate().back();
		Thread.sleep(2000);
		
		// forward
		driver.navigate().forward();
		Thread.sleep(2000);

		// close navigator
		// driver.close();

	}

}
