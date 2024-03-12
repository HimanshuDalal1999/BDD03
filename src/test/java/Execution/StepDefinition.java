package Execution;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;

import Pages.DriverFactory;
import Pages.Pom;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class StepDefinition
{
	Pom pom = new Pom(DriverFactory.GetDriver());
	WebDriver driver = DriverFactory.GetDriver();
	
//------------------------------------------------------------------	
	@Given("User should be at Home page")
	public void user_should_be_at_home_page() 
	{
	   driver = DriverFactory.GetDriver();
	   driver.get("https://www.myntra.com/");
	}
	@Then("User should see the Logo of Application")
	public void user_should_see_the_logo_of_application() 
	{
	    boolean Logo = pom.VerifyLogo();
	    Assert.assertTrue(Logo);
	}
//-------------------------------------------------------------------
	@When("User clicks on Wishlist button")public void UserclicksonWishlistbutton(){}
	
	@Then("System should suggest to do Login to user")
	public void SystemshouldsuggesttodoLogintouser()
	{
		boolean Wishlist = pom.VerifyWishlist();
		Assert.assertTrue(Wishlist);
	}
	
	

}
