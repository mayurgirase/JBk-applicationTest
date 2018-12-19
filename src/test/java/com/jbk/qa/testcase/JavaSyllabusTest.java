package com.jbk.qa.testcase;

import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.jbk.qa.base.Base;
import com.jbk.qa.pages.Aboutsirpage;
import com.jbk.qa.pages.Homepage;
import com.jbk.qa.pages.Javasyllabuspage;
import com.jbk.qa.pages.Seleniumtestingpage;

public class JavaSyllabusTest extends Base {
	Homepage homepg;
	Aboutsirpage abtpg;
	Javasyllabuspage jvsypg;
	Seleniumtestingpage sltg;
	 public JavaSyllabusTest() {
			super();
		}
		
		@BeforeMethod
		public void Setup() {
			Setbrowser();
			homepg=new Homepage();
			abtpg=new Aboutsirpage();
			jvsypg=new Javasyllabuspage();
			sltg= new Seleniumtestingpage();
			//homepg.clickOnAboutsirlink();
			homepg.clickOnjavasyllabuslink();
			
		}
		
		@Test(priority=1)
		public void javasyllabustitle() {
			String title=jvsypg.validatepagetitle();
			Assert.assertEquals(title, "About Us | Java By Kiran","Title not matched");
		}
		
		@Test(priority=2)
		public void verifyjavasyllabusTest() {
			String jv=jvsypg.javsyllabustxt();
			Assert.assertEquals(jv, "Java-J2EE Syllabus");
		}
		
		/*@Test(priority=3)
		public void J2eeDownloadlinkTest() {
			jvsypg.clickOnJ2eeDownloadlink();
		}*/
		
		@Test(priority=4)
		public void homelinkTest() {
			jvsypg.clickOnhomelink();
		}
		
		@Test(priority=5)
		public void whatsapplinkTest() {
			jvsypg.clickOnwhatsapplink();
		}
		
		@Test(priority=6)
		public void javsyllabuslinkTest() {
			jvsypg.clickOnjavsyllabuslink();
		}
		
		@Test(priority=7)
		public void verifycorejava_contentTest() {
			jvsypg.verifycorejava_content();
		}
		
		@Test(priority=8)
		public void verifyadvancedjava_contentTest() {
			jvsypg.verifyadvancedjava_content();
		}
		
		@Test(priority=9)
		public void verifyj2ee_contentTest() {
			jvsypg.verifyj2ee_content();
		}
		
		@Test(priority=10)
		public void verifytools_contentTest() {
			jvsypg.verifytools_content();
		}
		
		@Test(priority=11)
		public void verifyweserver_applicationserver_contentTest() {
			jvsypg.verifyweserver_applicationserver_content();
		}
		
		@Test(priority=12)
		public void verifyseleniumtestinglinktest() {
			sltg=homepg.clickOnseleniumtestinglink();
		}
		@AfterMethod
		public void teardown() {
			driver.close();
		}
}
