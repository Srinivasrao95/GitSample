package restAssured_deserilization;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import io.restassured.RestAssured;
import io.restassured.response.Response;
import org.testng.annotations.Test;

import static io.restassured.RestAssured.given;

public class Fakestoretest {


    @Test
    public void Fakestoretestuser() {
        RestAssured.baseURI = "https://fakestoreapi.com";

        Response response = given().log().all()
                .when()
                .get("/products");
        response.prettyPrint();
        //deserilization
        ObjectMapper mapper = new ObjectMapper();
        try {
            FakestoreLambok[] store= mapper.readValue(response.getBody().asString(),FakestoreLambok[].class);

            for(FakestoreLambok s:store){
                System.out.println(s.getCategory());
                System.out.println(s.getDescription());
                System.out.println(s.getImage());
                System.out.println(s.getPrice());
                System.out.println(s.getTitle());
                System.out.println(s.getRating().getRate());
                System.out.println(s.getRating().getCount());
            }
        } catch (JsonProcessingException e) {
            throw new RuntimeException(e);
        }


    }
}
