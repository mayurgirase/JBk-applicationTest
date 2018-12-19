package com.jbk.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.jbk.qa.base.Base;

public class Homepage extends Base{
	/*@FindBy(xpath=".//*[@id='mainleft']/h1")
	WebElement leftheading1;
	
	@FindBy(xpath=".//*[@id='mainleft']/p/strong")
	WebElement leftheading_p;
	
	@FindBy(xpath="//input[@type,'button']")
	WebElement live_videos;
	
	@FindBy(xpath=".//*[@id='mainright']/h4[1]")
	WebElement official_Enquiry;
	
	@FindBy(xpath=".//*[@id='mainright']/h4[1]")
	WebElement whatsapp_sms;
	*/
	@FindBy(xpath=".//*[@id='cssmenu']/ul/li[1]/a")
	WebElement home;
	
	@FindBy(xpath=".//*[@id='cssmenu']/ul/li[2]/a")
	WebElement aboutsir;
	
	@FindBy(xpath=".//*[@id='cssmenu']/ul/li[3]/a")
	WebElement javasyllabus;
	
	@FindBy(xpath=".//*[@id='cssmenu']/ul/li[4]/a")
	WebElement selenium_testing;
	
	@FindBy(xpath="//a[]contains(text(),'Videos'")
	WebElement videos;
	
	@FindBy(xpath="//a[]contains(text(),'Services'")
	WebElement Services;
	
	@FindBy(xpath="//a[]contains(text(),'Careers'")
	WebElement Careers;
	
	
	@FindBy(xpath="//a[]contains(text(),'Gallery'")
	WebElement Gallery;
	
	@FindBy(xpath="//a[]contains(text(),'My Book'")
	WebElement My_Book;
	
	@FindBy(xpath="//a[]contains(text(),'Old Student Feedback'")
	WebElement Old_Student_Feedback;
	
	
	@FindBy(xpath="//a[]contains(text(),'Class Room Examples'")
	WebElement Class_Room_Examples;
	
	@FindBy(xpath=".//*[@id='cssmenu']/ul/li[12]/a")
	WebElement Contact;
	
	@FindBy(xpath="//a[]contains(text(),'Interview Questions'")
	WebElement Interview_Questions;
	
	@FindBy(xpath="//a[]contains(text(),'Tutorials'")
	WebElement Tutorials;
	
	@FindBy(xpath="//a[]contains(text(),'Corporate Training'")
	WebElement Corporate_Training;
	
	@FindBy(xpath=".//*[@id='corejava']")
	WebElement corejava;
	
	@FindBy(xpath=".//*[@id='testing']")
	WebElement testing;
	
	@FindBy(xpath=".//*[@id='angularjs']")
	WebElement weekdays;
	
	@FindBy(xpath=".//*[@id='weekend']")
	WebElement weekend;
	
	@FindBy(xpath=".//*[@id='content']/div")
	WebElement contents;
	
	@FindBy(xpath=".//*[@id='about']")
	WebElement about;
	
	@FindBy(xpath="html/body/div[5]/div/table")
	WebElement table;
	
	@FindBy(xpath="html/body/div[6]")
	WebElement container;
	/*@FindBy(xpath=".//*[@id='content']/div/h3[1]")
	WebElement contentfirst;
	
	@FindBy(xpath=".//*[@id='content']/div/h3[2]']")
	WebElement contentscnd;
	
	@FindBy(xpath=".//*[@id='content']/div/h3[3]")
	WebElement contentthird;
	
	@FindBy(xpath=".//*[@id='content']/div/h3[4]")
	WebElement contentfourth;
	
	@FindBy(xpath=".//*[@id='content']/div/h3[5]")
	WebElement contentfifth;
	
	@FindBy(xpath=".//*[@id='content']/div/p")
	WebElement contentsixth;
	
	@FindBy(xpath=".//*[@id='box']/h1")
	WebElement box;
	
	@FindBy(xpath=".//*[@id='about']]")
	WebElement about;
	*/
	
	
	
	//initialization of objects
		public Homepage() {
			PageFactory.initElements(driver, this);
		}
		
		//Actions:
		public String validatepagetitle() {
			return driver.getTitle();
		}
		
		public boolean verifycorejava() {
			return corejava.isDisplayed();
			 
			
		}
		
		public boolean verifytesting() {
			return testing.isDisplayed();
			
		}
		
		public boolean verifyweekdays() {
			return weekdays.isDisplayed();
			
		}
		
		public boolean verifyweekend() {
			return weekend.isDisplayed();
			
		}
		
		public boolean verifyContents() {
			return contents.isDisplayed();
			
		}
		
		public boolean verifyabouts() {
			return about.isDisplayed();
			
		}
		
		public boolean verifytable() {
			return table.isDisplayed();
			
		}
		
		public boolean verifycontainer() {
			return container.isDisplayed();
			
		}

		
		public Homepage clickOnHomelink() {
			home.click();
			
			//home.isDisplayed();
			return new Homepage();
		}
		
		public Aboutsirpage clickOnAboutsirlink() {
			aboutsir.click();
			return new Aboutsirpage();
		}
		
		public Javasyllabuspage clickOnjavasyllabuslink() {
			javasyllabus.click();
			return new Javasyllabuspage();
		}
		
		public Seleniumtestingpage clickOnseleniumtestinglink() {
			selenium_testing.click();
			return new Seleniumtestingpage();
		}
		
		public Videospage clickOnvideoslink() {
			videos.click();
			return new Videospage();
		}
		
		public Servicespage clickOnseviceslink() {
			Services.click();
			return new Servicespage();
		}
		
		public Careerspage clickOncareeslink() {
			Careers.click();
			return new Careerspage();
		}
		
		public Gallerypage clickOngallerylink() {
			Gallery.click();
			return new Gallerypage();
		}
		
		public OldStudentFeedbackpage clickOnoldstudentfeedbacklink() {
			Old_Student_Feedback.click();
			return new OldStudentFeedbackpage();
		}
		
		public ClassroomExamplepage clickOnclassroomexamplelink() {
			Class_Room_Examples.click();
			return new ClassroomExamplepage();
		}
		
		public Contactpage clickOncontactlink() {
			Contact.click();
			return new Contactpage();
		}
		
		public InterviewQuestionpage clickOninterviewquestions() {
			Interview_Questions.click();
			return new InterviewQuestionpage();
		}
		
		public Tuitorialspage clickOntutoriallink() {
			Tutorials.click();
			return new Tuitorialspage();
		}
		
		public Corporatetrainingpage clickOncorporatetraining() {
			Corporate_Training.click();
			return new Corporatetrainingpage();
		}
		
		
		
		
}






