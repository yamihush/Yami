package test.first;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
 
public class FrameEx {
 
    public static void main(String[] args) {
        WebDriver driver = new FirefoxDriver();
 
        driver.get("http://selenium.googlecode.com/svn/trunk/docs/api/java/index.html");
        driver.switchTo().frame("packageListFrame");
       driver.findElement(By.linkText("interface in org.openqa.selenium.interactions")).click();
        
       /* List<WebElement> allElements = driver.findElements(By.xpath("//html/body/div/ul/li")); 

        for (WebElement element: allElements) {
              System.out.println(element.getText());
        }*/
        driver.quit();
        
    }
}