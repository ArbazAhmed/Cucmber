package stepDefination;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class smokeTest {
	
	
	WebDriver driver;
    
	@Given("^open chrome and start application$")
	public void open_chrome_and_start_application() throws Throwable {
	   
		System.setProperty("webdriver.chrome.driver","C:\\Users\\c5248056\\Desktop\\New folder\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		
		
	}

	@When("^i enter valid user name and valid password$")
	public void i_enter_valid_user_name_and_valid_password() throws Throwable {
		
		driver.findElement(By.id("email")).sendKeys("arbaz");
		driver.findElement(By.id("pass")).sendKeys("ahmed");
		
	    
	}

	@Then("^user should be login sucessfully$")
	public void user_should_be_login_sucessfully() throws Throwable {
		
		driver.findElement(By.id("loginbutton")).click();
		
		
	    
	}
	@Then("^Close browser$")
	public void Close_browser() throws Throwable {
	    
		driver.quit();
		
	}


	
}
