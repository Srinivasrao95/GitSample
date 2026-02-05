package restAssuredCreateAuserWithPOJO;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import org.testng.annotations.Test;

import static io.restassured.RestAssured.given;

public class CreateuserwithLomboktest {


    public String getrandomEmailid() {
        return "APIAutomation" + System.currentTimeMillis() + "@opencart.com";
    }

    @Test
    public void addusertest(){
        RestAssured.baseURI="https://gorest.co.in";

        UserLombokclass users=new UserLombokclass("Srinivas",getrandomEmailid(),"male","active");
        Integer userid = given().log().all()
                .header("Authorization", "Bearer 5c07ce0fe40188688405bcba8ffeb952a6eaa46ff35934196e3288b0756778ff")
                .contentType(ContentType.JSON)
                .body(users)
                .when().post("/public/v2/users")
                .then().log().all()
                .assertThat().statusCode(201).extract().path("id");

        System.out.println("userId id is --> " + userid);

        //get call
        given().log().all()
                .header("Authorization", "Bearer 5c07ce0fe40188688405bcba8ffeb952a6eaa46ff35934196e3288b0756778ff")
                .when().get("/public/v2/users/" + userid)
                .then().log().all()
                .assertThat().statusCode(200);

    }


    @Test
    public void adduserwithBuildertest(){
        RestAssured.baseURI="https://gorest.co.in";

        UserLombokclass users=new UserLombokclass.UserLombokclassBuilder()
                .name("Siva")
                .email(getrandomEmailid())
                .gender("Male")
                .status("InActive")
                .build();

        Integer userid = given().log().all()
                .header("Authorization", "Bearer 5c07ce0fe40188688405bcba8ffeb952a6eaa46ff35934196e3288b0756778ff")
                .contentType(ContentType.JSON)
                .body(users)
                .when().post("/public/v2/users")
                .then().log().all()
                .assertThat().statusCode(201).extract().path("id");

        System.out.println("userId id is --> " + userid);

        //get call
        given().log().all()
                .header("Authorization", "Bearer 5c07ce0fe40188688405bcba8ffeb952a6eaa46ff35934196e3288b0756778ff")
                .when().get("/public/v2/users/" + userid)
                .then().log().all()
                .assertThat().statusCode(200);

    }

}
