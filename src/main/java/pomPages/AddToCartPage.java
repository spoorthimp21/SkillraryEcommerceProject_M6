package pomPages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AddToCartPage {
	//Declaration
	//address of + icon
	@FindBy(id="add")
	private WebElement addbtn;
	//address of add to cart button
	@FindBy(xpath="//button[text()=' Add to Cart']")
	private WebElement cartbtn;
	
	//initialization
	public AddToCartPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}

	
	//utilization
	public WebElement getAddbtn() {
		return addbtn;
	}
	
	public void carttocartbtn() {
		cartbtn.click();
	}

	
	

}
