package restAssuredPractice;

import org.openqa.selenium.json.Json;

import files_RestAssured.Payload;
import io.restassured.path.json.JsonPath;

public class Complexjson {

	public static void main(String[] args) {


		JsonPath js=new JsonPath(Payload.coursePrice());

	}

}
