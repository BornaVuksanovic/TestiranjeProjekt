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
public class FourthTest {

    final static String ROOT_URI = "http://localhost:700/books/";



    @Test
    public void patch_test() {
        Response response = given()
                .contentType(ContentType.JSON)
                .accept(ContentType.JSON)
                .body("{\"title\": \"Matematika 1\" ,\"rating\": 1}")
                .when()
                .patch(ROOT_URI + "update/3");
        System.out.println("PATCH Response\n" + response.asString());
        response.then().body("id", Matchers.is(3));
        response.then().body("title", Matchers.is("Matematika 1"));
        response.then().body("rating", Matchers.is(1));

    }


}
