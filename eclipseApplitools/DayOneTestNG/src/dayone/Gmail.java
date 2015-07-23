package dayone;

import org.testng.annotations.Test;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;

public class Gmail {
  
	
	 @BeforeTest
	  public void beforeTest() {
		  System.out.println("connecting to DB from Gmail");
		  
	  }
  @Test
  public void testreceviemail() {
  
  // Selenium code to Recevive the email
	  System.out.println("In Recevice Mail from Gmail");
  }
  
  @Test
  public void testsendmail() {
  
  // Selenium code to send the email
	  
	  System.out.println("In Sent Mail From Gmail");
  
  }
  
  
  @BeforeMethod
  public void beforeMethod() {
	  
	  System.out.println("In Before Method From Gmail");
  }

  
  @AfterTest
  public void AfterTest() {
	  System.out.println("Closing connection DB from Gmail");
  }


}
