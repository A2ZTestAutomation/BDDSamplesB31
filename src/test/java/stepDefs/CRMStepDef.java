package stepDefs;

import org.testng.annotations.BeforeSuite;


import io.cucumber.java.After;
import io.cucumber.java.AfterAll;
import io.cucumber.java.Before;
import io.cucumber.java.BeforeAll;
import io.cucumber.java.BeforeStep;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;

public class CRMStepDef {

		
	@Before
	public void setupChrome() {
		System.out.println("Initializing Chrome Browser........");
	}
//	@Before(value="@SmokeTest", order=1)
//	public void readProperty() {
//		System.out.println("REad from Property file.......");
//	}
//	
//	@Before(value="@RegressionTest", order=1)
//	public void setupEdge() {
//		System.out.println("Initializing Edge Browser........");
//	}
//	@Before(value="@RegressionTest", order=2)
//	public void connectDB() {
//		System.out.println("Connect with DB.....");
//	}
	
	@Given("User is logged in")
	public void user_is_logged_in() {
	    System.out.println("User is logged in");
	}
	@When("User delete a Deals")
	public void user_delete_a_deals() {
	    System.out.println("User delete a Deals");
	}

	@When("User update a task")
	public void user_update_a_task() {
	    System.out.println("User update a task");
	}
	
	
	@When("User update a Deals")
	public void user_update_a_deals() {
	   System.out.println("User update a Deals");
	}
	@When("User create a Contact")
	public void user_create_a_contact() {
	   System.out.println("Create a contact");
	}

	@When("User update a Contact")
	public void user_update_a_contact() {
		 System.out.println("Update a contact");
	}

	@When("User delete a task")
	public void user_delete_a_task() {
		 System.out.println("Delete a task");
	}
	@When("User delete a Contact")
	public void user_delete_a_contact() {
		System.out.println("Delete a contact");
	}
	@When("User create a Deals")
	public void user_create_a_deals() {
		System.out.println("Create a deal");
	}
	@When("User create a task")
	public void user_create_a_task() {
		System.out.println("Create a task");
	}
	
}
