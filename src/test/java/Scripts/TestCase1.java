package Scripts;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

import genericLibrary.BaseClass;
import pomPages.AddToCartPage;
import pomPages.SillraryDemoLoginPage;
import pomPages.SkillraryLoginPage;

public class TestCase1 extends BaseClass{
	
	@Test
	public void tc1() {
		SkillraryLoginPage s= new SkillraryLoginPage(driver);
		s.gearsbutton();
		s.skillrarydemoapplicaton();
		utilies.switchingtabs(driver);
		
		SillraryDemoLoginPage sd=new SillraryDemoLoginPage(driver);
		utilies.mouseHover(driver, sd.getCoursetab());
		sd.seleniumtrainingtab();
		
		AddToCartPage d=new AddToCartPage(driver);
		utilies.doubleClick(driver, d.getAddbtn());
		d.carttocartbtn();
		utilies.alertPopup(driver);
		
	}

}
