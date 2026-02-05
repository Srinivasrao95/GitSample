package restAssured_Deserilization_withArray;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import cucumber.api.java.en.Given;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;
import org.hamcrest.Matchers.*;
import io.restassured.RestAssured;
import org.testng.annotations.Test;
import restAssured_deserilization.UserLombokclass;

import static io.restassured.RestAssured.given;

public class GetaUserTest {

    @Test
    public void getusers() {

        RestAssured.baseURI = "https://gorest.co.in";

      Response response=  given().log().all()
                .header("Authorization", "Bearer 5c07ce0fe40188688405bcba8ffeb952a6eaa46ff35934196e3288b0756778ff")
                .when()
                .get("/public/v2/users");
      response.prettyPrint();

        ObjectMapper mapper=new ObjectMapper();
        try {
            UserLombokclass[] users= mapper.readValue(response.getBody().asString(), UserLombokclass[].class);

            for(UserLombokclass users1:users){
                System.out.println(users1.getEmail());
                System.out.println(users1.getGender());
                System.out.println(users1.getId());
                System.out.println(users1.getStatus());
                System.out.println(users1.getName());
                System.out.println("__________________");
            }

        } catch (JsonProcessingException e) {
            throw new RuntimeException(e);
        }
    }


}
