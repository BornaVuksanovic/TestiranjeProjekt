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

public class FirstTest {
    final static String ROOT_URI = "http://localhost:700/books/";

       @Test
       public void simple_get_test() {
           Response response = get(ROOT_URI );
           System.out.println(response.asString());
           response.then().body("title", hasItems("Harry Potter i darovi smrti"));
           response.then().body("rating", hasItems(4));
       }


}
