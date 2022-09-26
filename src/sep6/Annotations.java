package sep6;
import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.AfterTest;

public class Annotations {
  WebDriver driver; //global variable
  @BeforeTest
  public void beforeTest() throws Throwable {
	  driver=new ChromeDriver();
	  driver.manage().window().maximize();
	  driver.manage().deleteAllCookies();
	  driver.get("http://primusbank.qedgetech.com/");
	  driver.findElement(By.id("txtuId")).sendKeys("Admin");
	  driver.findElement(By.id("txtPword")).sendKeys("Admin");
	  driver.findElement(By.id("login")).click();
	  Reporter.log("URL succesfully launched:",true);
  }
  @Test(priority=0)
  public void home() {
	  driver.findElement(By.xpath("//a[@href='adminflow.aspx']//img")).click();
	  Reporter.log("Clicked home",true);// true=for to print in console tab
  }
  @Test(priority=2,enabled=false)
  public void roles() {
	  driver.findElement(By.xpath("//a[@href='Admin_Roles_details.aspx']//img")).click();
	  Reporter.log("Clicked roles",true);
  }
  @Test(priority=1,invocationCount=5)
  public void employee() {
	  driver.findElement(By.xpath("//a[@href='Admin_Emp_details.aspx']//img")).click();
	  Reporter.log("clicked employee",true);
  }

  @AfterTest()
  public void afterTest() {
	  driver.quit();
	  Reporter.log("sucessfully completed operations",true);
  }

}
