package sep7;
import org.openqa.selenium.By;
import org.testng.Reporter;
import org.testng.annotations.Test;
import Configpackages.Apputil3;
public class Faceebok extends Apputil3 {
 @Test(priority=0,invocationCount=2)
 public void friends() {
	driver.findElement(By.xpath("(//*[name()='svg'][@class='b6ax4al1 m4pnbp5e somyomsx ahndzqod gnhxmgs4'])[1]")).click();
	Reporter.log("friends clicked", true);
 }
 
 @Test(priority=1,invocationCount=5)
 public void videos() {
	driver.findElement(By.xpath("(//*[name()='svg'][@class='b6ax4al1 m4pnbp5e somyomsx ahndzqod gnhxmgs4'])[2]")).click();
	Reporter.log("videos clicked", true);
 }
 
 @Test(priority=2,enabled=false)
 public void home() {
	driver.findElement(By.xpath("//a[@aria-label='Home']//span[@class='om3e55n1']//*[name()='svg']")).click();
	Reporter.log("home clicked", true);
 }
 }

