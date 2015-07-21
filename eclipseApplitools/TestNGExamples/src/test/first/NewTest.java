
package test.first;

import org.openqa.selenium.By;

import org.openqa.selenium.WebDriver;

import org.openqa.selenium.WebElement;

import org.openqa.selenium.firefox.FirefoxDriver;

import org.testng.Assert;

import org.testng.annotations.Test;

 

	public class NewTest{
       public WebDriver driver = new FirefoxDriver();
       String appUrl = "https://accounts.google.com";
 
@Test
public void gmailLogin() {
             // launch the firefox browser and open the application url
              driver.get("https://gmail.com");
              
// maximize the browser window
              driver.manage().window().maximize();
              
// declare and initialize the variable to store the expected title of the webpage.
              String expectedTitle =  "Sign in - Google Accounts" ;
              
// fetch the title of the web page and save it into a string variable
              String actualTitle = driver.getTitle();
              Assert.assertEquals(expectedTitle,actualTitle);
              
// enter a valid username in the email textbox
              WebElement username = driver.findElement(By.id("Email"));
              username.clear();
              username.sendKeys("TestSelenium");
 
// enter a valid password in the password textbox
              WebElement password = driver.findElement(By.id("Passwd"));

           password.clear();

           password.sendKeys("password123");

           

// click on the Sign in button

              WebElement SignInButton = driver.findElement(By.id("signIn"));

              SignInButton.click();

              

// close the web browser

              driver.close();

}

}