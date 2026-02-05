package restAssured;

import static io.restassured.RestAssured.*;

import cucumber.api.java.en.Given;
import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;
import org.hamcrest.Matchers.*;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Queryparam {

    @BeforeMethod
    public void setup() {
        RestAssured.baseURI = "https://gorest.co.in";
    }

    @Test
    public void goRestquery(){

       Response response= given().log().all()
                .header("Authorization", "Bearer 5c07ce0fe40188688405bcba8ffeb952a6eaa46ff35934196e3288b0756778ff")
                .queryParam("name","Naveen")
                .queryParam("status", "inactive")
                .when().log().all()
                .get("/public/v2/users");
        System.out.println(response);
        response.prettyPrint();

    }
    @Test
    public void goRestqueryusingmap(){


        Map<String, String> queryparam=new HashMap<String, String>();
        queryparam.put("name","Naveen");
        queryparam.put("status", "inactive");
        Response response= given().log().all()
                .header("Authorization", "Bearer 5c07ce0fe40188688405bcba8ffeb952a6eaa46ff35934196e3288b0756778ff")
                .queryParams(queryparam)
                .when().log().all()
                .get("/public/v2/users");
        System.out.println(response);
        response.prettyPrint();

    }

}

