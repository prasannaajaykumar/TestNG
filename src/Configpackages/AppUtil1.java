package Configpackages;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
public class AppUtil1 {
public static WebDriver driver;
@BeforeMethod
public static void setup() {
	driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().deleteAllCookies();
	driver.get("http://calc.qedgetech.com/");
}
@AfterMethod
public static void teardown() {
	driver.close();
}
}


