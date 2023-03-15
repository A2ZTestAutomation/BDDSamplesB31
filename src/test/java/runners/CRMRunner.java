package runners;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
		features = "resources//taggedFeatures//",
		glue = {"stepDefs"},
		monochrome=true,
		dryRun=  false,
		plugin= {"html:target//Reports//HtmlReports.html"},
//		tags = "@SmokeTest"
//		tags = "@SmokeTest or @RegressionTest"
//		tags = "@SmokeTest and @RegressionTest"
//		tags ="not @SmokeTest"
//		tags = "@PhaseOne"
//		tags = "@PhaseTwo and @RegressionTest"
//		tags = "@PhaseOne and @SmokeTest or @PhaseTwo and @RegressionTest"
//		tags = "@PhaseOne and @SmokeTest or @PhaseOne and @RegressionTest"
		tags = "@PhaseOne"
		)
public class CRMRunner extends AbstractTestNGCucumberTests {

}
