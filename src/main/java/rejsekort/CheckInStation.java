package rejsekort;

public class CheckInStation {
	String name;

	public CheckInStation(String name) {
		super();
		this.name = name;
	}

	public ResponseObject checkIn(TravelCard card) {
		card.setCheckedIn(true);
		ResponseObject object = new ResponseObject(100, "Check-in successfully");
		return object;
	}
	
}
