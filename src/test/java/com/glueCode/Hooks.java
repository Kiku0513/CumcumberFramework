package com.glueCode;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;
import com.utils.Utils;


public class Hooks extends Utils
{
	
	public static String scenarioName="";
	
	@Before
	public void beforeScenario(Scenario scenario)
	{
		scenarioName=scenario.getName();
		System.out.println("Scenario Name:"+scenarioName);
		Utils.launchBrowser();
	}
	
	@After
	public void afterScenario()
	{
		driver.quit();
	}


}
