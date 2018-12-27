
package stepDefination;

import java.io.File;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.io.FileHandler;
import org.openqa.selenium.safari.SafariDriver;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class SmokeTest {
	
	WebDriver driver;

@Given("^I want to login into SafariDriver$")
public void I_want_to_login_into_SafariDriver() throws Throwable {
	driver = new SafariDriver();
    driver.manage().window().maximize();

}

@Given("^login into SG Digital URL$")
public void login_into_SG_Digital_URL() throws Throwable {
	driver.get("https://www.sgdigital.com");
	
	Thread.sleep(5000);

}

@Then("^user can see new menu Career at the top SG Digital home page$")
public void user_can_see_new_menu_Career_at_the_top_SG_Digital_home_page() throws Throwable {
	driver.findElement(By.xpath("//*[@id=\"menu-main-menu-1\"]/li[8]/a"));
    Thread.sleep(5000);
    File screenshotFile3 = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
	FileHandler.copy(screenshotFile3, new File("./Screenshots/sgdigitalcareermenu.png"));
	System.out.println("Screenshot Taken for Career menu");
	

}

@Then("^able to click on menu Career$")
public void able_to_click_on_menu_Career() throws Throwable {
	WebElement icon =  driver.findElement(By.xpath("//*[@id=\"menu-main-menu-1\"]/li[8]/a"));
	Thread.sleep(5000);
	Actions ob = new Actions(driver);
	Thread.sleep(7000);
	ob.moveToElement(icon).click().build().perform();
	Thread.sleep(8000);
	System.out.println("Clicked on career menu");
	
}

@Then("^user should able to see free text field SEARCH in the career home page$")
public void user_should_able_to_see_free_text_field_SEARCH_in_the_career_home_page() throws Throwable {
	
	driver.findElement(By.xpath("//*[@id=\"smartWidget0\"]/div/form/input[1]"));
	  Thread.sleep(10000);
}

@Then("^user is able to enter word in text box of SEARCH field$")
public void user_is_able_to_enter_word_in_text_box_of_SEARCH_field() throws Throwable {
	driver.findElement(By.xpath("//*[@id=\"smartWidget0\"]/div/form/input[1]")).sendKeys("Software Development Manager");
	Thread.sleep(10000);
}

@When("^user click on SEARCH button then user is able to see relevant result$")
public void user_click_on_SEARCH_button_then_user_is_able_to_see_relevant_result() throws Throwable {
	WebElement icon1 =   driver.findElement(By.xpath("//*[@id=\"smartWidget0\"]/div/form/input[2]"));
	Thread.sleep(10000);
	Actions ob = new Actions(driver);
	Thread.sleep(10000);
	ob.moveToElement(icon1).click().build().perform();
	Thread.sleep(10000);
	System.out.println("Clicked on search button");
	File screenshotFile4 = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
	FileHandler.copy(screenshotFile4, new File("./Screenshots/sgdigitalsearch.png"));
	System.out.println("Screenshot Taken for Software Development Manager");
	
	   
}

@Then("^user also apply filter for Location, and user see new result based on location$")
public void user_also_apply_filter_for_Location_and_user_see_new_result_based_on_location() throws Throwable {
	
	

	WebElement dropDown = driver.findElement(By.id("facet_location"));
    dropDown.click();

    driver.findElement(By.xpath("/html/body/div[4]/div[2]/div[3]/div/div[1]/ul/li[1]/span")).click();

//	drp.getText().contains(");
//	drp.click();
    Thread.sleep(5000);
    
    File screenshotFile5 = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
	FileHandler.copy(screenshotFile5, new File("./Screenshots/sgdigitalBengaluru.png"));
	System.out.println("Screenshot Taken for Software Development Manager for particular location");
	
    System.out.println("Execution completed");
    driver.close();
}

}