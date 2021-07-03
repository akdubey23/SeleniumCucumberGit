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
	public void Login_into_Safari_Driver() throws Throwable {
		WebDriver   driver = new SafariDriver();
	    driver.get("http://todomvc.com/examples/vue/");
	    driver.manage().window().maximize();
	}

	@And("^Search and add Documention in todo list$")
	public void go_to_Vue_js_URL() throws Throwable {
	//Thread.sleep(5000);
	WebElement  ele1= driver.findElement(By.xpath("/html/body/section/header/input"));
	ele1.sendKeys("Documentation");
		driver.findElement(By.xpath("/html/body/section/header/input")).sendKeys(Keys.ENTER);
	  
	}

	@And("^Search and add API References in todos list$")
	public void add_Documentation_in_todos_list() throws Throwable {
		Thread.sleep(5000);
		driver.findElement(By.xpath("/html/body/section/header/input")).sendKeys("API References");
		driver.findElement(By.xpath("/html/body/section/header/input")).sendKeys(Keys.ENTER);
	}

	
	
	@Then("^verify that search results should be added$")
	public void verify_that_search_results_should_be_added() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		int flag=0;
	    List<WebElement>mylist= driver.findElements(By.xpath("/html/body/section/section/ul"));
	    for(int i=0;i<mylist.size(); i++)
	    {
	    	String firstele=mylist.get(i).getText();
	    	if(firstele.contains("Documenatation"))
	    	{
	    		flag=1;
	    	}
	    }
	    
	}
	
}

