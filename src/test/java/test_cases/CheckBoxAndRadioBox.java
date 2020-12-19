package test_cases;


import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CheckBoxAndRadioBox {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "src/test/resources/drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.MILLISECONDS);

		// Open URL application
		String url="https://demoqa.com/automation-practice-form";
		driver.get(url);
		driver.manage().window().maximize();
		
		// CheckBox
		WebElement hobbiesSports = driver.findElement(By.xpath("//label[contains(text(),'Sports')]"));
		hobbiesSports.click();
		
		// RadioBox
//		Select radio = new Select(driver.findElement(By.id("gender-radio-1")));
//		radio.selectByValue("Male");
		WebElement radio = driver.findElement(By.xpath("//input[@id='uploadPicture']"));
		Boolean isRadioSelected = radio.isEnabled();
		System.out.println(isRadioSelected);
		
//		// Scroll
//		for (int second =0;;second++) {
//			if(second>=60) {
//				break;
//			}
			((JavascriptExecutor)driver).executeScript("window.scrollBy(0,200)","");
//		}
				
		//driver.quit();

	}

}
