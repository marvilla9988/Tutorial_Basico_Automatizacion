package DefSteps;

import cucumber.api.java.en.And;
import Paginas.googleSearchPage;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;


public class MyStepdefs {


    googleSearchPage googleSearch = new googleSearchPage();


    @Given("I am on the Google search page")
    public void iAmOnTheGoogleSearchPage() throws Throwable{
        googleSearch.NavigateToGoogle();
    }

    @When("I enter a word in the search field")
    public void iEnterAWordInTheSearchField() {
        googleSearch.enterSearchCriteria("www.TheFreeRangeTester.com");
    }

    @And("click on the search button")
    public void clickOnTheSearchButton() {
        googleSearch.clickSearchGoogle();
    }

    @Then("I see results realted to the word entered")
    public void iSeeResultsRealtedToTheWordEntered() {
    }
}
