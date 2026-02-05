package restAssured;
import static io.restassured.RestAssured.*;
import static org.hamcrest.Matchers.hasItem;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import static org.hamcrest.Matchers.*;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;


public class Pathparam {


    @BeforeMethod
    public void setup() {
        RestAssured.baseURI = "https://gorest.co.in";
    }



    @DataProvider
    public Object[][] testdata(){
        return new Object[][]{
                {7820539 , "Vobis absconditus libero qui aequitas."},
                {7824131, "Tamen curvo tergum sulum agnosco custodia et cimentarius."}

        };
    }


    @Test(dataProvider ="testdata")
    public void getpathparam(int userid, String title){

        given().log().all()
                .header("Authorization", "Bearer 5c07ce0fe40188688405bcba8ffeb952a6eaa46ff35934196e3288b0756778ff")
                .pathParams("userID", userid)
                .when().log().all()
                .get("public/v2/users/{userID}/posts").then().log().all()
                .assertThat().statusCode(200)
                .and()
                .body("title", hasItem(title));


    }
}
