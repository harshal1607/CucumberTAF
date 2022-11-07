package StepDefination;

import com.automationPractice.pageFactory.AutomationPractice;

import cucumber.api.java.After;
import cucumber.api.java.Before;
import generic.BaseTest;
import generic.Pojo;

public class Hooks extends BaseTest  {
	private BaseTest objbaseTest ;

	public Hooks(){
		objbaseTest= new BaseTest();
	}
	@Before
	public void beforeMethod(){
		objbaseTest.intializeWebEnvironment();
	}
	@After
	public void afterMethod(){
		objbaseTest.tearDownWebEnvironment();
	}
	//	public void browserSetUp(){
	//		//objAutomationPractice.beforeMethod();
	//		//System.out.println("Browser setup before hook");
	//
	//	}
	//	@After
	//	public void browserClosing(){
	//		objAutomationPractice.afterMethod();
	//		//System.out.println("Browser close after hook");
	//	}
}
