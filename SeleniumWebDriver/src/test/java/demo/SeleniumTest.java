package demo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class SeleniumTest {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		// WebDriverManager.chromedriver().browserVersion("2.36").setup();
		WebDriver driver = new ChromeDriver();
		// WebDriverManager.firefoxdriver().setup();
		// WebDriver driver = new FirefoxDriver();
		// driver.get("https://www.adidas.com.vn/en");
		driver.get("https://www.google.com/");
		driver.findElement(By.xpath("//input[@name='q']")).sendKeys("okey");
		//WebElement textbox = driver.findElement(By.id("lst-ib"));
		//textbox.sendKeys("Automation step by step");
		//driver.close();
		//driver.quit();

	}

}
