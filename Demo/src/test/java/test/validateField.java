package test;

import java.io.File;
import java.io.IOException;


import org.apache.commons.io.FileUtils;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import pageObjects.SplashPage11;
import resources.base;

//Adding logs 
//Generating html reports
//Screenshots on failure
//JEnkins integration
public class validateField extends base {
	public WebDriver driver;

	// public static Logger log =LogManager.getLogger(base.class.getName());
	@BeforeTest

	public void initialize() throws IOException {

		driver = initializeDriver();
		driver.get(prop.getProperty("url"));
		driver.manage().window().maximize();

	}

	@Test
	public void ValidateField() throws IOException {

		// one is inheritance // creating object to that class and invoke methods of
		SplashPage11 sp = new SplashPage11(driver);
		Assert.assertEquals(sp.getHeader11().getText(), "ACR 2022 rANNUAL MEETING");
		// compare the text from the browser with actual text.- Error..
		Assert.assertTrue(sp.getNavigation11().isDisplayed());
		// log.info("Navigation Bar is displayed");
		System.out.println("Test completed"); // Assert.assertFalse(false);

		String destinationFile = System.getProperty("user.dir") + "\\reports\\" + "testCaseName" + ".png";
		TakesScreenshot ts = (TakesScreenshot) driver;
		File source = ts.getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(source, new File(destinationFile));
	
		
	}

	@AfterTest
	public void teardown() {

		driver.close();

	}

}
