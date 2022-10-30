package stepDefinations;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import static org.junit.Assert.*;
import stepActions.StepAction;

public class StepDefination {
	StepAction getActions = new StepAction();

	@Given("I read the {string} payload")
	public void i_read_the_payload(String fileName) {
		getActions.readPayload(fileName);
	}

	@Then("I validate that list only contains {string} players")
	public void i_validate_that_list_only_contains_players(String numberOfPlayers) {
		assertEquals(getActions.checkPlayerList(), Integer.parseInt(numberOfPlayers));
	}

	@Then("I validate that only {string} foreign players are present in the list")
	public void i_validate_that_only_foreign_players_are_present_in_the_list(String noOfForeignPlayers) {
		assertEquals(getActions.checkForeignPlayer(), Integer.parseInt(noOfForeignPlayers));
	}

	@Then("I validate that {string} wicket-keeper is present in the team")
	public void i_validate_that_wicket_keeper_is_present_in_the_team(String noOfWicketKeeper) {
		assertEquals(getActions.checkWicketKeeperCount(), Integer.parseInt(noOfWicketKeeper));
	}

}
