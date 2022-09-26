package Configpackages;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
public class Apputil2 {
public static WebDriver driver;

     @BeforeMethod
     public static void setup() {
	 driver=new ChromeDriver();
	 driver.manage().window().maximize();
	 driver.manage().deleteAllCookies();
	 driver.get("https://www.facebook.com/");
	 driver.findElement(By.name("email")).sendKeys("9542917637");
	 driver.findElement(By.name("pass")).sendKeys("marchipoya123");
	 driver.findElement(By.name("login")).click();
}

    @AfterMethod
    public static void teardown() {
	driver.close();
}
}


