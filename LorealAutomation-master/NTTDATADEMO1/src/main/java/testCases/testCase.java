package testCases;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import pages.loginPage;
import pages.searchPage;
import utilities.*;

public class testCase {
	WebDriver driver;
	loginPage logInObj;
	searchPage searchObj;
	
	
	@BeforeTest
	public void setUp() throws IOException
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\165434\\Desktop\\AutomationRequirement\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.get(reusableCodes.getValue("config.properties", "URL"));
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	}
	
	@Test(priority=0)
	public void enterDetails() throws InterruptedException, IOException
	{
		logInObj = new loginPage(driver);
		
		logInObj.inputDetails();
		Thread.sleep(20);
		
	}
	@Test(priority=1)
	public void verifyResult() throws InterruptedException, IOException
	{
		searchObj = new searchPage(driver);
		System.out.println("Total Seats" + searchObj.getSeats());
		
	}
	@AfterTest
	public void cleanUp() throws IOException
	{
		driver.quit();
	}


}
