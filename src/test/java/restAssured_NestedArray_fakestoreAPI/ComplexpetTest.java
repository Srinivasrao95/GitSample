package restAssured_NestedArray_fakestoreAPI;

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

public class ComplexpetTest {

    @Test
    public void createData(){

        RestAssured.baseURI="https://petstore3.swagger.io";


        ComplexLombokPet.Category category=new ComplexLombokPet.Category(42,"Srinivas");
        List<String> photourls=Arrays.asList("http:google.com","http:facebook.com");

        ComplexLombokPet.Tags tag1=new ComplexLombokPet.Tags(44,"oblesh");
        ComplexLombokPet.Tags tag2=new ComplexLombokPet.Tags(45,"oblesh123");


        List<ComplexLombokPet.Tags> tag123=Arrays.asList(tag1,tag2);
        ComplexLombokPet complexLombokPet=new ComplexLombokPet(22,"Ravi","Active",category,photourls,tag123);

        Response response=given()
                .contentType(ContentType.JSON)
                .body(complexLombokPet)
                .when()
                .post("api/v3/pet");
        response.prettyPrint();

        //deserilization

        ObjectMapper mapper=new ObjectMapper();
        try {
            ComplexLombokPet pet=   mapper.readValue(response.getBody().asString(),ComplexLombokPet.class);

            System.out.println(pet.getId());
            System.out.println(pet.getName());
            System.out.println(pet.getStatus());
            System.out.println(pet.getCategory().getId());
            System.out.println(pet.getCategory().getName());
            System.out.println(pet.getPhotoUrls());
            System.out.println(pet.getTags().get(0).getId());
            System.out.println(pet.getTags().get(1).getId());
            System.out.println(pet.getTags().get(0).getName());
            System.out.println(pet.getTags().get(1).getName());

            System.out.println("_________");

        } catch (JsonProcessingException e) {
            throw new RuntimeException(e);
        }


    }



}
