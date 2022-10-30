package utility;

import java.io.FileReader;

import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;

public class Cutils {
	
	public JSONObject getJsonObjectfromFile(String fileName) {
		JSONObject getPayload = new JSONObject();
		JSONParser parser = new JSONParser();
		try {
			Object obj = parser.parse(new FileReader("src\\test\\java\\TestData\\" + fileName));
			getPayload = (JSONObject) obj;
		} catch (Exception e) {
			e.printStackTrace();
		}
		return getPayload;
	}

}
