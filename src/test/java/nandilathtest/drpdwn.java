package nandilathtest;

import java.io.IOException;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import nandilathpage.dropdown;

public class drpdwn {
	ChromeDriver driver;
	@BeforeTest
	public void setup() 
	{
		driver=new ChromeDriver();
	}
	@BeforeMethod
	public void url()
	{
		driver.get("https://nandilathgmart.com/");
	}
	@Test
	public void test() throws IOException
	{
		dropdown cu = new dropdown(driver);
		cu.click();
	}
	

	
	
	
	
	

}
