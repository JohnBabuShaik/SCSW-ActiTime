package com.actitime.generics;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;

import com.actitime.pom.HomePage;
import com.actitime.pom.LoginPage;

public class BaseClass {
static {
	System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
}
WebDriver driver;
FileLib f= new FileLib();
@BeforeTest
public void openbrowser() throws IOException {
	driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	
}
@AfterTest
public void closebrowser() {
	driver.close();
}
@BeforeMethod
public void Login() throws IOException {
	String URL = f.getPropertyValue("url");
	String un = f.getPropertyValue("username");
	String pw=f.getPropertyValue("password");
	driver.get(URL);
	LoginPage l= new LoginPage(driver);
	l.setLogin(un, pw);
	l.clickLogin();
}
@AfterMethod
public void logout() {
	HomePage h= new HomePage(driver);
	h.clickLogout();
}
}
