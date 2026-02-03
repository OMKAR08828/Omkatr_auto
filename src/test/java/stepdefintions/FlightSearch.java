package stepdefintions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;

public class FlightSearch {
	WebDriver driver;
	@Given("^User is on home page$")
	public void user_is_on_home_page() {
		driver= new ChromeDriver();
		driver.get("https://mvnrepository.com/artifact/commons-io/commons-io/2.20.0");
	   Assert.assertEquals(true, true);
		Assert.assertEquals(true, true);
	}

	@When("^user selects city1 and city2$")
	public void user_selects_and(String city1, String city2) {
	    // Write code here that turns the phrase above into concrete actions
		Assert.assertEquals(true, true);
	}

	@When("^click on Search button$")
	public void click_on_search_button() {
	    // Write code here that turns the phrase above into concrete actions
		Assert.assertEquals(true, true);
		driver.quit();
	}


}
