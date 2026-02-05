package restAssuredNonbdd;

import static io.restassured.RestAssured.*;

import io.restassured.RestAssured;
import io.restassured.http.Header;
import io.restassured.http.Headers;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;
import org.hamcrest.Matchers.*;
import org.testng.annotations.Test;

import java.util.List;

public class GetContactsAPITest {

    @Test
    public void getcontactsapi() {
        RestAssured.baseURI = "https://thinking-tester-contact-list.herokuapp.com";

        RequestSpecification request = RestAssured.given();
        request.header("authorization", "Bearer eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9.eyJfaWQiOiI2N2E0ZGQ4Y2ZkYzQ5ZDAwMTNlOTA5ZWEiLCJpYXQiOjE3NDQ2MTA0MTV9.0rrLt84Rf9i7u4o0p02FM0Mjij-THmRcE-6RTSLgVVQ");

        Response response = request.get("/contacts");
        response.prettyPrint();
        System.out.println(response.statusCode());
        System.out.println(response.statusLine());
        String content_type = response.header("content-type");
        System.out.println(content_type);

        Headers header = response.headers();
        List<Header> headerslist = header.asList();
        System.out.println(headerslist.size());

        for (Header e : headerslist) {
            String name = e.getName();
            String value = e.getValue();
            System.out.println(name +" :"+ value);
        }


    }


}
