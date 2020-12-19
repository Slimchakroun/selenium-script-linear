package test_cases;

import java.util.concurrent.TimeUnit;
import java.util.regex.Pattern;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Calculator {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver", "src/test/resources/drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.MILLISECONDS);

		// open URL 
		String url = "https://juliemr.github.io/protractor-demo/";
		driver.get(url);
		driver.manage().window().maximize();

		driver.findElement(By.xpath("//input[@ng-model='first']")).sendKeys("6");
		driver.findElement(By.xpath("//input[@ng-model='second']")).sendKeys("4");
		driver.findElement(By.id("gobutton")).click();
		WebElement result = driver.findElement(By.tagName("h2"));
		WebDriverWait wait = new WebDriverWait(driver, 20);
		// Solution
		Pattern pattern = Pattern.compile("\\d+");
		wait.until(ExpectedConditions.textMatches(By.tagName("h2"), pattern));
		System.out.println("The result is : " +result.getText());
		
		driver.quit();
	}

}
