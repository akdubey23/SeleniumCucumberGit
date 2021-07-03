
package stepDefination;

import java.io.File;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.io.FileHandler;
import org.openqa.selenium.safari.SafariDriver;

import cucumber.api.PendingException;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class SmokeTest {
	
WebDriver driver;
	
@Given("^Login into Safari Driver$")
public void login_into_Safari_Driver() throws Throwable {
    // Write code here that turns the phrase above into concrete actions
    throw new PendingException();
}

@Given("^Search and add Documention in todo list$")
public void search_and_add_Documention_in_todo_list() throws Throwable {
    // Write code here that turns the phrase above into concrete actions
    throw new PendingException();
}

@Given("^Search and add API References in todos list$")
public void search_and_add_API_References_in_todos_list() throws Throwable {
    // Write code here that turns the phrase above into concrete actions
    throw new PendingException();
}

@Then("^verify that search results should be added$")
public void verify_that_search_results_should_be_added() throws Throwable {
    // Write code here that turns the phrase above into concrete actions
    throw new PendingException();
}

	
}