package nandilathpage;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.chrome.ChromeDriver;

public class productselect 
{
	ChromeDriver driver;
	 By search=By.xpath("/html/body/div[2]/header/div/div[1]/div/div/div[2]/div[2]/form/input[1]");
	 By product=By.xpath("/html/body/div[2]/div/div/div/div/div/section[2]/div/div[2]/div/div[2]/div/div[2]/div[3]/div/div[3]/h3/a");
	 By addcart=By.xpath("/html/body/div[2]/div/div/div/div/div/div/section[2]/div/div[2]/div/div[4]/div/form/button[1]");
	 By viewcart=By.xpath("/html/body/div[5]/div[2]/div/div[2]/p[2]");

	public productselect(ChromeDriver driver)
	{
	 this.driver=driver;
	}
	public void search()
	{
		driver.findElement(By.xpath("/html/body/div[2]/header/div/div[1]/div/div/div[2]/div[2]/form/input[1]")).sendKeys("iphone",Keys.ENTER);
		driver.findElement(product).click();
		driver.findElement(addcart).click();
		driver.findElement(viewcart).click();
		
		
		
	}
	
}
