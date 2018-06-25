package Scripts;

import org.testng.annotations.Test;

import Genericlib.BaseTest;
import Pom.Twitter;

public class Twitterapp extends BaseTest
{
	@Test
	public void Loginaction() throws InterruptedException
	{
		Twitter l = new Twitter(driver);
		Thread.sleep(2000);
		l.username("shasha.18purni@gmail.com");
		Thread.sleep(2000);
		l.password("121abc");
		Thread.sleep(2000);
		l.loginbtn();
	}

}
