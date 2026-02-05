package restAssuredjaywayjasonPathValidator;

import com.google.gson.internal.bind.util.ISO8601Utils;
import com.jayway.jsonpath.JsonPath;
import com.jayway.jsonpath.ReadContext;
import cucumber.api.java.en.Given;
import io.restassured.RestAssured;

import io.restassured.response.Response;

import org.testng.annotations.Test;

import java.util.List;
import java.util.Map;

import org.testng.annotations.Test;

import static io.restassured.RestAssured.given;

public class FakeproductAPITest {

    @Test
    public void fakestore() {

        RestAssured.baseURI = "https://fakestoreapi.com";
        Response response = given().when().get("/products");
        String jsonresponse = response.getBody().asString();
        ReadContext ctx = JsonPath.parse(jsonresponse);
        //single Attribute
        List<Integer> ids = ctx.read("$.[*].id");
        System.out.println(ids.size());
        System.out.println(ids);

        //two Attributes
        List<Map<String, Object>> idnamelist = ctx.read("$.[*].['id','title']");
        System.out.println(idnamelist.size());
        System.out.println(idnamelist);


        for (Map<String, Object> e : idnamelist) {
            int id = (Integer) e.get("id");
            String title = (String) e.get("title");
            System.out.println("ID:  " + id);
            System.out.println("Title:  " + title);

            //three Attributes
            List<Map<String, Object>> idnameimagelist = ctx.read("$.[*].['id','title','image']");
            System.out.println(idnameimagelist.size());
            System.out.println(idnameimagelist);


            for (Map<String, Object> e1 : idnameimagelist) {
                int id1 = (Integer) e1.get("id");
                String title1 = (String) e1.get("title");
                String images = (String) e1.get("image");
                System.out.println("ID:  " + id1);
                System.out.println("Title:  " + title1);
                System.out.println("images: "+images);

            }
        }}
    }
