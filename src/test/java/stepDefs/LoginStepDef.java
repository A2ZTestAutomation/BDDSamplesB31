package stepDefs;

import java.util.List;
import java.util.Map;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.Assert;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;

public class LoginStepDef {
	WebDriver driver;
	@Given("User is on Login Page")
	public void user_is_on_login_page() {
		WebDriverManager.edgedriver().setup();
		driver = new EdgeDriver();
	 
	}
//	@When("User enter credentials")
//	public void user_enter_credentials() {
//		driver.get("http://the-internet.herokuapp.com/login");
//		driver.findElement(By.xpath("//input[@id='username']")).sendKeys("tomsmith");
//		driver.findElement(By.name("password")).sendKeys("SuperSecretPassword!");
//		driver.findElement(By.className("radius")).click();
//	}
	
//	@When("User enter {string} and {string}")
//	public void user_enter_and(String strUser, String strPwd) {
//		driver.get("http://the-internet.herokuapp.com/login");
//		driver.findElement(By.xpath("//input[@id='username']")).sendKeys(strUser);
//		driver.findElement(By.name("password")).sendKeys(strPwd);
//		driver.findElement(By.className("radius")).click();
//	}
	
	//Using Datatable as lists
//	@When("User enter credentials")
//	public void user_enter_credentials(DataTable dataTable) {
//		List<List<String>> data = dataTable.asLists();
//		String strUser = data.get(0).get(0);
//		String strPwd = data.get(0).get(1);
//		driver.get("http://the-internet.herokuapp.com/login");
//		driver.findElement(By.xpath("//input[@id='username']")).sendKeys(strUser);
//		driver.findElement(By.name("password")).sendKeys(strPwd);
//		driver.findElement(By.className("radius")).click();
//		
//	}
	
	//Using Datatable as Map
	@When("User enter credentials")
	public void user_enter_credentials(DataTable dataTable) {
		List<Map<String, String>> data = dataTable.asMaps();
		String strUser = data.get(0).get("username");
		String strPwd = data.get(0).get("password");
		driver.get("http://the-internet.herokuapp.com/login");
		driver.findElement(By.xpath("//input[@id='username']")).sendKeys(strUser);
		driver.findElement(By.name("password")).sendKeys(strPwd);
		driver.findElement(By.className("radius")).click();
		
	}
	@Then("Should display Home Page")
	public void should_display_home_page(DataTable dataTable) {
		
		boolean isMsg = driver.findElement(By.cssSelector("successMsg")).isDisplayed();
		Assert.assertTrue(isMsg);
	}

}
