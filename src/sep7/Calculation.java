package sep7;
import org.openqa.selenium.By;
import org.testng.Reporter;
import org.testng.annotations.Test;
import Configpackages.AppUtil1;
public class Calculation extends AppUtil1{
@Test
public void addition() {
	driver.findElement(By.name("display")).sendKeys("25");
	driver.findElement(By.xpath("(//input[@id='btn'])[6]")).click();
	driver.findElement(By.name("display")).sendKeys("25");
	driver.findElement(By.xpath("(//input[@id='btn'])[20]")).click();
	String add=driver.findElement(By.name("display")).getAttribute("value");
	Reporter.log(add,true);
}
@Test
public void multiplication() throws Throwable {
	driver.findElement(By.name("display")).sendKeys("25");
	Thread.sleep(5000);
	driver.findElement(By.xpath("(//input[@id='btn'])[16]")).click();
	driver.findElement(By.name("display")).sendKeys("2");
	Thread.sleep(5000);
	driver.findElement(By.xpath("(//input[@id='btn'])[20]")).click();
	Thread.sleep(5000);
	String mul=driver.findElement(By.name("display")).getAttribute("value");
	Reporter.log(mul,true);
}
}

