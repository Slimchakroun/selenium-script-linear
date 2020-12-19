package test_cases;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DragAndDrop {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver", "src/test/resources/drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.MILLISECONDS);

		// open URL application demoqa
		String url = "https://demoqa.com/droppable/";
		driver.get(url);
		driver.manage().window().maximize();

		Actions actions = new Actions(driver);
		WebElement from = driver.findElement(By.id("draggable"));
		WebElement to = driver.findElement(By.id("droppable"));
		actions.dragAndDrop(from, to).perform();

		// verify text changed into dropped!
		String textTo = to.getText();
		if (textTo.equals("Dropped!")) {
			System.out.println("Pass : Source is dropped to target as expected");

		} else {
			System.out.println("Fail : Source couldn't dropped to target as expected");
		}
		
	}

}
