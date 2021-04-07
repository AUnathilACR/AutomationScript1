package test;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TestCICE {

	public WebDriver driver;
	public Properties prop;

	
	public void Test1() throws InterruptedException,
			IOException {
		System.out.println("Hello World");
		
		/*
							 * prop = new Properties(); String filePath = System.getProperty("user.dir") +
							 * "/src/main/java/data.properties"; FileInputStream fis = new
							 * FileInputStream(filePath);
							 * 
							 * prop.load(fis); String browserName = prop.getProperty("browser");
							 * System.out.println(browserName); if (browserName.contains("chrome")) { //
							 * System.setProperty("webdriver.chrome.driver", //
							 * "C:\\chromedriver_win32\\chromedriver.exe");
							 * WebDriverManager.chromedriver().setup(); // driver = new ChromeDriver(); if
							 * (browserName.contains("headless")) { ChromeOptions options = new
							 * ChromeOptions(); options.addArguments("headless"); driver = new
							 * ChromeDriver(options); } else { driver = new ChromeDriver(); } // execute in
							 * chrome driver
							 * 
							 * } else if (browserName.equals("firefox")) {
							 * WebDriverManager.firefoxdriver().setup(); driver = new FirefoxDriver(); //
							 * firefox code } else if (browserName.equals("IE")) {
							 * WebDriverManager.edgedriver().setup(); driver = new EdgeDriver(); // IE code
							 * } // Call take screenshot function
							 * 
							 * 
							 * try { this.takeSnapShot(driver, "c://avi//test.png") ; } catch (Exception e)
							 * { // TODO Auto-generated catch block e.printStackTrace(); }
							 * 
							 * driver.get(prop.getProperty("url")); driver.manage().window().maximize();
							 * 
							 * TakesScreenshot scrShot = ((TakesScreenshot) driver); File SrcFile =
							 * scrShot.getScreenshotAs(OutputType.FILE); try { FileUtils.copyFile(SrcFile,
							 * new File("./Screenshots/SplashPage1.png")); } catch (IOException e) { // TODO
							 * Auto-generated catch block e.printStackTrace(); }
							 * System.out.println("Screenshot taken for SplashPage1");
							 * driver.findElement(By.id("cice-splash-signin-submit")).click();
							 * 
							 * driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
							 * driver.findElement(By.id("okta-signin-username")).sendKeys("aunathil@acr.org"
							 * );
							 * driver.findElement(By.id("okta-signin-password")).sendKeys("Giftofgod@123");
							 * driver.findElement(By.id("okta-signin-submit")).click();
							 * 
							 * TakesScreenshot scrShot2 = ((TakesScreenshot) driver); File SrcFile2 =
							 * scrShot2.getScreenshotAs(OutputType.FILE); try { FileUtils.copyFile(SrcFile2,
							 * new File("./Screenshots/SignInPage2.png")); } catch (IOException e) { // TODO
							 * Auto-generated catch block e.printStackTrace(); }
							 * System.out.println("Screenshot taken for SignInPage2");
							 * 
							 * WebDriverWait wait = new WebDriverWait(driver, 15); WebElement revirewConfirm
							 * = wait .until(ExpectedConditions.visibilityOfElementLocated(By.id(
							 * "cice-checkin-review-confirm-submit")));
							 * 
							 * TakesScreenshot scrShot3 = ((TakesScreenshot) driver); File SrcFile3 =
							 * scrShot3.getScreenshotAs(OutputType.FILE); try { FileUtils.copyFile(SrcFile3,
							 * new File("./Screenshots/CheckInPage3.png")); } catch (IOException e) { //
							 * TODO Auto-generated catch block e.printStackTrace(); }
							 * System.out.println("Screenshot taken for CheckInPage3"); //
							 * driver.findElement(By.id("cice-checkin-review-confirm-submit")).click();
							 * revirewConfirm.click(); TakesScreenshot scrShot4 = ((TakesScreenshot)
							 * driver); File SrcFile4 = scrShot4.getScreenshotAs(OutputType.FILE); try {
							 * FileUtils.copyFile(SrcFile4, new
							 * File("./Screenshots/ConfirmationPage4.png")); } catch (IOException e) { //
							 * TODO Auto-generated catch block e.printStackTrace(); }
							 * System.out.println("Screenshot taken for ConfirmationPage4");
							 * driver.findElement(By.id(
							 * "cice-layout-header-right-user-authenticated-toggler")).click();
							 * 
							 * driver.findElement(By.id("cice-header-logout-submit")).click();
							 * 
							 * }
							 * 
							 * // @Test
							 * 
							 * public void takeSnapShot(WebDriver webdriver, String fileWithPath) throws
							 * Exception {
							 * 
							 * // Convert web driver object to TakeScreenshot TakesScreenshot scrShot =
							 * ((TakesScreenshot) webdriver); // Call getScreenshotAs method to create image
							 * file File SrcFile = scrShot.getScreenshotAs(OutputType.FILE); // Move image
							 * file to new destination File DestFile = new File(fileWithPath); // Copy file
							 * at destination FileUtils.copyFile(SrcFile, DestFile);
							 * 
							 * }
							 * 
							 * // @Test public void getScreenshotPath(String testCaseName, WebDriver driver)
							 * throws IOException {
							 * 
							 * TakesScreenshot ts = (TakesScreenshot) driver; File source =
							 * ts.getScreenshotAs(OutputType.FILE);
							 * 
							 * String destinationFile = System.getProperty("user.dir") +
							 * "\\reports\\" + "testCaseName" + ".png"; FileUtils.copyFile(source, new
							 * File(destinationFile));
							 */
	}
}
