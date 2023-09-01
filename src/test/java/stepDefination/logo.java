package stepDefination;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebDriver;

public class logo {
    WebDriver driver;
    @Given("I Launch Chrome browser")
    public void i_launch_chrome_browser() {
        System.out.println("hello");
      // WebDriverManager.chromedriver().setup();
       // System.setProperty("WebDriver.chrome.driver", "C:\\Program Files\\Software Testing\\geckodriver-v0.33.0-win64\\chromedriver.exe");
        //WebDriver driver = new ChromeDriver();
       // driver.get("www.google.com");
    }

    @When("I open the Orange HRM homepage")
    public void i_open_the_orange_hrm_homepage() {
        System.out.println("hello2");

    }

    @Then("I verify logo should present")
    public void i_verify_logo_should_present() {
        System.out.println("hello3");
    }

    @Then("I close the browser")
    public void i_close_the_browser() {
        System.out.println("hello4");
    }
}
