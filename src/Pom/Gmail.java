package Pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Gmail 
{
		@FindBy(id="identifierId")
		private WebElement user;
		
		@FindBy(xpath="//span[.='Next']")
		private WebElement nxt;
		
		@FindBy(xpath="//input[@name='password']")
		private WebElement pwd;
		
		@FindBy(xpath="//span[.='Next']")
		private WebElement login;

		
		public Gmail(WebDriver driver)
		{
			PageFactory.initElements(driver, this);
		}
		
		public void username(String u) 
		{
		user.sendKeys(u);	
		}
		
		public void next()
		{
			nxt.click();
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
