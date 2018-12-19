package com.jbk.qa.testcase;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.jbk.qa.base.Base;
import com.jbk.qa.pages.Aboutsirpage;
import com.jbk.qa.pages.Contactpage;
import com.jbk.qa.pages.Homepage;
import com.jbk.qa.pages.Javasyllabuspage;
import com.jbk.qa.pages.Seleniumtestingpage;
import com.jbk.qa.util.Testutil;

public class ContactTest extends Base {
	Homepage homepg;
	Aboutsirpage abtpg;
	Javasyllabuspage jvsypg;
	Seleniumtestingpage sltg;
	Contactpage ctpg;
	Testutil tsutil;
	String sheetName="Contact";
	private String eml;
	 public ContactTest() {
			super();
		}
		
		@BeforeMethod
		public void Setup() {
			Setbrowser();
			homepg=new Homepage();
			abtpg=new Aboutsirpage();
			jvsypg=new Javasyllabuspage();
			sltg= new Seleniumtestingpage();
			ctpg=new Contactpage();
			ctpg=homepg.clickOncontactlink();
			tsutil= new Testutil();
		}
		
		@Test(priority=1)
		public void contacttitle() {
			String title=ctpg.validatepagetitle();
			Assert.assertEquals(title, "Contact Us | Java By Kiran","Title not matched");
		}
		
		@Test(priority=2)
		public void verifyContact_GretingTest() {
			String greeting=ctpg.verifycontactgreeting();
		}
		
		@DataProvider
		public Object[][] getjbkdata() {
			Object data[][] =tsutil.getTestData(sheetName);
			return data;
		}
		@Test(priority=3,dataProvider="getjbkdata")
		public void Contact_Us_infoTest(String name,String email,String mobileno,String course,String message) {
			//homepg.clickOncontactlink();
			ctpg.Contact_Us_info(name, email, mobileno, course, message);
			
			
			/*ctpg.Contact_Us_info("Mayur", "mayurvgirase@gmail.com", "9421273956", "Selenium Testing", "Duration of course");
			ctpg.Contact_Us_info("Sunil", "sunil@gmail.com", "968594889", "Java - J2EEE" , "Duration of course");
			ctpg.Contact_Us_info("Suraj", "suraj@gmail.com", "968594889", "Call Back Request", "Duration of course");*/
		}
		
		@AfterMethod
		public void teardown() {
			driver.close();
		}

}
