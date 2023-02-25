package com.holiday.steps;

import com.holiday.pages.HomePage;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.When;

public class HomePageTest {
    @Given("^I am on homepage$")
    public void iAmOnHomepage() {
        new HomePage().clickOnAccept();
    }
    @When("^I enter destination$")
    public void iEnterDestination() {
        new HomePage().enterDestination("Maldives");
    }

    @And("^I enter departure airport$")
    public void iEnterDepartureAirport() {
        new HomePage().enterDepartureAirport("London Heathrow");
    }

    @And("^I select date$")
    public void iSelectDate() {
    }

    @And("^I select duration$")
    public void iSelectDuration() {
    }

    @And("^I click on search$")
    public void iClickOnSearch() {
    }
}
