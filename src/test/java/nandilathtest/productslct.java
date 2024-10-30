package nandilathtest;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import nandilathpage.productselect;

public class productslct 
{
	ChromeDriver driver;
	@BeforeTest
	public void setup()
	{
		driver =new ChromeDriver();
	}
	@BeforeMethod
	public void url()
	{
		driver.get("https://nandilathgmart.com/");
	}
	@Test
	public void test()
	{
		productselect cc =new productselect(driver);
		cc.search();
 
}
}
