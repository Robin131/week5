package rejsekort;

import cucumber.api.PendingException;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class StepDefiniton {
	TravelCard card = new TravelCard();
	CheckInStation checkInStation = new CheckInStation();
	
	@Given("^A travel card with a balance of (\\d+)$")
	public void a_travel_card_with_a_balance_of(int balance){
		
	    card.setBalance(balance);
	}

	@Given("^check-in status is false$")
	public void check_in_status_is_false(boolean isChecked){
		card.setCheckStatus(false);
	}

	@Given("^a check-in automation at 'Norreport St'$")
	public void a_check_in_automation_at_Norreport_St(String name){
		checkInStation.setName(name);
	}

	@When("^check-in$")
	public void check_in() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    throw new PendingException();
	}

	@Then("^automation displays message that the card is checked-in$")
	public void automation_displays_message_that_the_card_is_checked_in() {
		
	}
}