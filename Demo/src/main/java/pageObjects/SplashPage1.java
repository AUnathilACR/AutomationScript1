package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class SplashPage1 {

	public WebDriver driver;

	By signin = By.id("cice-splash-signin-submit");
	By header = By.xpath("//h1[contains(text(),'ACR 2022 Annual Meeting')]");
	By electionDisplayed = By.xpath("//h4[contains(text(),'Election')]");

	public SplashPage1(WebDriver driver) {

		this.driver = driver;
	}
	

	public WebElement getLogin() {

		return driver.findElement(signin);
	}

	public WebElement getHeader() {

		return driver.findElement(header);
	}

	public WebElement getNavigation() {

		return driver.findElement(electionDisplayed);
	}
}
