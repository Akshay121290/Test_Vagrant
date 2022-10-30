package stepActions;


import org.json.simple.*;

import utility.Cutils;

public class StepAction {

	JSONObject teamRCBPayload;
	Cutils cutils = new Cutils();

	public void readPayload(String fileName) {
		teamRCBPayload = cutils.getJsonObjectfromFile(fileName);
	}

	public int checkPlayerList() {
		JSONArray checkNumber = (JSONArray) teamRCBPayload.get("player");
		return checkNumber.size();
	}

	public int checkForeignPlayer() {
		int count = 0;
		JSONArray checkNumber = (JSONArray) teamRCBPayload.get("player");
		for (int i = 0; i < checkNumber.size(); i++) {
			JSONObject getEachPlayerData = (JSONObject) checkNumber.get(i);
			String getCountry = (String) getEachPlayerData.get("country");
			if (!getCountry.equalsIgnoreCase("India")) {
				count++;
			}
		}
		return count;
	}

	public int checkWicketKeeperCount() {
		int count = 0;
		JSONArray checkNumber = (JSONArray) teamRCBPayload.get("player");
		for (int i = 0; i < checkNumber.size(); i++) {
			JSONObject getEachPlayerData = (JSONObject) checkNumber.get(i);
			String getRole = (String) getEachPlayerData.get("role");
			if (getRole.equalsIgnoreCase("Wicket-keeper")) {
				count++;
			}
		}
		return count;
	}

}
