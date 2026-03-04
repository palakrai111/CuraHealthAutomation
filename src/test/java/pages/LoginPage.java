package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage {

 WebDriver driver;

 private By menu = By.id("menu-toggle");
 private By loginLink = By.linkText("Login");
 private By username = By.id("txt-username");
 private By password = By.id("txt-password");
 private By loginBtn = By.id("btn-login");

 public LoginPage(WebDriver driver) {
   this.driver = driver;
 }

 public void openLoginPage() {
   driver.findElement(menu).click();
   driver.findElement(loginLink).click();
 }

 public void login(String user, String pass) {
   driver.findElement(username).sendKeys(user);
   driver.findElement(password).sendKeys(pass);
   driver.findElement(loginBtn).click();
 }
}
