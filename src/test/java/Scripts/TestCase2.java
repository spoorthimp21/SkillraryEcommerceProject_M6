package Scripts;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

import genericLibrary.BaseClass;
import pomPages.SillraryDemoLoginPage;
import pomPages.SkillraryLoginPage;
import pomPages.SkillrarySeleniumTrainingPage;

public class TestCase2 extends BaseClass{
	@Test
	public void tc2() throws Throwable{
		
		SkillraryLoginPage s=new SkillraryLoginPage(driver);
		s.gearsbutton();
		s.skillrarydemoapplicaton();
		
		SillraryDemoLoginPage sd=new SillraryDemoLoginPage(driver);
		utilies.switchingtabs(driver);
		utilies.dropDown(sd.getCourseadd(), pdata.getPropertydata("courseadd"));
		SkillrarySeleniumTrainingPage tp=new SkillrarySeleniumTrainingPage(driver);
		utilies.dragdrop(driver, tp.getSeleniumTrainingImg(), tp.getMyCart());
	}

}
