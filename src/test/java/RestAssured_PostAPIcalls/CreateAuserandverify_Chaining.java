package RestAssured_PostAPIcalls;
import static io.restassured.RestAssured.*;

import com.google.gson.internal.bind.util.ISO8601Utils;
import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.http.Header;
import io.restassured.http.Headers;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;
import org.hamcrest.Matchers.*;
import io.restassured.RestAssured;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

public class CreateAuserandverify_Chaining {

    @BeforeMethod
    public void setup() {
        RestAssured.baseURI = "https://gorest.co.in";
    }

    public String getrandomemailID() {
        return "APIAutomation" + System.currentTimeMillis() + "@nal.com";
    }

    @Test
    public void createuserwithjsonfilewithStringReplacement() throws IOException {


        String emailID = getrandomemailID();
        String rawjson = new String(Files.readAllBytes(Paths.get("./src/test/resources1/contactsAPItest.json")));
        String updatedjson = rawjson.replace("{{email}}", emailID);


        Integer userID = given().log().all()
                .header("Authorization", "Bearer 5c07ce0fe40188688405bcba8ffeb952a6eaa46ff35934196e3288b0756778ff")
                .contentType(ContentType.JSON)
                .body(updatedjson)
                .when()
                .post("/public/v2/users")
                .then().log().all()
                .assertThat().statusCode(201).extract().path("id");

        System.out.println("user id is: "+userID);
        System.out.println("____________________");
        // get a user by using get call
        given().log().all()
                .header("Authorization", "Bearer 5c07ce0fe40188688405bcba8ffeb952a6eaa46ff35934196e3288b0756778ff")
                .when()
                .get("/public/v2/users/"+userID)
                .then().log().all()
                .assertThat().statusCode(200);

    }

}