package test_cases;

import java.util.concurrent.TimeUnit;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FileUploadDemo {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "src/test/resources/drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.MILLISECONDS);

		// Open URL application
		String url="http://demo.guru99.com/test/upload/";
		driver.get(url);
		driver.manage().window().maximize();
		
		WebElement uploadElement = driver.findElement(By.id("uploadfile_0"));
		uploadElement.sendKeys("C:\\Users\\Utilisateur\\Desktop\\work 2020\\Slim CHAKROUN - ISTQB® certified.JPG");
		driver.findElement(By.id("terms")).click();
		driver.findElement(By.id("submitbutton")).click();
		Thread.sleep(2000);

		
		// Assert
		String uploadMessage = driver.findElement(By.xpath("//*[@id=\"res\"]/center")).getText();
		Assert.assertTrue(uploadMessage.contains("successfully "));

	}

}
