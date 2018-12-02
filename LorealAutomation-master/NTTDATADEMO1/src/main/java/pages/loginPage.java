package pages;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import utilities.reusableCodes;

public class loginPage {
	WebDriver driver;
	
	
	@FindBy(xpath="//input[@name='source']")
	WebElement input_source;
	@FindBy(xpath="//input[@name='destination']")
	WebElement input_destination;
	@FindBy(xpath="//input[@name='journey_date']")
	WebElement input_date;
	@FindBy(xpath="//a[text()='Search']")
	WebElement btn_search;
	@FindBy(xpath="//img[contains(@title,'abhibus.com')]")
	WebElement img_title;
	
	
	public loginPage(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	public void inputDetails() throws InterruptedException, IOException
	{
		String source=reusableCodes.getValue("config.properties", "SOURCE");
		String dest=reusableCodes.getValue("config.properties", "DESTINATION");
		System.out.println("Loading loginpage class");
		System.out.println("calling loginpage class");
		System.out.println("calling loginpage class");
		input_source.sendKeys(source);
		input_destination.sendKeys(dest);
		input_date.click();
		//input_date.click();
		driver.findElement(By.xpath("//h4[text()='Today']")).click();
		btn_search.click();
		Thread.sleep(5000);
		
	} 
	
	
	
	
	
	
	
	

}
