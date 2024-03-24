package TestyBdd.StepDefinitions;

import TestyBdd.Pages.HomePage;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;

public class HomePageStep {

    HomePage homePage = new HomePage();

    @Given("Browser is open")
    public void browserIsOpen() {
        homePage.openHomePage();
    }

    @Then("I am on the main site")
    public void iAmOnTheMainSite() {

    }


}
