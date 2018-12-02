package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class searchPage {
	WebDriver driver;
	
	@FindBy(xpath="(//span[@id='TOTAVSts'])[1]")
	WebElement totalSeats;
	
	
	public searchPage(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	public String getSeats()
	{
		return totalSeats.getText();
	}

}
