package sep8;
import java.io.FileInputStream;
import java.util.Properties;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Reporter;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Facebookk {
WebDriver driver;
Properties p;
WebDriverWait wait;
@BeforeTest
public void setup() throws Throwable {
	driver =new ChromeDriver();
	driver.manage().window().maximize();
	p=new Properties();
	p.load(new FileInputStream("C:\\PROJECT TESTING\\TestNG\\ajay.properties"));
	driver.get(p.getProperty("url"));
	Reporter.log("launched",true);
}
@Test
public void login() throws Throwable {
  driver.findElement(By.xpath(p.getProperty("username"))).sendKeys("9542917637");
  driver.findElement(By.xpath(p.getProperty("password"))).sendKeys("marchipoya123");
  driver.findElement(By.xpath(p.getProperty("login"))).click();
  Thread.sleep(5000);
}
@AfterTest
public void teardown () {
	wait=new WebDriverWait(driver, 20);
	wait.until(ExpectedConditions.elementToBeClickable(By.xpath(p.getProperty("logout"))));
	driver.findElement(By.xpath(p.getProperty("logout"))).click();
	Reporter.log("Logout",true);
    driver.close();
}
} 


