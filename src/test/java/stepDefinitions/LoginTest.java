package stepDefinitions;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileCommand;
import io.appium.java_client.android.AndroidDriver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.cucumber.junit.Cucumber;
import org.junit.Before;
import org.junit.runner.RunWith;
import org.openqa.selenium.By;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.Assert;

import java.net.URL;


@RunWith(Cucumber.class)
public class LoginTest {

    public AndroidDriver driver;
    @Before
    public void setUp() throws Exception {

        DesiredCapabilities cap = new DesiredCapabilities();

        // Setup Capabilities
        cap.setCapability("PlatformName", "Android");
        cap.setCapability("DeviceName", "Pixel 6");
        cap.setCapability("app.Package", "se.jagareforbundet.wehunt");
        cap.setCapability("app.Activity", "se.jagareforbundet.wehunt.WeHuntActivity");

        // Connect with appium server
        driver = new AndroidDriver(new URL("http://0.0.0.0:4723/wd/hub"), cap);
        Thread.sleep(2000);

    }

    @Given("I open application")
    public void i_open_application() {
        Assert.assertEquals(driver.findElement(By.id("WeHunt")).getText(), "WeHunt");
            System.out.println(driver.findElement(By.id("WeHunt")).getText());
             throw new io.cucumber.java.PendingException();
        }

    @When("I tap og log in button")
    public void i_tap_og_log_in_button() {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }
    @Then("I validate custom view")
    public void i_validate_custom_view() {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }
    @Then("I enter valid username and password")
    public void i_enter_valid_username_and_password() {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }
    @Then("I verify that login button is visible")
    public void i_verify_that_login_button_is_visible() {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }
    @Then("I tap on it")
    public void i_tap_on_it() {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }

}


