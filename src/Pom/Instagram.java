package Pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Instagram 
{
		@FindBy(xpath="//input[@name='username']")
		private WebElement user;
		
		@FindBy(xpath="//input[@name='password']")
		private WebElement pwd;
		
		@FindBy(xpath="//button[.='Log in']")
		private WebElement login;

		
		public Instagram(WebDriver driver)
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
