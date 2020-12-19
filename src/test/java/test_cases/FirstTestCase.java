package test_cases;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class FirstTestCase {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "src/test/resources/drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.MILLISECONDS);
		
		WebDriverWait wait=new WebDriverWait(driver, 20);

		// open URL application orangeHRM
		String url="https://opensource-demo.orangehrmlive.com/";
		driver.get(url);
		Thread.sleep(2000);
		driver.manage().deleteAllCookies();
		driver.manage().window().maximize();

		// fill username
		driver.findElement(By.id("txtUsername")).sendKeys("Admin");
		Thread.sleep(2000);
		
//		// retrieve element with xpath relative
//		driver.findElement(By.xpath("//input[@name='txtUsername']"))
		
		//fill password
		driver.findElement(By.id("txtPassword")).sendKeys("admin123");
		Thread.sleep(2000);
		
//		// retrieve element with xpath relative
//		driver.findElement(By.xpath("//input[@name='txtPassword']")).sendKeys("admin123");
		
		//click login button
		WebElement btnLogin;
		btnLogin = wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("btnLogin")));
		btnLogin.click();
		Thread.sleep(2000);
		
		// click login button  (xpath relative: //input[@value='LOGIN'])
		
		//print successfull message
		System.out.println("successfully authentification");
		
		
		//kill browser
		driver.quit();
	}

}
