package restAssured;

import static io.restassured.RestAssured.*;

import cucumber.api.java.en.Given;
import io.restassured.RestAssured;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;
import org.hamcrest.Matchers.*;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.List;

public class Fakestore {

    @BeforeMethod
    public void setup() {
        RestAssured.baseURI = "https://fakestoreapi.com";
    }

    @Test
    public void getrecords() {
        Response ids = given().when().get("/products");
        ids.prettyPrint();

        JsonPath js = ids.jsonPath();
        List<Integer> allids = js.getList("id");
        System.out.println(allids);


        List<Double> price = js.getList("price");
        System.out.println(price);


        List<Double> rate = js.getList("rating.rate");
        System.out.println(rate);


        List<Integer> allcount = js.getList("rating.count");
        System.out.println(allcount);


    }


}
