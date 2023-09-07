package pomPages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SkillrarySeleniumTrainingPage {
	
	//Declaration
	//address of selenium img
	//@FindBy(xpath="//img[@id='Selenium Training']")
	@FindBy(xpath="(//a[text()='Selenium Training'])[2]")
	private WebElement seleniumTrainingImg;
	//address of cart
	//@FindBy(xpath="//div[@id='cartArea']")
	@FindBy(id="mycart")
	private WebElement myCart;
	//address of fb icon
	@FindBy(xpath="(//i[@class='fa fa-facebook'])[2]")
	private WebElement fb;
	
	//initalization
		public SkillrarySeleniumTrainingPage(WebDriver driver) {
			PageFactory.initElements(driver, this);
		}

		public WebElement getSeleniumTrainingImg() {
			return seleniumTrainingImg;
		}

		public WebElement getMyCart() {
			return myCart;
		}
		
		public void fbBtn() {
			fb.click();
		}

		
	


}
