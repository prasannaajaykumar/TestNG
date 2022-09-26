package Configpackages;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.Reporter;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
public class Apputil3 {
public static WebDriver driver;

	@BeforeSuite
	public static void setup() {
	driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().deleteAllCookies();
	driver.get("https://www.facebook.com/");
	driver.findElement(By.name("email")).sendKeys("9542917637");
	driver.findElement(By.name("pass")).sendKeys("marchipoya123");
	driver.findElement(By.name("login")).click();
	Reporter.log("Login successfully",true);
	}

	@AfterSuite
	public static void teardown() throws Throwable{
	driver.findElement(By.xpath("(//*[name()='image'])[1]")).click();
	Actions act=new Actions(driver);
	WebElement cg= driver.findElement(By.xpath("(//span[normalize-space()='Log Out'])[1]"));
	act.moveToElement(cg).click().perform();
	Reporter.log("Logout successfully",true);
	driver.close();
	}
}
