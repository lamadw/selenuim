package facebook;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class test {

 
 public static void main(String[] args) {
	 System.setProperty("webdriver.gecko.driver","C:\\geckodriver-v0.19.1-win64\\geckodriver.exe");
  WebDriver driver=new FirefoxDriver();
  driver.get("http://www.facebook.com");
  driver.findElement(By.id("email")).sendKeys("lamadwekat2015@gmail.com");
  driver.findElement(By.id("pass")).sendKeys("LAMALAMA1234");
  driver.findElement(By.id("u_0_2")).click();

 }

}