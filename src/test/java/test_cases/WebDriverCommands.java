package test_cases;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebDriverCommands {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver", "src/test/resources/drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.MILLISECONDS);

		// open URL application orange
		String url = "https://opensource-demo.orangehrmlive.com/";
		driver.get(url);
		driver.manage().window().maximize();

		// retrieve title of the page
		String title = driver.getTitle();
		int titleLength = title.length();
		System.out.println("The title of the page is : " + title);
		System.out.println("The length of the title is : " + titleLength);

		String actualUrl = driver.getCurrentUrl();
		if (actualUrl.equals(url)) {
			System.out.println(" Verification success - the correct url is opened");
		} else {
			System.out.println(" Verification failed - an incorrect url is opened");
		}
		System.out.println(" The actual url is:" + actualUrl);
		System.out.println(" The actual url is:" + url);

		String pageSource = driver.getPageSource();
		int pageSourceLength = pageSource.length();
		System.out.println("The length of the pageSource is : " + pageSourceLength);

		// close navigator
		driver.close();

	}

}
