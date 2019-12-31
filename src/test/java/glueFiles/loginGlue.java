package glueFiles;

import org.junit.runner.RunWith;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import cucumber.api.junit.Cucumber;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

@RunWith(Cucumber.class)
public class loginGlue {
	
	@Given("^Access the email system given in \"([^\"]*)\"\\.$")
	public void access_the_email_system_given_in(String email1) throws Throwable {
	    System.out.println("login successful");
	    System.setProperty("webdriver.chrome.driver", "/Users/archanapanda/Desktop/ArchanaCodingDojo/Java/chromedriver");			    
	}

	@When("^Enter the \"([^\"]*)\" and \"([^\"]*)\" and submit\\.$")
	public void enter_the_and_and_submit(String login, String password) throws Throwable {
		WebDriver driver = new ChromeDriver();
		driver.get("https://mail.google.com/");
		driver.findElement(By.id("identifierId")).sendKeys(login);
		driver.findElement(By.xpath("//*[@id=\"identifierNext\"]/span/span")).click();
		
		WebDriverWait wait = new WebDriverWait(driver, 10);
		WebElement element = wait.until(
		    ExpectedConditions.visibilityOfElementLocated(By.name("password")));
		driver.findElement(By.xpath("//*[@id=\"password\"]/div[1]/div/div[1]/input")).sendKeys(password);
		driver.findElement(By.xpath("//*[@id=\"passwordNext\"]/span/span")).click();
	}

	@Then("^Verify login is successful\\.$")
	public void verify_login_is_successful() throws Throwable {
		System.out.println("confirmation successful");
	}
}
