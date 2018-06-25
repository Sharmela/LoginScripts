package Pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Tatacliq 
{
	    @FindBy(id="socialLogin")
		private WebElement sign;
		
		@FindBy(id="j_username_login")
		private WebElement email;
		
		@FindBy(id="j_password_login")
		private WebElement pass;
		
		@FindBy(id="accountLoginButton")
		private WebElement lgn;

		
		public Tatacliq(WebDriver driver)
		{
			PageFactory.initElements(driver, this);
		}
		
		public void Signinbtn() throws InterruptedException
		{
			Thread.sleep(8000);
			sign.click();
			
		}
		
		public void Username(String u)
		{
			email.sendKeys(u);
		}
		
		public void Password(String p)
		{	
			pass.sendKeys("121Sharu@12");
		}
		
		public void loginbtn()
		{
			lgn.click();
		}
	}
