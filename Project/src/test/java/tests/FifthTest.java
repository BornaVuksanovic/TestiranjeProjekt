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
public class FifthTest {

    final static String ROOT_URI = "http://localhost:700/books/";

    @Test
    public void delete_test() {
        Response response = delete(ROOT_URI + "delete/4");
        System.out.println(response.asString());
        System.out.println(response.getStatusCode());

        response = get(ROOT_URI);
        System.out.println(response.asString());
        response.then().body("id", Matchers.not(4));
    }

}
