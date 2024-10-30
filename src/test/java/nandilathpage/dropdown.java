package nandilathpage;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class dropdown {
	ChromeDriver driver;
	By nandown = By.xpath("/html/body/div[2]/header/div/div[2]/div/div/div[2]/div/ul/li[4]/a");
	By nanitem = By.xpath("//*[@id=\"menu-item-106700\"]/a");
	
	public dropdown(ChromeDriver driver)
	{
		this.driver=driver;
		
	}
	
	public void setvalues(String search)
	{
		
	}
	
	public void click() throws IOException
	{
		driver.findElement(By.xpath("/html/body/div[2]/header/div/div[2]/div/div/div[2]/div/ul/li[4]/a")).click();
		driver.findElement(By.xpath("/html/body/div[2]/div/div/div/div/div/section[2]/div/div[2]/div/div[2]/div/div[2]/div[10]/div/div[3]/h3/a")).click();
		
		//URL RESPONSE 
		  
		  String url="https://nandilathgmart.com/";
			 URL ob=new URL(url);
		    
		     HttpURLConnection con=(HttpURLConnection)ob.openConnection();
		     int code=con.getResponseCode();
		     System.out.println(code);
		     con.connect();
		     if(con.getResponseCode()==200)
		     {
		     System.out.println("valid url");
		     }
		     else
		      {
		     System.out.println("invalid");
		          
		      }
		
	}
	
	
	

}
