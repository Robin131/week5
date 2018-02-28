package rejsekort;

import static org.junit.Assert.assertEquals;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class StepDefiniton {
	TravelCard card = new TravelCard();
	CheckInStation checkInStation;
	ResponseObject response;
	
	@Given("^A travel card with a balance of (\\d+)$")
	public void a_travel_card_with_a_balance_of(int balance){
		
	    card.setBalance(balance);
	}

	@Given("^check-in status is false$")
	public void check_in_status_is_false(boolean isCheckedIn){
		card.setCheckStatus(isCheckedIn);
	}

	@Given("^a check-in automation at 'Norreport St'$")
	public void a_check_in_automation_at_Norreport_St(String name){
		checkInStation = new CheckInStation(name);
	}

	@When("^check-in$")
	public void check_in(){
		response = checkInStation.checkIn(card);
	}

	@Then("^automation displays message that the card is checked-in$")
	public void automation_displays_message_that_the_card_is_checked_in() {
		assertEquals(100,response.getErrorCode());
	}
}