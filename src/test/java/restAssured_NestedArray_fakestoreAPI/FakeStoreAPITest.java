package restAssured_NestedArray_fakestoreAPI;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.testng.annotations.Test;

import static io.restassured.RestAssured.*;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.http.Header;
import io.restassured.http.Headers;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;
import org.hamcrest.Matchers.*;
import io.restassured.RestAssured;
import cucumber.api.java.en.Given;
import io.restassured.RestAssured;
import io.restassured.response.Response;
import org.testng.annotations.Test;

import static io.restassured.RestAssured.given;

public class FakeStoreAPITest {
    @Test
    public void getAllproducts() {

        RestAssured.baseURI = "https://fakestoreapi.com";
        Response response = given()
                .when()
                .get("/products");

        response.prettyPrint();
        System.out.println("_____________");

/// deserilization
        ObjectMapper mapper = new ObjectMapper();
        try {
            FakestoreAPI_POJO_lamobok[] products = mapper.readValue(response.getBody().asString(), FakestoreAPI_POJO_lamobok[].class);
            for (FakestoreAPI_POJO_lamobok p : products) {
                System.out.println(p.getCategory());
                System.out.println(p.getId());
                System.out.println(p.getPrice());
                System.out.println(p.getDescription());
                System.out.println(p.getTitle());
                System.out.println(p.getImage());
                System.out.println(p.getRating().getRate());
                System.out.println(p.getRating().getCount());
                System.out.println("_______*__________");
            }

        } catch (JsonProcessingException e) {
            throw new RuntimeException(e);
        }

    }
}