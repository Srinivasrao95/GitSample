package restAssured;

import static io.restassured.RestAssured.*;
import static org.hamcrest.Matchers.equalTo;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import org.hamcrest.Matchers.*;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;


public class ContactsAPI {

    @BeforeMethod
    public void Setup() {
        RestAssured.baseURI = "https://thinking-tester-contact-list.herokuapp.com";
    }

    @Test
    public void getContacts() {

        given().log().all()
                .header("Authorization", "Bearer eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9.eyJfaWQiOiI2N2E0ZGQ4Y2ZkYzQ5ZDAwMTNlOTA5ZWEiLCJpYXQiOjE3NDQwOTM0MTR9.Z6r-4Wrugl9Bxk9EzJV0WbjJ1Zic2ZCvPI2Gux0hibc")
                .when().get("/contacts")
                .then().log().all()
                .assertThat().statusCode(200).
                and().body("$.size()", equalTo(7));
    }

    @Test
    public void getContactsAuthErrortest() {

        given().log().all()
                .header("Authorization", "Srinivas")
                .when().get("/contacts")
                .then().log().all()
                .assertThat().statusCode(401).
                and().contentType(ContentType.JSON);
    }

    @Test
    public void getContactsAuthErrorvalidation() {

        String errormessage = given().log().all()
                .header("Authorization", "Srinivas123")
                .when().get("/contacts")
                .then()
                .extract().path("error");
        System.out.println(errormessage);
        Assert.assertEquals(errormessage, "Please authenticate.");
    }

}
