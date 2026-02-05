package restAssured;
import static io.restassured.RestAssured.*;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;
import org.hamcrest.Matchers.*;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;


public class GorestAPI {


    @BeforeMethod
    public void Setup() {
        RestAssured.baseURI="https://gorest.co.in";
    }

 @Test
    public void getSingleuser(){

     Response response= given().log().all()
            .header("Authorization", "Bearer 5c07ce0fe40188688405bcba8ffeb952a6eaa46ff35934196e3288b0756778ff")
            .when()
            .get("/public/v2/users/7817037");

     System.out.println("response code --> "+response.statusCode());
     System.out.println("response message  --> "+response.statusLine());
     response.prettyPrint();

     Assert.assertEquals(response.statusCode(), 200);
     Assert.assertTrue(response.statusLine().contains("200 OK"));

     //Fetch the json response body

     JsonPath js=response.jsonPath();
     int userid=js.getInt("id");
     System.out.println("User id is ---> "+userid);
     Assert.assertEquals(userid,7817037);

     String username=js.getString("name");
     System.out.println("User name is --> "+username);
     Assert.assertEquals(username,"Sen. Atreyi Chattopadhyay");

     String useremail=js.getString("email");
     System.out.println("User name is --> "+useremail);
     Assert.assertEquals(useremail,"atreyi_chattopadhyay_sen@reinger.example");




 }


}
