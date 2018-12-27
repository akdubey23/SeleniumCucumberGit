package negstepsexection;

import java.io.File;

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


public class errorexecution {
	
	
	private static final File TakeScreenshot = null;

	WebDriver driver;
     
	//public void getscreenshot(WebDriver driver) throws Exception {
        //File scr = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
        //File dest = new File(("/Selenium with Cucumber/Screenshots/Negscenarios")+"screenshot" + timestamp() + ".png");
        //FileUtils.copyFile(scr, dest);
        //Thread.sleep(3000);
   // }

	@Given("^I want to login into SafariDriver$")
	public void I_want_to_login_into_SafariDriver() throws Throwable {
	    driver = new SafariDriver();
	    driver.manage().window().maximize();
	}

	@Given("^login into SG Digital URL-$")
	public void login_into_SG_Digital_URL() throws Throwable {
	    driver.get("https://www.sgdigital.com");
		
		Thread.sleep(5000);
	}

	@Then("^user can see menu Career and click on it.$")
	public void user_can_see_menu_Career_and_click_on_it() throws Throwable {
	    WebElement icon =  driver.findElement(By.xpath("//*[@id=\"menu-main-menu-1\"]/li[8]/a"));
		Thread.sleep(5000);
		Actions ob = new Actions(driver);
		Thread.sleep(7000);
		ob.moveToElement(icon).click().build().perform();
		Thread.sleep(8000);
		System.out.println("Clicked on career menu");
	}

	@When("^user want to enter numeric value in free text box of Search filter.$")
	public void user_want_to_enter_numeric_value_in_free_text_box_of_Search_filter() throws Throwable {
	    driver.findElement(By.xpath("//*[@id=\"smartWidget0\"]/div/form/input[1]")).sendKeys("388392");
		Thread.sleep(5000);
	}

	@Then("^no result should be displayed.$")
	public void no_result_should_be_displayed() throws Throwable {
	    WebElement icon1 =   driver.findElement(By.xpath("//*[@id=\"smartWidget0\"]/div/form/input[2]"));
		Thread.sleep(8000);
		Actions ob = new Actions(driver);
		Thread.sleep(5000);
		ob.moveToElement(icon1).click().build().perform();
		Thread.sleep(2000);
		System.out.println("No result found while giving numeric value");
		File screenshotFile = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		FileHandler.copy(screenshotFile, new File("./Screenshots/sgdigitalnum.png"));
		System.out.println("Screenshot Taken 1");
		
		   
	}

	@When("^user want to enter special character in free text box of Search filter.$")
	public void user_want_to_enter_special_character_in_free_text_box_of_Search_filter() throws Throwable {
	    driver.findElement(By.xpath("//*[@id=\"smartWidget0\"]/div/form/input[1]")).sendKeys("@Software");
	    File screenshotFile1 = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		FileHandler.copy(screenshotFile1, new File("./Screenshots/sgdigitalAlpha.png"));
		System.out.println("Screenshot Taken 2");
		
	
	}

	@Then("^no result should be displayed and broswer should be closed.$")
	public void no_result_should_be_displayed_and_broswer_should_be_closed() throws Throwable {
		WebElement icon4 =   driver.findElement(By.xpath("/html/body/div[4]/div[2]/div[3]/div/form/input[2]"));
		Thread.sleep(8000);
		Actions obe = new Actions(driver);
		obe.moveToElement(icon4).click().build().perform();
		Thread.sleep(20000);
		System.out.println("No result found while giving special char value");
		driver.close();
		

		
		
		
		
		
	}}


