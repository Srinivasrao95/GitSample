package restAssuredNonbdd;
import static io.restassured.RestAssured.*;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.specification.RequestSpecification;
import org.hamcrest.Matchers.*;

import org.testng.annotations.Test;

public class post_with_different_body {


@Test
    public void text(){
    RestAssured.baseURI="https://postman-echo.com";
    String payload="Hi i am Srinivas";
    given().log().all()
            .contentType(ContentType.TEXT)
            .body(payload)
            .when().post("/post")
            .then().log().all()
            .assertThat().statusCode(200);


}


}
