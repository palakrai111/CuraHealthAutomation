package tests;

import base.BaseTest;
import pages.LoginPage;
import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

public class LogoutTest extends BaseTest {

 @Test
 public void logoutTest() {
   LoginPage login = new LoginPage(driver);
   login.openLoginPage();
   login.login("John Doe", "ThisIsNotAPassword");

   driver.findElement(By.id("menu-toggle")).click();
   driver.findElement(By.linkText("Logout")).click();

   Assert.assertTrue(driver.getCurrentUrl().contains("cura"));
   Assert.assertTrue(driver.findElement(By.id("btn-make-appointment")).isDisplayed());
 }
}
