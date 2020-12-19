package test_cases;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToolTypDemo {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "src/test/resources/drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.MILLISECONDS);

		// Open URL application
		String url="https://demoqa.com/tool-tips/";
		driver.get(url);
		driver.manage().window().maximize();
		
		WebElement message = driver.findElement(By.id("toolTipButton"));
		String toolTypText = message.getText();
		
		if(toolTypText.equalsIgnoreCase("Hover me to see")) {
			System.out.println("Pass : ToolTyp matching expected value");
		} else {
			System.out.println("Fail : ToolTyp not matching expected value");
		}
		
		WebElement placeHolder = driver.findElement(By.id("toolTipTextField"));
		String textPlaceHolder = placeHolder.getAttribute("placeholder");
		System.out.println("PlaceHolder is : " +textPlaceHolder);
		
		// Close navigator
		//driver.quit();
 
	}

}
