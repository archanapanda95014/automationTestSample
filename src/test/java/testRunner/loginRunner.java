package testRunner;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
	@CucumberOptions(
			features="src/test/java/features/login.feature",
			glue="loginGlue")
	public class loginRunner {

}
