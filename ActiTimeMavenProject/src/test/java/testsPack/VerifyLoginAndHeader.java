    package testsPack;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import actiPomPack.ActiHeaders;
import actiPomPack.ActiLoginPage;
import actiPomPack.VerifyTaskPage;
import crossBrowserPack.Base;

public class VerifyLoginAndHeader extends Base {
	
	WebDriver driver;
	ActiLoginPage actiLoginPage;
	ActiHeaders actiHeaders;
	VerifyTaskPage verifyTaskPage;
	
     @Parameters("browser")
     @BeforeTest
 public void launchBrowser(String browser)
 {
	 if(browser.equals("Chromebrowser"))
	 {
		 driver = openChromeBrowser();
	 }
	 if(browser.equals("Firefoxbrowser"))
	 {
		 driver = openFirefoxBrowser();
	 }
	 driver.manage().timeouts().implicitlyWait(5000, TimeUnit.MILLISECONDS);
 }
	@BeforeClass
	public void launchApplication()
	{
		actiLoginPage = new ActiLoginPage(driver);
		verifyTaskPage = new VerifyTaskPage(driver);	
		actiHeaders = new ActiHeaders(driver);
	}
	@BeforeMethod
	public void loginToApplication()
	{
		driver.get("https://online.actitime.com/xyz11/login.do");
		 
		 actiLoginPage.sendUserName();
		 actiLoginPage.sendPassword();
		 actiLoginPage.clickOnKeepMeLogin();
		 actiLoginPage.clickOnLogin();
	}
	@Test
	public void veverifyTaskPageVrifyHeadersOfApplication()
	{
		//String url = driver.getCurrentUrl();
		//Assert.assertEquals(url, "[https://online.actitime.com/xyz11/login.do]");
		
		actiHeaders.clickOnTasks();
		verifyTaskPage.clickOnAddNew();
		verifyTaskPage.clickOnNewCustomer();
		verifyTaskPage.sendCustomerName();
		verifyTaskPage.sendDescription();
		verifyTaskPage.selectProjectName();
		verifyTaskPage.selectOPtion();
		verifyTaskPage.clickOnCreateCustomer();
		

	}
	@Test
	public void verifyUserTab()
	{
//		actiHeaders.clickOnReports();
//		actiHeaders.clickOnUsers();
	}
	@AfterMethod
	public void logoutFromApplication()
	{
		actiHeaders.clickOnLogout();
	}
	@AfterClass
	public void clearPomObjects()
	{
		actiHeaders = null;
		verifyTaskPage = null;
	}
	@AfterTest
//	public void closeBrowser()
//	{
//		driver.close();
//		driver = null;
//		System.gc();
//	}
}
