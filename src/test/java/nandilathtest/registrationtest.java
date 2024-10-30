package nandilathtest;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import nandilathpage.nandilathregstr;


public class registrationtest 
{
	
	WebDriver driver;
	@BeforeTest
	public void setup()
	{
		driver=new ChromeDriver();
		
	}
	@BeforeTest
	public void url()
	{ 
		driver.get("https://nandilathgmart.com/my-account/");
	}
	
@Test
public void testlogin() throws Exception
{
	nandilathregstr ob=new nandilathregstr(driver);
	ob.setvalues("Amaldev pp", "LUMINARproject@123");
	ob.login();
}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
