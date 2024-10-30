package nandilathpage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class nandilathregstr 
{
WebDriver driver;
By ngusername=By.name("username");
By ngpassword=By.name("password");
By nglogin=By.name("login");
By homepg=By.xpath("/html/body/div[2]/header/div/div[1]/div/div/div[1]/div/a");



public nandilathregstr(WebDriver driver)
{
	this.driver=driver;
	
}
public void setvalues(String username,String password )
{
	driver.findElement(ngusername).sendKeys(username);
	driver.findElement(ngpassword).sendKeys(password);
	
}
public void login()
{
	driver.findElement(nglogin).click();
	driver.findElement(homepg).click();
}

}
