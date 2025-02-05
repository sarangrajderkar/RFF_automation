package com.flightfinder.pomrepo;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class CreateAlertElements {

	public static WebDriver driver;	
	
	
	public CreateAlertElements(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
		}
	
	public void synchronised(By locator, WebElement element)  {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
		wait.until(ExpectedConditions.visibilityOfElementLocated(locator));
		wait.until(ExpectedConditions.elementToBeClickable(element));	
		wait.until(ExpectedConditions.presenceOfElementLocated(locator));
		try {
		Thread.sleep(1000); }
		catch (InterruptedException e) {
		e.printStackTrace();	
		}
		}
	
	
	public WebElement getAcceptCookies() {
		synchronised(By.xpath("//button[text()='I agree']"),acceptCookies);
		return acceptCookies;
	}
	
	public WebElement getSignInLink() {
		synchronised(By.xpath("//button[text()='Sign In']"),signInLink);
		return signInLink;
	}

	public WebElement getEmailTextField() {
		synchronised(By.xpath("//input[@name='email']"),emailTextField);
		return emailTextField;
	}

	public WebElement getPasswordTextField() {
		synchronised(By.xpath("//input[@name='password']"),passwordTextField);
		return passwordTextField;
	}

	public WebElement getSignInButton() {
		synchronised(By.xpath("//div[@class='column']/button[text()='Sign In']"),signInButton);
		return signInButton;
	}

	public WebElement getWhereToField() {
		synchronised(By.xpath("//div[text()='Where to?']"),whereToField);
		return whereToField;
	}

	public WebElement getNyc() {
		synchronised(By.xpath("//span[text()='New York City (JFK, EWR, LGA, HPN)']"),nyc);
		return nyc;
	}

	public WebElement getSearchButton() {
		synchronised(By.xpath("//button[text()='Search Now']"),searchButton);
		return searchButton;
	}

	public WebElement getCreateAlertButton() {
		synchronised(By.xpath("//button[text()='Create Alert']"),createAlertButton);
		return createAlertButton;
	}

	public WebElement getDepartStartDate() {
		synchronised(By.xpath("//input[@name='departStartDate']"),departStartDate);
		return departStartDate;
	}
	
	public WebElement getNextMonth() {
		synchronised(By.xpath("//div[@aria-label='Move forward to switch to the next month.']"),nextMonth);
		return nextMonth;
	}
	
	public WebElement getStartDate() {
		synchronised(By.xpath("(//div[text()='15' and @class='CalendarDay__Date'])[2]"),startDate);
		return startDate;
	}
	
	public WebElement getEndDate() {
		synchronised(By.xpath("(//div[text()='22' and @class='CalendarDay__Date'])[2]"),endDate);
		return endDate;
	}
		
	public WebElement getreturnStartDate() {
		synchronised(By.xpath("//input[@name='returnStartDate']"),departStartDate);
		return returnStartDate;
	}

	public WebElement getCreateAlertButtonPopup() {
		synchronised(By.xpath("//div[@class='popup-footer']/button[text()='Create Alert']"),createAlertButtonPopup);
		return createAlertButtonPopup;
	}

	public WebElement getAlertmsg() {
		synchronised(By.xpath("//div[@class='Toastify__toast-body']"),alertmsg);
		return alertmsg;
	}
	
	public WebElement getAccountButton() {
		synchronised(By.xpath("(//div[@role='listbox'])[2]"),accountButton);
		return accountButton;
	}

	public WebElement getLogoutButton() {
		synchronised(By.xpath("//span[text()='Logout']"),logoutButton);
		return logoutButton;
	}
	
	public WebElement getCloseAlertPopup() {
		synchronised(By.xpath("//*[local-name()='svg'][@class='cst-popup__close']"),closeAlertPopup);
		return closeAlertPopup;
	}
	
	public WebElement getInvalidCredentials() {
		synchronised(By.xpath("//span[text()='Invalid email or password.']"),invalidCredentials);
		return invalidCredentials;
	}
	
	@FindBy(xpath="//span[text()='Invalid email or password.']")
	WebElement invalidCredentials;

	@FindBy(xpath="//button[text()='I agree']")
	WebElement acceptCookies;
	
	@FindBy(xpath="//button[text()='Sign In']")
	WebElement signInLink;
	
	@FindBy(xpath="//input[@name='email']")
	WebElement emailTextField;
	
	
	@FindBy(xpath="//input[@name='password']")
	WebElement passwordTextField;
	
	@FindBy(xpath="//div[@class='column']/button[text()='Sign In']")
	WebElement signInButton;
	
	@FindBy(xpath="//div[text()='Where to?']")
	WebElement whereToField;
	
	@FindBy(xpath="//span[text()='New York City (JFK, EWR, LGA, HPN)']")
	WebElement nyc;
	
	@FindBy(xpath="//button[text()='Search Now']")
	WebElement searchButton;
	
	@FindBy(xpath="//button[text()='Create Alert']")
	WebElement createAlertButton;
	
	@FindBy(xpath="//input[@name='departStartDate']")
	WebElement departStartDate;
	
	@FindBy(xpath="//div[@aria-label='Move forward to switch to the next month.']")
	WebElement nextMonth;
	
	@FindBy(xpath="(//div[text()='15' and @class='CalendarDay__Date'])[2]")
	WebElement startDate;
	
	@FindBy(xpath="(//div[text()='22' and @class='CalendarDay__Date'])[2]")
	WebElement endDate;
		
	@FindBy(xpath="//div[@class='popup-footer']/button[text()='Create Alert']")
	WebElement createAlertButtonPopup;
	
	@FindBy(xpath="//div[@class='Toastify__toast-body']")
	WebElement alertmsg;
	
	@FindBy(xpath="//input[@name='returnStartDate']")
	WebElement returnStartDate;
	
	@FindBy(xpath="//*[local-name()='svg'][@class='cst-popup__close']")
	WebElement closeAlertPopup;
	
	@FindBy(xpath="//div[@role='listbox']/div[@class='text']//img[@class=' ls-is-cached lazyloaded']")
	WebElement accountButton;
	
	@FindBy(xpath="//span[text()='Logout']")
	WebElement logoutButton;


	public WebElement getBellicon() {
		//@FindBy(xpath="//*[name()='path' and contains(@d,'M21.2572 1')]")
		synchronised(By.xpath("//*[name()='path' and contains(@d,'M21.2572 1')]"),getBellicon());
			return getBellicon();
	}

	
	

		
	

	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
