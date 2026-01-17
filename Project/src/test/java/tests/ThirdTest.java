
package tests;

import static io.restassured.RestAssured.delete;
import static io.restassured.RestAssured.get;
import static io.restassured.RestAssured.given;
import static org.hamcrest.Matchers.hasItems;
import static org.hamcrest.core.IsEqual.equalTo;

import org.hamcrest.Matchers;
import org.testng.annotations.Test;
import io.restassured.http.ContentType;
import io.restassured.response.Response;

public class ThirdTest {


    final static String ROOT_URI = "http://localhost:700/books/";


    @Test
    public void put_test() {
        Response response = given()
                .contentType(ContentType.JSON)
                .accept(ContentType.JSON)
                .body("{\"title\": \"Preobrazba\",\"caption\": \"Jedna od rijetkih koje sam pročitao\" ,\"rating\": 5}")
                .when()
                .put(ROOT_URI + "update/2");
        System.out.println("PUT Response\n" + response.asString());
        response.then().body("id", Matchers.is(2));
        response.then().body("title", Matchers.is("Preobrazba"));
        response.then().body("caption", Matchers.is("Jedna od rijetkih koje sam pročitao"));
        response.then().body("rating", Matchers.is(5));
    }


}
