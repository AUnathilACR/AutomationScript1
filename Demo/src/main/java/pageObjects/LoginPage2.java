package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LoginPage2 {

	public WebDriver driver;

	By username = By.id("okta-signin-username");
	By password = By.id("okta-signin-password");
	By submit = By.id("okta-signin-submit");
	By failedUser= By.xpath("//P[text()='Unable to sign in']");


	public LoginPage2(WebDriver driver) {

	this.driver=driver;
	}

	public WebElement getUsername() {

		return driver.findElement(username);
	}
	public WebElement getPassword() {

		return driver.findElement(password);
	}
	public WebElement getSubmit() {

		return driver.findElement(submit);
	}
	public WebElement failedUse() {

		return driver.findElement(failedUser);
	}
	
}
