package serenitywithcucumber.steps;

import net.thucydides.core.annotations.Steps;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import serenitywithcucumber.steps.serenity.UserSteps;

public class DefinitionSteps {

    @Steps
    UserSteps user;

    @Given("^As Users with IT Department and Super Admin role$")
    public void as_Users_with_IT_Department_and_Super_Admin_role(){
        user.logIn();
    }

    @When("^I select a <Location> via MainMenu$")
    public void i_select_a_LocationViaMainMenu(){
        user.selectLocation();
    }

    @When("^I select a <Location> via Breadcrumbs$")
    public void i_select_a_LocationViaBreadcrumb(){
        user.selectLocation();
    }

    @When("^I put information about <Place>$")
    public void i_put_information_about_Place(){
        user.fillInPlacesInfo();
    }

    @Then("^added <Place> with status <Status> should appear on a <ViewOfficeMap>$")
    public void added_Place_with_status_Status_should_appear_on_a_ViewOfficeMap()  {
        user.verifiesPlacesStatusOnViewOfficeMap();

    }

}
