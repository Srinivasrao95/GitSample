package restAssured_deserilization;


import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
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

public class GetaUserTest {


    @Test
    public void getsingleuser(){
        RestAssured.baseURI="https://gorest.co.in";

        Response response=given().log().all()
                .header("Authorization", "Bearer 5c07ce0fe40188688405bcba8ffeb952a6eaa46ff35934196e3288b0756778ff")
                .when()
                .get("/public/v2/users/7843357");
        response.prettyPrint();
        //deserilization

        String responsebody=response.asString();
        ObjectMapper mapper=new ObjectMapper();
        try {
            UserLombokclass objresponse=  mapper.readValue(responsebody,UserLombokclass.class);
            System.out.println(objresponse);
        } catch (JsonProcessingException e) {
            throw new RuntimeException(e);
        }
    }
}
