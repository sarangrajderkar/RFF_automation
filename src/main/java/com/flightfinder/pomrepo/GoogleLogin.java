package com.flightfinder.pomrepo;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class GoogleLogin {

	public static WebDriver driver;	
	
	
	public GoogleLogin(WebDriver driver) {
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
	
	@FindBy(xpath="//button[@class='google-login-btn']")
	WebElement googleSignInButton;
	
	
	public WebElement getGoogleSignInButton() {
		synchronised(By.xpath("//button[@class='google-login-btn']"),googleSignInButton);
		return googleSignInButton;

	}
	
	@FindBy(xpath="//input[@aria-label='Email or phone']")
	WebElement googleEmailTextField;


	public WebElement getGoogleEmailTextField() {
		synchronised(By.xpath("//input[@aria-label='Email or phone']"),googleEmailTextField);
		return googleEmailTextField;
	}
	
	@FindBy(xpath="//button//span[text()='Next']")
	WebElement nextButton;


	public WebElement getNextButton() {
		synchronised(By.xpath("//button//span[text()='Next']"),nextButton);
		return nextButton;
	}
	
	@FindBy(xpath="//input[@name='Passwd']")
	WebElement passwordTextField;


	public WebElement getPasswordTextField() {
		synchronised(By.xpath("//input[@name='Passwd']"),passwordTextField);
		return passwordTextField;
	}
	
}
