package restAssured_Authenitications;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import org.testng.annotations.Test;

public class Basic_Digest {


    @Test
    public void BasicAuth() {
        RestAssured.baseURI = "https://the-internet.herokuapp.com";
        RestAssured.given().log().all()
                .auth()
                .basic("admin", "admin")
                .when()
                .get("/basic_auth")
                .then().log().all()
                .assertThat().statusCode(200);

    }
    @Test
    public void DigestiveAuth(){
        RestAssured.baseURI="https://postman-echo.com";
        RestAssured.given().log().all()
                .auth().digest("postman","password")
                .when()
                .get("/digest-auth")
                .then().log().all()
                .assertThat()
                .statusCode(200);
    }
    @Test
    public void preemitiveAuth() {
        RestAssured.baseURI = "https://the-internet.herokuapp.com";
        RestAssured.given().log().all()
                .auth().preemptive()
                .basic("admin", "admin")
                .when()
                .get("/basic_auth")
                .then().log().all()
                .assertThat().statusCode(200);

    }
}
