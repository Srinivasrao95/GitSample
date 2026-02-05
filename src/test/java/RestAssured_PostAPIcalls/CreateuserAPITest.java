package RestAssured_PostAPIcalls;

import static io.restassured.RestAssured.*;

import com.google.gson.internal.bind.util.ISO8601Utils;
import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.http.Header;
import io.restassured.http.Headers;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;
import org.hamcrest.Matchers.*;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import org.w3c.dom.ls.LSOutput;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;

public class CreateuserAPITest {

    @BeforeMethod
    public void setup(){
        RestAssured.baseURI="https://gorest.co.in";
    }

    public String getrandomemailID(){
        return "APIAutomation"+System.currentTimeMillis()+"@nal.com";
    }



    @Test
    public void Createrecord() throws IOException {

        String emailid=getrandomemailID();

        String rawjson=new String(Files.readAllBytes(Paths.get("./src/test/resources1/contactsAPItest.json")));
        String updatedjson=rawjson.replace("{email}",emailid);


        given().log().all()
                .header("Authorization","Bearer 5c07ce0fe40188688405bcba8ffeb952a6eaa46ff35934196e3288b0756778ff")
                .contentType(ContentType.JSON)
                .body(updatedjson)
                .when().post("/public/v2/users")
                .then().log().all()
                .assertThat().statusCode(201);
    }

    @Test
    public void createuserwithjsonfile(){

        given().log().all()
                .header("Authorization", "Bearer 5c07ce0fe40188688405bcba8ffeb952a6eaa46ff35934196e3288b0756778ff")
                .contentType(ContentType.JSON)
                .body(new File("./src/test/resources1/contactsAPItest.json"))
                .when()
                .post("/public/v2/users")
                .then().log().all()
                .assertThat().statusCode(201);
    }


    @Test
    public void createuserwithjsonfilewithStringReplacement() throws IOException {


        String emailID=getrandomemailID();
        String rawjson =new String(Files.readAllBytes(Paths.get("./src/test/resources1/contactsAPItest.json")));
        String updatedjson=rawjson.replace("{{email}}",emailID);


        given().log().all()
                .header("Authorization", "Bearer 5c07ce0fe40188688405bcba8ffeb952a6eaa46ff35934196e3288b0756778ff")
                .contentType(ContentType.JSON)
                .body(updatedjson)
                .when()
                .post("/public/v2/users")
                .then().log().all()
                .assertThat().statusCode(201);
    }

}
