package com.automationPractice.pageFactory;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import generic.BaseTest;
import generic.Pojo;

public class BackgroundPractice extends BaseTest{
	private Pojo objPojo;

	public BackgroundPractice(Pojo pojo){
		this.objPojo=pojo;
	}
	
	public void userEntersEmailidAndPassword() throws Throwable {
	    System.out.println("User enters user name and password");
	}

	
	public void userNavigatedToHomepage() throws Throwable {
	    System.out.println("User is on home page");

	}

	
	public void userIsLoggedIn() throws Throwable {
	    System.out.println("User is logged in");

	}

	
	public void userClcikOnElectronicsLink() throws Throwable {
	    System.out.println("User navigated to electronics link");

	}

	
	public void userNavigateToElectronicsPage() throws Throwable {
	    System.out.println("User navigated to electronics link");

	}

	
	public void userClcikMobilesTabletsLink() throws Throwable {
	    System.out.println("User navigated to electronics link");

	}

	
	public void userNavigateMobilesTabletsPage() throws Throwable {
	    System.out.println("User navigated to mobile and tablets link");

	}

}
