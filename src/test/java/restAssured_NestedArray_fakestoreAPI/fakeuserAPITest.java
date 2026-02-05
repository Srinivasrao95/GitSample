package restAssured_NestedArray_fakestoreAPI;

import io.restassured.RestAssured;
import org.testng.annotations.Test;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import cucumber.api.java.en.Given;
import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import org.testng.annotations.Test;

import java.util.Arrays;
import java.util.List;

import static io.restassured.RestAssured.given;

public class fakeuserAPITest {

    @Test
    public void fakeuserTest() {
        RestAssured.baseURI = "https://fakestoreapi.com";

        FakeuserAPILombok.Name name=new FakeuserAPILombok.Name("Srinivas","Sure");
        FakeuserAPILombok.Geolocation geolocation=new FakeuserAPILombok.Geolocation("1.153","161.68");
        FakeuserAPILombok.Address address=new FakeuserAPILombok.Address("Hyderabad","Puppalaguda",23,"500089",geolocation);
        FakeuserAPILombok FB=new FakeuserAPILombok(22,"siva123","Siva67","884343","ss@gmail.com",address,name);



      Response response=  given()
                .contentType(ContentType.JSON)
                .body(FB).when().post("/users");
      response.prettyPrint();


    }


}
