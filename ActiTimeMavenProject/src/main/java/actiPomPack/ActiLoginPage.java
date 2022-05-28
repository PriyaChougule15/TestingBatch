package actiPomPack;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ActiLoginPage {
	@FindBy(xpath = "//input[@id='username']")
	private WebElement username;

	@FindBy(xpath = "//input[@name=\"pwd\"]")
	private WebElement password;

	@FindBy(xpath = "//input[@name=\"remember\"]")
	private WebElement keepMeLogin;

	@FindBy(xpath = "//div[text()='Login ']")
	private WebElement login;
	
	WebDriver driver;
	public ActiLoginPage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
		this.driver= driver;
	}
	public void sendUserName()
	{
		username.sendKeys("chougulepriyanka15@gmail.com");
	}
	
	public void sendPassword()
	{
		password.sendKeys("priya15");
	}
	
	public void clickOnKeepMeLogin()
	{
		keepMeLogin.click();
		
	}
	
	public void clickOnLogin()
	{
		login.click();
	}

}
