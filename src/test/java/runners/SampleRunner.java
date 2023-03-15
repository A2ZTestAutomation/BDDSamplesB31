package runners;

import org.testng.annotations.DataProvider;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
		features = "resources//features//",
		glue = {"stepDefs"},
		monochrome=true,
		dryRun=  false,
		plugin = {"pretty"
//				"html:target//Reports//HtmlReports.html",
//				"json:target//Reports//JsonReports.json",
//				"usage:target//Reports//UsageReport",
//				"com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:"
//				"rerun:target//failedscenarios.txt"
		}
		
		)
public class SampleRunner extends AbstractTestNGCucumberTests{
	
	//List of features with each may have list of scenarios [][]
	@DataProvider(parallel = true)
	public Object[][] scenarios(){
		return super.scenarios();
	}
	
 
}
