package Scripts;

import org.testng.annotations.Test;

import Genericlib.BaseTest;
import Pom.Gmail;

public class Gmailapp 
{
	
	public class TestClass extends BaseTest
	{
		@Test
		public void Loginaction() throws InterruptedException
		{
			driver.get("https://accounts.google.com");
			Gmail l = new Gmail(driver);
			Thread.sleep(2000);
			l.username("shasha.18purni@gmail.com");
			l.next();
			Thread.sleep(2000);
			l.password("121abc");
			Thread.sleep(2000);
			l.loginbtn();
		}

	}


}
