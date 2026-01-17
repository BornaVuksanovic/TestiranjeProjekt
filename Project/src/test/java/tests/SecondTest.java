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

public class SecondTest {
    final static String ROOT_URI = "http://localhost:700/books/";

    @Test
    public void post_test() {
        Response response = given().
                contentType(ContentType.JSON)
                .accept(ContentType.JSON)
                .body("{\"title\": \"Ježeva Kućica\", \"caption\": \"Super knjiga za djecu\",  \"image\": \"\", \"rating\": 5, \"user\": 5}")
                .when()
                .post(ROOT_URI);
        System.out.println("POST Response\n" + response.asString());

        response.then().body("title", Matchers.is("Ježeva Kućica"));
        response.then().body("rating", equalTo(5));
    }


}
