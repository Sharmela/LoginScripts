package Scripts;

import org.testng.annotations.Test;

import Genericlib.BaseTest;
import Pom.Tatacliq;

public class Tatacliqapp extends BaseTest
{
		@Test
		public void Loginaction() throws InterruptedException
		{
			Tatacliq l = new Tatacliq(driver);
			Thread.sleep(2000);
			l.Signinbtn();
			Thread.sleep(2000);
			l.Username("shasha.18purni@gmail.com");
			Thread.sleep(2000);
			l.Password("121abc");
			Thread.sleep(2000);
			l.loginbtn();
		}

	}

