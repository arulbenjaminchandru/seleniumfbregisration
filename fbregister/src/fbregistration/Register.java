package fbregistration;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Register {
	  WebDriver driver = new FirefoxDriver();
	@Test
  public void EnterFirstName() {
	  driver.findElement(By.id("u_0_1")).sendKeys("Priscilla");
  }
	@Test
  public void EnterLastName() {
	  driver.findElement(By.id("u_0_3")).sendKeys("Eben");
	  }
	@Test
  public void Email() {
	  driver.findElement(By.id("u_0_5")).sendKeys("pprisci26@gmail.com");
	  }
	@Test
  public void ConfirmEmail() {
	  driver.findElement(By.id("u_0_8")).sendKeys("pprisci26@gmail.com");
		  }
	@Test
  public void Password() {
	  driver.findElement(By.id("u_0_a")).sendKeys("selenium2016");
		  }
	@Test
  public void DateOfBirth() {
		driver.findElement(By.id("day")).click();
		driver.findElement(By.id("day")).sendKeys("23");
		driver.findElement(By.id("month")).click();
		  driver.findElement(By.id("month")).sendKeys("May");
		  driver.findElement(By.id("year")).click();
		  driver.findElement(By.id("year")).sendKeys("1989");
			  }
	@Test
	  public void Gender() {
		  driver.findElement(By.className("_58mt")).click();
			  }
	@Test
	public void Registration() {
		  driver.findElement(By.id("u_0_i")).click();
			  }
  @BeforeTest
  public void OpenFacebook() {
	  driver.get("http://www.facebook.com");
  }  
}
