package test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import pages.AdidasKidPage;

public class AdidasKidTest {
	private static WebDriver driver = null;

	public static void main(String[] args) {
		AdidasKid();
	}

	public static void AdidasKid() {
		String projectPath = System.getProperty("user.dir");
		System.setProperty("webdriver.chrome.driver", projectPath + "\\drivers\\geckodriver\\chromedriver.exe");
		driver = new ChromeDriver();
		// go to https://www.adidas.com.vn/en/kids
		driver.get("https://www.adidas.com.vn/en/kids");

		AdidasKidPage.KidsBoysClothingHover(driver);
		AdidasKidPage.KidsBoysClothing(driver);
		// close Browser
		// driver.close();
		// driver.quit();

	}

}
