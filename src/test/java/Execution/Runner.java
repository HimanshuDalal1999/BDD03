package Execution;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions
	(
		features = {"src\\test\\resources\\Files\\Ecom.feature"},
		
		glue = {"Execution"},
		
		publish = true
		
	)

public class Runner extends AbstractTestNGCucumberTests
{
	

}
