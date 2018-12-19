package com.jbk.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.jbk.qa.base.Base;

public class Javasyllabuspage extends Base{
	
	@FindBy(xpath=".//*[@id='bannerleft']/span/h1")
	WebElement javasyllabustxt;
	
	@FindBy(xpath=".//*[@id='bannerleft']/span/a")
	WebElement j2eedownloadlink;
	
	@FindBy(xpath=".//*[@id='whatsapp']")
	WebElement whatsappshare;
	
	@FindBy(xpath=".//*[@id='bannerright']/div/a/span")
	WebElement homelink;
	
	@FindBy(xpath=".//*[@id='bannerright']/div/div/a/span")
	WebElement javsyllabuslink;
	
	@FindBy(xpath="html/body/div[4]/div[1]/div[1]/h2")
	WebElement corejava;
	
	@FindBy(xpath="html/body/div[4]/div[1]/div[1]")
	WebElement corejava_content;
	
	@FindBy(xpath="html/body/div[4]/div[1]/div[2]/h2")
	WebElement advancedjava;
	
	@FindBy(xpath="html/body/div[4]/div[1]/div[1]")
	WebElement advancedjava_content;
	
	@FindBy(xpath="html/body/div[4]/div[1]/div[3]/h2")
	WebElement j2ee;
	
	@FindBy(xpath="html/body/div[4]/div[1]/div[3]")
	WebElement j2ee_content;
	
	@FindBy(xpath="html/body/div[4]/div[1]/div[4]/h2")
	WebElement tools;
	
	@FindBy(xpath="html/body/div[4]/div[1]/div[4]")
	WebElement tools_content;
	
	@FindBy(xpath="html/body/div[4]/div[1]/div[5]/h2")
	WebElement webserver_applicationserver;
	
	@FindBy(xpath="html/body/div[4]/div[1]/div[5]")
	WebElement webserver_applicationserver_content;
	
	
	//initialization of objects
	public Javasyllabuspage() {
			PageFactory.initElements(driver, this);
			}
				
		//Actions:
	public String validatepagetitle() {
			return driver.getTitle();
			}

	public String javsyllabustxt() {
		return javasyllabustxt.getText();
	}

	public void clickOnJ2eeDownloadlink() {
		j2eedownloadlink.click();
		
	}
	
	public void clickOnhomelink() {
		homelink.click();
		
	}
	
	public void clickOnwhatsapplink() {
		whatsappshare.click();
		
	}
	
	public void clickOnjavsyllabuslink() {
		javsyllabuslink.click();
	}
	
	public String verify_corejava() {
		return corejava.getText();
		
	}
	
	public String verify_advancedjava() {
		return advancedjava.getText();
		
	}
	
	public String verify_j2ee() {
		return j2ee.getText();
		
	}
	
	public String verify_tools() {
		return tools.getText();
		
	}
	
	public String verify_webserver_applicationserver() {
		return webserver_applicationserver.getText();
		
	}
	
	
	public boolean verifycorejava_content() {
		return corejava_content.isDisplayed();
		
	}
	
	public boolean verifyadvancedjava_content() {
		return advancedjava_content.isDisplayed();
		
	}
	
	public boolean verifyj2ee_content() {
		return j2ee_content.isDisplayed();
		
	}
	
	public boolean verifytools_content() {
		return tools_content.isDisplayed();
		
	}
	
	public boolean verifyweserver_applicationserver_content() {
		return webserver_applicationserver_content.isDisplayed();
		
	}
	
	
}
