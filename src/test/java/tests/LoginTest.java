package tests;

import base.BaseTest;
import pages.LoginPage;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;

public class LoginTest extends BaseTest {

 @Test
 public void validLoginTest() {
   LoginPage login = new LoginPage(driver);
   login.openLoginPage();
   login.login("John Doe", "ThisIsNotAPassword");
   WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
   String header =  wait.until(
           ExpectedConditions.visibilityOfElementLocated(By.tagName("h2"))
   ).getText();
		   
		   //driver.findElement(By.tagName("h2")).getText();
   Assert.assertEquals(header, "Make Appointment");
   Assert.assertTrue(driver.getCurrentUrl().contains("appointment"));
 }
}
