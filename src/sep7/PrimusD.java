package sep7;
import org.openqa.selenium.By;
import org.testng.Reporter;
import org.testng.annotations.Test;
import Configpackages.Apputil2;
public class PrimusD extends Apputil2 {
   @Test
 public void branches() {
	   driver.findElement(By.xpath("(//img)[5]")).click();
	  Reporter.log("clicked branch button",true);
   }
   
   @Test
   public void roles() {
  	   driver.findElement(By.xpath("(//img)[6]")).click();
  	  Reporter.log("clicked roles button",true);
     }
   
   @Test
   public void users() {
  	   driver.findElement(By.xpath("(//img)[7]")).click();
  	  Reporter.log("clicked roles button",true);
     }
   
   @Test
   public void employees() {
  	   driver.findElement(By.xpath("(//img)[8]")).click();
  	  Reporter.log("clicked roles button",true);
     }
}
