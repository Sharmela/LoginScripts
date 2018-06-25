package Scripts;
import org.testng.annotations.Test;

import Genericlib.BaseTest;
import Pom.Facebook;


public class Facebookapp extends BaseTest
{
		@Test
		public void Loginaction() throws InterruptedException
		{
			driver.get("https://www.facebook.com/");
			Facebook l = new Facebook(driver);
			Thread.sleep(2000);
			l.username("abc@gmail.com");
			l.password("121abc");
			Thread.sleep(2000);
			l.loginbtn();
		}
}
