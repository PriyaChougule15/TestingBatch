package actiPomPack;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ActiHeaders {
	@FindBy(xpath="//div[@id='container_tasks']")
	private WebElement tasks;
	
	@FindBy(xpath="//div[@id='container_reports']")
	private WebElement reports;
	
	@FindBy(xpath="//div[@id='container_users']")
	private WebElement users;
	
	@FindBy(xpath="//a[text()='Logout']")
	private WebElement logout;
	
	WebDriver driver;
	WebDriverWait wait;
	
	public ActiHeaders(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
		this.driver=driver;
	}
	
	public void clickOnTasks()
	{
		wait = new WebDriverWait(driver,30);
		wait.until(ExpectedConditions.visibilityOf(tasks));
		tasks.click();
	}
	
	public void clickOnReports()
	{
		reports.click();
	}

	
	public void clickOnUsers()
	{
		users.click();
	}

	
	public void clickOnLogout()
	{
		wait = new WebDriverWait(driver,30);
		wait.until(ExpectedConditions.visibilityOf(logout));
		logout.click();
	}

	
	


}
