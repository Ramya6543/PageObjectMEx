package TestNg;

import org.testng.annotations.Test;

import PageObjects.LoginPageObjects;
import PageObjects.NewCustomerObjects;
import PageObjects.ReadProperty;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;

import java.io.FileNotFoundException;
import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;


public class NewCustomerTC 
{
	WebDriver driver = new FirefoxDriver();
	ReadProperty read;
	NewCustomerObjects newcust;
	LoginPageObjects page;
	
	
		NewCustomerTC () throws FileNotFoundException
		{
		read = new ReadProperty();
		}
	
	@BeforeMethod
	  public WebDriver beforeTest() throws IOException 
		{
		driver.get(read.getURL());
		driver.manage().window().maximize();
		return driver;
		}
	
	
	  @Test
	  public void AddCustomer() throws IOException 
	  
	  {
		  
		  page = new LoginPageObjects(driver);
		  page.enterUserName();
		  page.enterPassword();
		  page.enterLogIn();
		  newcust = new NewCustomerObjects(driver);
		  newcust.clickNCustomer();
	  }
	 
	  @Test
	  public void enterAddCustForm() throws IOException
	  {
		  AddCustomer();
//		  newcust = new NewCustomerObjects(driver);
//		  newcust.clickNCustomer();
		  newcust.enterCustomerName();
		  newcust.selectGender();
		  newcust.EnterDob();
		  newcust.enterAddress();
		  newcust.enterCity();
		  newcust.enterState();
		  newcust.enterPinno();
		  newcust.enterMobNo();
		  newcust.enterEmailID();
		  newcust.enterPassword();
		  newcust.clickSubmit();
	  }
  
//	  @AfterTest
//	  public void after() throws IOException 
//	  
//	  {
//		  
//		  driver.close();
//		 
//	  }
//  

}
