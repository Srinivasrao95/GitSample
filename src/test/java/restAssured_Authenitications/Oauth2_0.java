package restAssured_Authenitications;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Oauth2_0 {
    private String accessToken;

    @BeforeMethod
    public void getAccessToken() {
        RestAssured.baseURI = "https://test.api.amadeus.com";

        Response response = RestAssured.given()
                .contentType(ContentType.URLENC)
                .formParam("grant_type", "client_credentials")
                .formParam("client_id", "FWQQCEeLDZGNlECKDGeQ1UAJzHRTHlhW")
                .formParam("client_secret", "msJQccksUBhIAj5W")
                .when()
                .post("/v1/security/oauth2/token");
        response.prettyPrint();
        Assert.assertEquals(response.getStatusCode(), 200);
        accessToken = response.jsonPath().getString("access_token");
        System.out.println(accessToken);

    }

    @Test
    public void getFlightDetails() {
        RestAssured.baseURI = "https://test.api.amadeus.com";
        RestAssured.given().log().all()
                .header("Authorization", "Bearer " + accessToken)
                .when()
                .get("v1/shopping/flight-destinations?origin=PAR&maxPrice=200")
                .then().log().all()
                .assertThat().statusCode(200);


    }

    @Test
    public void getFlightDetailsbyOauth() {
        RestAssured.baseURI = "https://test.api.amadeus.com";
        RestAssured.given().log().all()
                .auth().oauth2(accessToken)
                .when()
                .get("v1/shopping/flight-destinations?origin=PAR&maxPrice=200")
                .then().log().all()
                .assertThat().statusCode(200);


    }
}
