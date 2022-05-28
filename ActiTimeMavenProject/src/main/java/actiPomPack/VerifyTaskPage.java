package actiPomPack;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class VerifyTaskPage {

	@FindBy(xpath = "//div[text()='Add New']")
	private WebElement addNew;
	
	@FindBy(xpath = "//div[text()='+ New Customer']")
	private WebElement newCustomer;
	
	@FindBy(xpath = "(//input[@placeholder='Enter Customer Name'])[2]")
	private WebElement customerName;
	
	@FindBy(xpath = "//textarea[@placeholder='Enter Customer Description']")
	private WebElement description;
	
	@FindBy(xpath = "(//div[text()= '- Select Customer -'])[1]")
	private WebElement selectCustomer;
	
	@FindBy(xpath = "(//div[@class='itemRow cpItemRow '])[1]")
	private WebElement option;
	
	
	
	@FindBy(xpath = "//div[text()='Create Customer']")
	private WebElement createCustomer;
	
	WebDriver driver;
	WebDriverWait wait;
	
	public VerifyTaskPage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
		this.driver=driver;
	}
	 public void clickOnAddNew()
	 {
		 wait = new WebDriverWait(driver,30);
		 wait.until(ExpectedConditions.visibilityOf(addNew));
		 addNew.click();
	 }
	 
	 public void clickOnNewCustomer()
	 {
		 wait = new WebDriverWait(driver,30);
		 wait.until(ExpectedConditions.visibilityOf(newCustomer));
		 newCustomer.click();
	 }
	 
	 public void sendCustomerName()
	 {
		 wait = new WebDriverWait(driver,30);
		 wait.until(ExpectedConditions.visibilityOf(customerName));
		 customerName.sendKeys("priya");	 }
	 
	 public void selectProjectName()
	 {
		 wait = new WebDriverWait(driver,30);
		 wait.until(ExpectedConditions.visibilityOf(selectCustomer));
		// Select s =new Select(selectCustomer);
		// s.selectByVisibleText("Big Bang Company");
		 selectCustomer.click();
	 }
	 
	
	 
	 public void sendDescription()
	 {
		 wait = new WebDriverWait(driver,30);
		 wait.until(ExpectedConditions.visibilityOf(description));
		 description.sendKeys("i am new customer");
	 }
	 
	 public void selectOPtion()
	 {
		 wait = new WebDriverWait(driver,30);
		 wait.until(ExpectedConditions.visibilityOf(option));
		 option.click();
	 }
	 public void clickOnCreateCustomer()
	 {
		 wait = new WebDriverWait(driver,30);
		 wait.until(ExpectedConditions.visibilityOf(createCustomer));
		 createCustomer.click();
	 }
	
	
	
	
	

}
