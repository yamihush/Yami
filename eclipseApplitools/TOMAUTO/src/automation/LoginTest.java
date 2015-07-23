package automation;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;

import java.util.Iterator;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.SearchContext;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;

public class LoginTest {
	 public WebDriver driver;
	
	@BeforeTest
  public void seleniumdrver(){
		 
	  
  }
	
	@Test(enabled = false)
  public void signin() {
 
		//Login https://qa1.walker.intuit.com/login/#/signin
		//user - tom11@gmail.com
		//pass - webtax123!
		
		driver.findElement(By.id("ius-userid")).sendKeys("tom11@gmail.com");
		driver.findElement(By.id("ius-password")).sendKeys("webtax123!");
		driver.findElement(By.id("ius-sign-in-submit-btn")).click();
		

				
	}
	
	
	@Test
	public void invalidsignin() {
		 
		//Login https://qa1.walker.intuit.com/login/#/signin
		//user - tom11@gmail.com
		//pass - webtax123!
		
		driver.findElement(By.id("ius-userid")).sendKeys("tom11@gmailq.com");
		driver.findElement(By.id("ius-password")).sendKeys("webtax123!");
		driver.findElement(By.id("ius-sign-in-submit-btn")).click();
		
    String actualText = driver.findElement(By.id("ius-sign-in-error")).getText();
				
				
				
	              String expectedText = "Sorry the user ID or password you entered is incorrect.\nI forgot my user ID or password" ;
	              
	
	          
	            Assert.assertEquals(expectedText,actualText);
	
	            System.out.println(actualText);
	            System.out.println(expectedText);
	
	}
	

	
	@BeforeMethod
  public void beforeMethod() {
		  
		  driver = new FirefoxDriver();
	      driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
	 
	      //Launch the ITO
	 
	      driver.get("https://qa1.walker.intuit.com/login/#/signin");	
		
  }

 
	
	@AfterMethod
  public void afterMethod() {
		driver.quit();
  }


  
}
