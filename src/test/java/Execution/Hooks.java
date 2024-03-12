package Execution;

import java.time.Duration;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;


import Pages.DriverFactory;
import io.cucumber.java.After;
import io.cucumber.java.AfterAll;
import io.cucumber.java.BeforeAll;
import io.cucumber.java.Scenario;

public class Hooks 
{
	static WebDriver driver;
	static DriverFactory DF;
	
	@BeforeAll
	public static void OpenBrowser()
	{
		 DF = new DriverFactory();
		driver = DF.InitializeBrowser("Chrome");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
	}

	@After
	public void TearDown(Scenario scenario) //Here Scenario is a class of cucumber on the basis of that we can get the failed scenario
	{
		boolean isFailed = scenario.isFailed();
		
		if(isFailed)
		{
			String ScenarioName = scenario.getName();
			ScenarioName.replaceAll(" ", "_");
			TakesScreenshot TS = (TakesScreenshot)driver;
			byte[] Source = TS.getScreenshotAs(OutputType.BYTES); //since extent report accepts the screenshot in Byte format
			scenario.attach(Source, "image/png", ScenarioName);
		}
	}
	
	
	
	@AfterAll
		public static void CloseBrowser()
		{
			driver.close();
		}
	
	
	
}
