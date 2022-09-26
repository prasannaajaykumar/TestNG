package sep13;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class ImplicitlyWait {
	public static void main(String[] args) throws Throwable {
		// script to use implicit wait    
		WebDriver driver=new FirefoxDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.navigate().to("https://www.facebook.com/");
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.findElement(By.linkText("Create New Account")).click();
		driver.findElement(By.name("firstname")).sendKeys("Ajay");
		driver.findElement(By.name("lastname")).sendKeys("kumar");
		driver.close();
	}

}
