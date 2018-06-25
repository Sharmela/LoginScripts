package Pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Facebook 
{
		@FindBy(id="email")
		private WebElement user;
		
		@FindBy(id="pass")
		private WebElement pwd;
		
		@FindBy(id="u_0_2")
		private WebElement login;

		
		public Facebook(WebDriver driver)
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
