package TestyBdd.StepDefinitions;

import TestyBdd.Pages.HomePage;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.jupiter.api.Assertions;

public class HomePageStep {

    HomePage homePage = new HomePage();

    @Given("Browser is open")
    public void browserIsOpen() {
        homePage.openHomePage();
    }

    @Then("I am on the main site")
    public void iAmOnTheMainSite() {
        String nazwa = homePage.getHomepageName();
        Assertions.assertEquals("Generic Shop", nazwa);

    }

    @When("Fill newsletter name with {string}")
    public void fillNewsletterNameWith(String arg0) {
    }
    @When("Fill newsletter email with {string}")
    public void fillNewsletterEmailWith(String arg0) {
        
    }


}
