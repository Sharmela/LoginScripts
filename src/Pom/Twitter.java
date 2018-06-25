package Pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Twitter 
{
    @FindBy(xpath="//input[@class='js-username-field email-input js-initial-focus']")
	private WebElement user;
	
	@FindBy(xpath="//input[@class='js-password-field']")
	private WebElement pwd;
	
	@FindBy(xpath="//button[.='Log in']")
	private WebElement login;

	
	public Twitter(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	public void username(String u) 
	{
	user.sendKeys(u);	
	}
	public void password(String p)
	{
		pwd.sendKeys(p);
	}
	public void loginbtn() 
	{
		login.click();	
	}
}

