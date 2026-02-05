package restAssured_petBuilderPattren;

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

public class PetBuilderLomobokClass {

    @Test
    public void petBuilderLomobokClass() {
        RestAssured.baseURI = "https://petstore3.swagger.io";

        PetLombokClass.Category category = new PetLombokClass.Category.CategoryBuilder()
                .id(401)
                .name("Pet")
                .build();

        PetLombokClass.Tags tag1 = new PetLombokClass.Tags.TagsBuilder()
                .id(233)
                .name("petsfg")
                .build();
        PetLombokClass.Tags tag2 = new PetLombokClass.Tags.TagsBuilder()
                .id(555)
                .name("fasttag")
                .build();
        List<PetLombokClass.Tags> tag = Arrays.asList(tag1, tag2);

        List<String> photoUrls = Arrays.asList("www.google.com", "www.facebook.com");

        PetLombokClass pet= new PetLombokClass.PetLombokClassBuilder()
               .id(700).name("APIPetClass").status("Active")
               .photoUrls(photoUrls)
               .category(category)
               .tags(tag).build();

        Response response = given().log().all()
                .contentType(ContentType.JSON)
                .body(pet)
                .when()
                .post("/api/v3/pet");
        response.prettyPrint();


    }

}
