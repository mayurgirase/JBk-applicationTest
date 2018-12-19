package com.jbk.qa.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import com.jbk.qa.base.Base;

public class Contactpage extends Base{
	@FindBy(xpath=".//*[@id='bannerleft']/h11")
	WebElement contacttxt;
	
	@FindBy(xpath=".//*[@id='bannerright']/div/a/span")
	WebElement homelinkct;
	
	@FindBy(xpath=".//*[@id='bannerright']/div/div/a/span")
	WebElement contactlink;
	
	@FindBy(xpath="html/body/div[4]/div[1]/h2")
	WebElement contactgreeting;
	
	@FindBy(id="name")
	WebElement name;
	
	@FindBy(name="email")
	WebElement email;
	
	@FindBy(name="mob")
	WebElement mobileno;
	
	@FindBy(id="message")
	WebElement message;
	
	@FindBy(id="submit_btn")
	WebElement submit;
	
	@FindBy(xpath="//button[@type='reset' and @class='btn']")
	WebElement clear;
	
	@FindBy(xpath="html/body/div[4]/div[2]/figure/a/img")
	WebElement addressimage;
	
	@FindBy(xpath=".//*[@id='mapDiv']/div/div/div[9]/div/div/div/div[1]")
	WebElement address;
	
	@FindBy(xpath=".//*[@id='mapDiv']/div/div/div[9]/div/div/div/div[5]/a")
	WebElement reviewlink;
	
	@FindBy(xpath=".//*[@id='mapDiv']/div/div/div[9]/div/div/div/div[2]/div[1]/a")
	WebElement directionlink;
	
	@FindBy(xpath=".//*[@id='mapDiv']/div/div/div[9]/div/div/div/div[4]/div[1]")
	WebElement savelink;
	
	@FindBy(xpath=".//*[@id='mapDiv']/div/div/div[9]/div/div/div/div[7]/div/a")
	WebElement view_larger_maplink;
	
	//initialization of objects
		public Contactpage() {
				PageFactory.initElements(driver, this);
				}
					
		//Actions:
		public String validatepagetitle() {
				return driver.getTitle();
				}
		public void verifyContact_txt() {
			contacttxt.getText();
		}
		
		public String verifycontactgreeting() {
			return contactgreeting.getText();
		}
		public void clickonHomelink() {
			homelinkct.click();
		}
		
		public void clickonContactlink() {
			contactlink.click();
		}
		
		public boolean verifyAddress_txt() {
			return address.isDisplayed();
			
		}
		public void clickonReviewlink() {
			reviewlink.click();
		}
		
		public void clickonDirectionlink() {
			directionlink.click();
		}
		
		public void clickonSavelink() {
			savelink.click();
		}
		public void clickonView_Larger_maplink() {
			view_larger_maplink.click();
		}
		
		public void Contact_Us_info(String nm,String eml,String mb,String course,String msg) {
			Select select=new Select(driver.findElement(By.name("regarding")));
			
			
			name.sendKeys(nm);
			email.sendKeys(eml);
			mobileno.sendKeys(mb);
			select.selectByVisibleText(course);
			message.sendKeys(msg);
			submit.click();
			clear.click();
		}
		
		public boolean checkAddress_image() {
			return addressimage.isDisplayed();
			
		}
}
