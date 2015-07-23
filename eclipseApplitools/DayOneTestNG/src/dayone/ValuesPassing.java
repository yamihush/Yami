package dayone;

import org.testng.annotations.Test;
import org.testng.Assert;
import org.testng.annotations.DataProvider;

public class ValuesPassing {
  @Test(dataProvider = "usernameprovider")
  public void f(String username, String pass) {
	  try{
	  Assert.assertEquals("yamihush", username);
	  }catch(Throwable t){
		  System.out.println("Error catch error catch");
	  }
	  
	  System.out.println(username+"-----"+pass+"------");
  }

  @DataProvider
  public Object[][] usernameprovider() {
    return new Object[][] {
      new Object[] { "yamihush", "9944426760" },
      new Object[] { "yamihush@gmail.com", "9944426760" },
    };
  }
}
