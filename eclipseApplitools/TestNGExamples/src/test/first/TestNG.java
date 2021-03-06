package test.first;


import java.util.concurrent.TimeUnit;
 
import org.openqa.selenium.By;
 
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
//import org.openqa.selenium.firefox.FirefoxDriver;
//import org.openqa.selenium.safari.SafariDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;
 
import org.testng.annotations.BeforeMethod;
 
import org.testng.annotations.AfterMethod;
 
public class TestNG {
 
	public WebDriver driver;
	public WebDriver driver1;
	//public FirefoxDriver driver;
 
  @Test
 
  public void main() {
 
	// Find the element that's ID attribute is 'account'(My Account)
 
       sample("yamihush",driver);
       sample("yamihush",driver1);
       
     // driver.findElement(By.id("login-username")).sendKeys("yamihush");
      //driver1.findElement(By.id("login-username")).sendKeys("yamihush");
      // Find the element that's ID attribute is 'log' (Username)
 
      // Enter Username on the element found by above desc.
 
      driver.findElement(By.id("login-passwd")).sendKeys("9944426760");
      driver1.findElement(By.id("login-passwd")).sendKeys("9944426760");
      // Find the element that's ID attribute is 'pwd' (Password)
 
      // Enter Password on the element found by the above desc.
 
      
      // Now submit the form. WebDriver will find the form for us from the element
 
      driver.findElement(By.id("login-signin")).click();
 
      // Print a Log In message to the screen
 
      System.out.println(" Login Successfully, now it is the time to Log Off buddy.");
 
      // Find the element that's ID attribute is 'account_logout' (Log Out)
  }
  
  public void sample(String var, WebDriver far){
	  
	   far.findElement(By.id("login-username")).sendKeys(var);
	   driver.findElement(By.id("login-passwd")).sendKeys("9944426760");
  }
 
  @BeforeMethod
 
  public void beforeMethod() {
 
	  // Create a new instance of the Firefox driver
	  
	  System.setProperty("webdriver.chrome.driver", "//Users/mponnusamy/Desktop/chromedriver");
	  
      driver = new ChromeDriver();
      driver1 = new FirefoxDriver();
 
      //Put a Implicit wait, this means that any search for elements on the page could take the time the implicit wait is set for before throwing exception
 
      driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
 
      //Launch the Online Store Website
 
      driver.get("https://login.yahoo.com/");	
 
  }
 
  @AfterMethod
 
  public void afterMethod() {
 
	  // Close the driver
 
      driver.quit();
 
  }
 
}