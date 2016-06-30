import cucumber.api.DataTable;
import cucumber.api.PendingException;
import cucumber.api.java.en.*;

public class RoomSteps {


@Given("^the room with location \"(.*?)\" exists$")
public void the_room_with_location_exists(String arg1) throws Throwable {
    // Write code here that turns the phrase above into concrete actions
	
    throw new PendingException();
}

@When("^user serarches for room with location \"(.*?)\"$")
public void user_serarches_for_room_with_location(String arg1) throws Throwable {
    // Write code here that turns the phrase above into concrete actions
    throw new PendingException();
}

@Then("^room is displayed$")
public void room_is_displayed(DataTable arg1) throws Throwable {
    // Write code here that turns the phrase above into concrete actions
    // For automatic transformation, change DataTable to one of
    // List<YourType>, List<List<E>>, List<Map<K,V>> or Map<K,V>.
    // E,K,V must be a scalar (String, Integer, Date, enum etc)
    throw new PendingException();
}
}
