package tests;

import base.BaseTest;
import pages.LoginPage;
import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

public class LoginTest extends BaseTest {

 @Test
 public void validLoginTest() {
   LoginPage login = new LoginPage(driver);
   login.openLoginPage();
   login.login("John Doe", "ThisIsNotAPassword");

   String header = driver.findElement(By.tagName("h2")).getText();
   Assert.assertEquals(header, "Make Appointment");
   Assert.assertTrue(driver.getCurrentUrl().contains("appointment"));
 }
}
