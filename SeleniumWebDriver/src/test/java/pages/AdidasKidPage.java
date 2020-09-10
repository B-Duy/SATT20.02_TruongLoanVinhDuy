package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class AdidasKidPage {
	private static WebElement element = null;

	public static WebElement KidsBoysClothingHover(WebDriver driver) {
		Actions actions = new Actions(driver);
		element = driver.findElement(By.xpath("//a[contains(text(),'Kids')]"));
		actions.moveToElement(element).perform();
    	System.out.println("Done Mouse hover on 'Kids' from Header Menu");
		return element;

	}

	public static WebElement KidsBoysClothing(WebDriver driver) {
		element = driver.findElement(By.xpath(
				"//div[@class='glass-header-bottom-desktop-white___38y1Y']//div[3]//div[1]//div[1]//div[1]//div[1]//div[1]//div[1]//div[1]//div[1]//div[1]//div[3]//ul[1]//li[1]//div[1]//a[1]"));
		element.click();
		System.out.println("Done Mouse click on 'KidsBoy' ");
		return element;

	}

}
