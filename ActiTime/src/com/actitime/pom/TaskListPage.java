package com.actitime.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class TaskListPage {
	
	@FindBy(xpath="//div[.='Add New']")
	private WebElement AddNewBtn;
	@FindBy(xpath="//div[.='+ New Customer']")
	private WebElement NewCustomer;
	@FindBy(className = "inputFieldWithPlaceholder newNameField inputNameField")
	private WebElement CustomerName;
	@FindBy(xpath = "//textarea[@placeholder='Enter Customer Description']")
	private WebElement CustomerDescrpition;
	@FindBy(xpath = "//div[@class='selectedItem' and @style=\"display: block;\"]")
	private WebElement selectCustomer;
	@FindBy(xpath = "(//div[.='Our company'])[10]")
	private WebElement ourCompany;
	@FindBy(xpath = "//div[.='Create Customer']")
	private WebElement CreateCustomer;
	
	public TaskListPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}

	

	public WebElement getAddNewBtn() {
		return AddNewBtn;
	}



	public WebElement getNewCustomer() {
		return NewCustomer;
	}



	public WebElement getCreateCustomer() {
		return CreateCustomer;
	}



	public void setCustomerName(WebElement customerName) {
		CustomerName = customerName;
	}

	public void setCustomerDescrpition(WebElement customerDescrpition) {
		CustomerDescrpition = customerDescrpition;
	}

	public void setSelectCustomer(WebElement selectCustomer) {
		this.selectCustomer = selectCustomer;
	}

	public void setOurCompany(WebElement ourCompany) {
		this.ourCompany = ourCompany;
	}

	
	
}
