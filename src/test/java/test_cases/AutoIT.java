package test_cases;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class AutoIT {

	public static WebDriverWait wait;

	public static void main(String[] args) throws InterruptedException, IOException {

		System.setProperty("webdriver.chrome.driver", "src/test/resources/drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		wait = new WebDriverWait(driver, 20);

		// Open url application
		driver.get("https://www.zamzar.com/");
		driver.manage().window().maximize();

		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//button[@class='btn btn-default btn-lg']")));
		driver.findElement(By.xpath("//button[@class='btn btn-default btn-lg']")).click();

		// Upload file with AutoIT
		Runtime.getRuntime().exec("C:\\Users\\Utilisateur\\Desktop\\Formation Selenium\\AutoIT\\FileUpload3.exe");

	}

}
