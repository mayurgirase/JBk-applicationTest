package com.jbk.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.jbk.qa.base.Base;

public class Aboutsirpage extends Base {
	
	@FindBy(xpath=".//*[@id='bannerleft']/h1")
	WebElement Abputsirtext;
	
	@FindBy(xpath=".//*[@id='bannerright']/div/a/span")
	WebElement homelink;
	
	@FindBy(xpath=".//*[@id='bannerright']/div/div/a/span")
	WebElement aboutsirlink;
	
	@FindBy(xpath="html/body/div[4]")
	WebElement aboutsircontent;
	
	@FindBy(xpath="html/body/div[4]/div/div[1]/h2[2]/a")
	WebElement jbksite;
	
	//initialization of objects
	public Aboutsirpage() {
		PageFactory.initElements(driver, this);
		}
			
	//Actions:
	public String validatepagetitle() {
		return driver.getTitle();
		}
	
	public boolean verifyAboutsirtxt() {
		return Abputsirtext.isDisplayed();
	}
	
	public boolean verifyaboutsircontent() {
		return aboutsircontent.isDisplayed();
	}
	
	public void clickOnHomelink() {
		homelink.click();
	}
	public void aboutsirlink() {
		aboutsirlink.click();
	}
	
	public void jbksite() {
		jbksite.click();
	}
}
