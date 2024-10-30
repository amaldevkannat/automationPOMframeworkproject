package nandilathpage;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class scrolldown {
	ChromeDriver driver;
	 By scrolldown=By.xpath("/html/body/div[2]/footer/div[1]/div/section/div/div[3]/div/div[2]/div/ul/li/ul/li[1]");
	 
	 public scrolldown(ChromeDriver driver)
	 {
		 this.driver=driver;
		 
	 }
	public void click()
	{
		driver.findElement(scrolldown);
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
