package Scripts;

import org.testng.annotations.Test;

import Genericlib.BaseTest;
import Pom.Instagram;
public class Instagramapp 
{
	public class TestClass extends BaseTest
	{
		@Test
		public void Loginaction() throws InterruptedException
		{
			Instagram l = new Instagram(driver);
			Thread.sleep(3000);
			l.username("shasha.18purni@gmail.com");
			Thread.sleep(2000);
			l.password("121abc");
			Thread.sleep(2000);
			l.loginbtn();
		}

	}


}
