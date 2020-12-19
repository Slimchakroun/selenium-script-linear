package test_cases;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebElementCommands {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "src/test/resources/drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.MILLISECONDS);

		// open URL application orange
		String url = "https://opensource-demo.orangehrmlive.com/";
		driver.get(url);
		driver.manage().window().maximize();

		driver.findElement(By.id("txtUsername")).sendKeys("Admin");
		WebElement element = driver.findElement(By.id("txtUsername"));
		String attValue = element.getAttribute("id");
		System.out.println(" The id attribute is :" +attValue);
		driver.findElement(By.id("txtUsername")).clear();

		driver.findElement(By.id("txtPassword")).sendKeys("admin123");
		WebElement element2 = driver.findElement(By.id("txtPassword"));
		Dimension dimensions = element2.getSize();
		System.out.println("Hight: " +dimensions.height + " Width: " +dimensions.width);
		driver.findElement(By.id("txtPassword")).clear();

		Point points = element2.getLocation();
		System.out.println("X coordinate: " +points.x + "Y coordinate: " +points.y);

		// verifier si le boutton login est affiché vrai/faux

		WebElement element3 = driver.findElement(By.id("btnLogin"));
		boolean btnVisible = element3.isDisplayed();
		System.out.println(btnVisible);

		// verifier si le boutton login est activé vrai/faux
		boolean btnEnabled = element3.isEnabled();
		System.out.println(btnEnabled);

		// verifier si le bouton login existe
		List<WebElement> element4 = driver.findElements(By.id("btnLogin"));
		if(element4.size()!=0) {
			System.out.println(" Element button is exsit ");
		} else {
			System.out.println(" Element is not exist ");
		}


		//kill navigator
		driver.close();


	}

}
