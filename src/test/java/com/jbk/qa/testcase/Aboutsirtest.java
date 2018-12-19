package com.jbk.qa.testcase;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.jbk.qa.base.Base;
import com.jbk.qa.pages.Aboutsirpage;
import com.jbk.qa.pages.Contactpage;
import com.jbk.qa.pages.Homepage;
import com.jbk.qa.pages.Javasyllabuspage;

public class Aboutsirtest extends Base {
	Homepage homepg;
	Aboutsirpage abtpg;
	Javasyllabuspage jvsypg; 
	 public Aboutsirtest() {
			super();
		}
		
		@BeforeMethod
		public void Setup() {
			Setbrowser();
			homepg=new Homepage();
			abtpg=new Aboutsirpage();
			jvsypg=new Javasyllabuspage();
			homepg.clickOnAboutsirlink();
		}
		
		@Test(priority=1)
		public void AboutsirtitleTest() {
			String title=abtpg.validatepagetitle();
			Assert.assertEquals(title, "About Us | Java By Kiran","Title not matched");
		}
		
		@Test(priority=2)
		public void aboutsirTxtTest() {
			Assert.assertTrue(abtpg.verifyAboutsirtxt(), "Not matched");
		}

		@Test(priority=3)
		public void aboutsircontentTest() {
			Assert.assertTrue(abtpg.verifyaboutsircontent(), "Not matched");
		}
		
		@Test(priority=4)
		public void HomelinkTest() {
			abtpg.clickOnHomelink();
		}
		
		@Test(priority=5)
		public void aboutsirlinkTest() {
			abtpg.aboutsirlink();
		}
		
		@Test(priority=6)
		public void jbksiteTest() {
			abtpg.jbksite();
		}
		
		@Test(priority=7)
		public void verifyjavasyllabuslinktest() {
			jvsypg=homepg.clickOnjavasyllabuslink();
		}
		@AfterMethod
		public void teardown() {
			driver.close();
		}
		
		
}
