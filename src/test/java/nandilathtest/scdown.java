package nandilathtest;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.assertthat.selenium_shutterbug.core.Capture;
import com.assertthat.selenium_shutterbug.core.Shutterbug;

import nandilathpage.scrolldown;

public class scdown {
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
	scrolldown aa =new scrolldown (driver);
	aa.click();

	//scrolldown picture
JavascriptExecutor Js=(JavascriptExecutor)driver;
Js.executeScript("window.scrollBy(0,1000)","");
driver.findElement(By.xpath("/html/body/div[2]/footer/div[1]/div/section/div/div[3]/div/div[2]/div/ul/li/ul/li[1]/a")).click();

//screenshot ptrclr division
WebElement gb=driver.findElement(By.xpath("/html/body/div[2]/div/div/div"));
File Screenshot=gb.getScreenshotAs(OutputType.FILE);
FileHandler.copy(Screenshot,new File("D:/scrnsht/nanscrn.png"));

//screenshot full division
Shutterbug.shootPage(driver,Capture.FULL,true).save("D:\\scrnsht\\fullscreen.png");
}
}


