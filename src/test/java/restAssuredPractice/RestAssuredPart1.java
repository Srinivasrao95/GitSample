package restAssuredPractice;

import io.restassured.RestAssured;
import io.restassured.path.json.JsonPath;

import static io.restassured.RestAssured.*;
import static org.hamcrest.Matchers.*;

import files_RestAssured.Payload;

public class RestAssuredPart1 {

    public static void main(String[] args) {

        //given  -->All input details
        //when  -->submit the data
        //then -->validate the response
        RestAssured.baseURI = "https://rahulshettyacademy.com";
        String response = given().log().all()
                .queryParam("Key", "qaclick123")
                .header("Content-Type", "application/json")
                .body(Payload.Addplace())
                .when().post("maps/api/place/add/json")
                .then().assertThat()
                .statusCode(200)
                .body("scope", equalTo("APP"))
                .header("Server", "Apache/2.4.52 (Ubuntu)")
                .extract().response().asString();

        System.out.println(response);

        JsonPath js = new JsonPath(response);
        String Placeid = js.getString("place_id");
        System.out.println(Placeid);
    }

}
