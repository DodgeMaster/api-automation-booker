package com.testing.gherkinsDefinitions;

import com.testing.serenitySteps.BookerSteps;
import cucumber.api.DataTable;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.When;

import java.io.IOException;

public class BookerDefinitions {

    @Given("^the user requests token with username \"([^\"]*)\" and password \"([^\"]*)\"$")
    public void theUserAuthorisesWithUsernameAndPassword(String username, String password) throws Throwable {
        BookerSteps.getToken(username, password);
    }

    @When("^the user requests booking ids$")
    public void theUserRequestsBookingIds() {
        BookerSteps.getBookingIds();
    }

    @And("^the amount of Booking Ids is \"([^\"]*)\"$")
    public void theAmountOfBookingIdsIs(Integer amount) {
        BookerSteps.validateAmountOfBookingIds(amount);
    }

    @When("^the user requests booking with following data:$")
    public void theUserRequestsBookingWithFollowingData(DataTable dataTable) throws IOException {
        BookerSteps.createBooking(dataTable);
    }

    @When("^the user gets the requested booking$")
    public void theUserGetsRequestedBooking() {
        BookerSteps.getBooking();
    }

    @When("^the user requests to update booking with following data:$")
    public void theUserRequestsToUpdateBookingWithFollowingData(DataTable dataTable) throws IOException {
        BookerSteps.updateBooking(dataTable);
    }



    @When("^the user deletes the booking$")
    public void theUserDeletesTheBooking() {
        BookerSteps.deleteBooking();
    }

    @When("^the user requests to update booking with following data get negative:$")
    public void theUserRequestsToUpdateBookingWithFollowingDataGetNegative(DataTable dataTable) throws IOException {
        BookerSteps.updateBooking(dataTable);
    }

    @When("^the user requests to update booking with following partial data:$")
    public void theUserRequestsToUpdateBookingWithFollowingPartialData(DataTable dataTable) throws IOException {
        BookerSteps.partialUpdateBooking(dataTable);

    }
}
