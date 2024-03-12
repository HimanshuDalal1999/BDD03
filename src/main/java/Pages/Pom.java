package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Pom 
{
	WebDriver driver;
	
	@FindBy (xpath = "//div[@class='desktop-logoContainer']") private WebElement validatingLogo;
	@FindBy (xpath = "(//span[@class='desktop-userTitle'])[2]") private WebElement clickingWishlistbutton;
	@FindBy (xpath = "//div[@class='wishlistLogin-heading']") private WebElement validatingLogin;
	
	//@FindBy (xpath = "") private WebElement aa;
	
//=============================================	
	public Pom(WebDriver driver)
	{
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
//=============================================
//--------------------------------------1st----------------------------------------------	
	public boolean VerifyLogo()
	{
		boolean Logo = validatingLogo.isDisplayed();
		return Logo;
	}
//--------------------------------------2nd--------------------------------------------------	
	public boolean VerifyWishlist()
	{
		clickingWishlistbutton.click();
		boolean Login = validatingLogin.isDisplayed();
		return Login;
	}
	

}
