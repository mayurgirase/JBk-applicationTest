package com.jbk.qa.testcase;

import org.apache.poi.ss.formula.ptg.AbstractFunctionPtg;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;


import com.jbk.qa.base.Base;
import com.jbk.qa.pages.Aboutsirpage;
import com.jbk.qa.pages.Contactpage;
import com.jbk.qa.pages.Homepage;

public class Hometst extends Base{
 Homepage homepg;
 Aboutsirpage abtpg;
 Contactpage contctpg;

	public Hometst() {
		super();
	}
	
	@BeforeMethod
	public void Setup() {
		Setbrowser();
		homepg=new Homepage();
		contctpg=new Contactpage();
		abtpg=new Aboutsirpage();
	}
	
	@Test(priority=1)
	public void HomepageTitleTest() {
		String title=homepg.validatepagetitle();
		Assert.assertEquals(title, "Best Industrial Java Classes | Selenium Training in Pune","Home page title not matched");
		
	}
	
	@Test(priority=2)
	public void verifyHomelinkTest() {
		 homepg=homepg.clickOnHomelink();
		 
		//Assert.assertEquals(homepg,"Home");
		
	}
	
	@Test(priority=3)
	public void verifycorejavatest() {
		Assert.assertTrue(homepg.verifycorejava(), "Not matched news");  ;
		
	}
	
	@Test(priority=4)
	public void verifytestingtest() {
		Assert.assertTrue(homepg.verifytesting(), "not matched news"); 	
	}
	
	@Test(priority=5)
	public void verifyweekdaysest() {
		Assert.assertTrue(homepg.verifyweekdays(), "not matched news"); 	
	}
	
	@Test(priority=6)
	public void verifyweekendtest() {
		Assert.assertTrue(homepg.verifyweekend(), "not matched news"); 	
	}
	
	@Test(priority=7)
	public void verifycontentstest() {
		Assert.assertTrue(homepg.verifyContents(), "not matched news"); 	
	}
	
	@Test(priority=8)
	public void verifyabouttest() {
		Assert.assertTrue(homepg.verifyabouts(), "not matched news"); 	
	}
	
	@Test(priority=9)
	public void verifytabletest() {
		Assert.assertTrue(homepg.verifytable(), "not matched news"); 	
	}
	
	@Test(priority=10)
	public void verifycontainerstest() {
		Assert.assertTrue(homepg.verifycontainer(), "not matched news"); 	
	}
	
	
	@Test(priority=11)
	public void verifyAboutsirtest() {
		homepg.clickOnAboutsirlink();
	}
	@Test(priority=12)
	public void verifyAboutsirlinkTest() {
		abtpg=homepg.clickOnAboutsirlink();
	}
	
	@Test(priority=13)
	public void verifyContactlinktest() {
		contctpg=homepg.clickOncontactlink();
		
	}
	
	@AfterMethod
	public void teardown() {
		driver.close();
	}
}
