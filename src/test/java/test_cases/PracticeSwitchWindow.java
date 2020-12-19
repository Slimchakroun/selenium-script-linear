package test_cases;

import java.util.Set;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class PracticeSwitchWindow {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "src/test/resources/drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.MILLISECONDS);

		// Open URL application
		String url="https://demoqa.com/browser-windows";
		driver.get(url);
		driver.manage().window().maximize();
		
		// Store and print the name of the first window
		String handle = driver.getWindowHandle();
		System.out.println(handle);
		
		// Click on the button "New window message"
		driver.findElement(By.id("messageWindowButton")).click();
		
		// Store and print the name of the windows open
		Set handles = driver.getWindowHandles();
		System.out.println(handles);
		
		// Pass a window handle to other window
		for(String handle1:driver.getWindowHandles()) {
			System.out.println(handle1);
			driver.switchTo().window(handle1);
		}
		
		//driver.quit();

	}

}
