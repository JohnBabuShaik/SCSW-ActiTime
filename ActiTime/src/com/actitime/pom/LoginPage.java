package com.actitime.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
@FindBy(id="username")
private WebElement UNTBX;

@FindBy(name="pwd")
private WebElement PWTBX;

@FindBy(xpath="//div[text()='Login ']")
private WebElement LNBTN;
public LoginPage(WebDriver driver) {
	PageFactory.initElements(driver, this);
}
public void setLogin(String un, String pw) {
	UNTBX.sendKeys(un);
	PWTBX.sendKeys(pw);
	LNBTN.click();
}
public void setUNTBX(String un) {
	UNTBX.sendKeys(un);
}
public void setPWTBX(String pw) {
	PWTBX.sendKeys(pw);
}
public void clickLogin() {
	LNBTN.click();
}
}
