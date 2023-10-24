package StepDefinitions;

import Pages.DialogContent;
import Utilities.GWD;
import io.cucumber.java.en.*;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import java.io.IOException;
import java.time.Duration;

import static Utilities.ConfigReader.*;

public class _01_LoginSteps {
    DialogContent dc=new DialogContent();

    @Given("Navigate to Campus")
    public void navigate_to_campus() throws IOException {
        //System.out.println("site açıldı");
//        GWD.getDriver().get("https://test.mersys.io/");
        GWD.getDriver().get(getUrl()); //get info from properties file

    }

    @When("Enter username and password and click login button")
    public void enter_username_and_password_and_click_login_button() throws IOException {
        //System.out.println("username ve password girildi");
//
//        WebDriverWait wait=new WebDriverWait(GWD.getDriver(), Duration.ofSeconds(20));
//        wait.until(ExpectedConditions.visibilityOf(dc.username));
//
//        dc.username.sendKeys("turkeyts");
//        dc.password.sendKeys("TechnoStudy123");
//        dc.loginButton.click();


//        dc.mySendKeys(dc.username, "turkeyts");
//        dc.mySendKeys(dc.password, "TechnoStudy123");
        dc.mySendKeys(dc.username, getUsername()); //get info from properties file
        dc.mySendKeys(dc.password, getPassword()); //get info from properties file
        dc.myClick(dc.loginButton);
    }

    @Then("User should login successfully")
    public void user_should_login_successfully() {

         dc.verifyContainsText(dc.txtTechnoStudy,"Techno Study");

        //System.out.println("girildiği test edildi");
    }

}
