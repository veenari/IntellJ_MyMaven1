package stepDefination;

import io.cucumber.java.en.*;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class logo {
    WebDriver driver;
    @Given("I Launch Chrome browser")
    public void i_launch_chrome_browser() {
        System.out.println("hello");
        System.setProperty("WebDriver.chrome.driver", "C:\\Program Files\\Software Testing\\geckodriver-v0.33.0-win64\\chromedriver.exe");
        driver = new ChromeDriver();
    }

    @When("I open the Orange HRM homepage")
    public void i_open_the_orange_hrm_homepage() {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }

    @Then("I verify logo should present")
    public void i_verify_logo_should_present() {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }

    @Then("I close the browser")
    public void i_close_the_browser() {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }
}
