package PageObjects;

import java.io.FileNotFoundException;
import java.util.Calendar;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class NewCustomerObjects 
{

		WebDriver driver ; 
		ReadProperty read;

		NewCustomerObjects() throws FileNotFoundException
		{
			read = new ReadProperty();
		}
		
		@FindBy(xpath="//ul[@class='menusubnav']//li[2]")
		WebElement NewCustomer ;
		
		@FindBy(name="name")
		WebElement CustomerName;
		
		@FindBy(xpath="//input[@name='rad1'][2]")
		WebElement Gender;
		
		@FindBy(name="dob")
		WebElement DOB;
		
		@FindBy(name="addr")
		WebElement Address;
		
		@FindBy(name="city")
		WebElement City;
		
		@FindBy(name="state")
		WebElement State;
		
		@FindBy(name="pinno")
		WebElement PinNo;
		
		@FindBy(name="telephoneno")
		WebElement MobNo;
		
		@FindBy(name="emailid")
		WebElement EmailID;
		
		@FindBy(name="password")
		WebElement Password;
		
		@FindBy(name="sub")
		WebElement submitbtn ; 

		@FindBy(linkText = "Continue")
		WebElement Continue; 
		
		
		public NewCustomerObjects(WebDriver driver)
		{
			this.driver= driver;
			PageFactory.initElements(driver, this);
		}
				
		public void clickNCustomer()
		{
			NewCustomer.click();
		}
		
		public void enterCustomerName()
		{
			CustomerName.sendKeys("Ramya");	
		}
		
		public void selectGender()
		{
			Gender.click();
		}
			
		public void EnterDob()
		{	
			JavascriptExecutor js = (JavascriptExecutor)driver; 
			js.executeScript("arguments[0].type = arguments[1]", DOB, "text");
			DOB.sendKeys("10/09/1995");
		}
	
		public void enterAddress()
		{
			Address.sendKeys("New no 43 old no 89  East Coast Road ");
			Address.sendKeys(Keys.ENTER);
			Address.sendKeys("Panaiyur ");
			Address.sendKeys(Keys.ENTER);					 
		}
		
		public void enterCity()
		{
			City.sendKeys("Chennai");
		}
	
		
		public void enterState()
		{
			State.sendKeys("TamilNadu");
		}
	
		public void enterPinno()
		{
			PinNo.sendKeys("600108");
		}
		
		public void enterMobNo()
		{
			MobNo.sendKeys("8364593424");
		}
		
		public void enterEmailID()
		{
			EmailID.sendKeys("nramya1@34gmail.com");
			
		}
	
		public void enterPassword()
		{
			
			Password.sendKeys("RamyaVainu");
		}
		
		public void clickSubmit()
		{
			submitbtn.click();
		}
		
		public void clickContinue()
		{
			Continue.click();
		}
		
}

