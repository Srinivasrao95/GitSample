package restAssuredCreateAuserWithPOJO;

import org.testng.annotations.Test;

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

public class CreateuserTestwithPOJO {

    public String getrandomEmailid() {
        return "APIAutomation" + System.currentTimeMillis() + "@opencart.com";
    }

    @Test
    public void adduserTest() {

        RestAssured.baseURI = "https://gorest.co.in";
        user User = new user("naveen", getrandomEmailid(), "male", "Active");
        Integer userid = given().log().all()
                .header("Authorization", "Bearer 5c07ce0fe40188688405bcba8ffeb952a6eaa46ff35934196e3288b0756778ff")
                .contentType(ContentType.JSON)
                .body(User)
                .when().post("/public/v2/users")
                .then().log().all()
                .assertThat().statusCode(201).extract().path("id");

        System.out.println("userId id is --> " + userid);

        //get call
        given().log().all()
                .header("Authorization", "Bearer 5c07ce0fe40188688405bcba8ffeb952a6eaa46ff35934196e3288b0756778ff")
                .when().get("/public/v2/users/" + userid)
                .then().log().all()
                .assertThat().statusCode(200);

    }
}
