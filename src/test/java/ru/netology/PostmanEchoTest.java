package ru.netology;

import org.junit.jupiter.api.Test;

import static io.restassured.RestAssured.given;
import static org.hamcrest.Matchers.equalTo;
import static sun.text.normalizer.NormalizerImpl.UTF16Plus.equal;

public class PostmanEchoTest {

    @Test

    public void shouldReturnSentData(){

        given()
                .baseUri("https://postman-echo.com")
                .contentType("text/plain; charset=UTF-8")
                .body("Привет из Постмана")
                .when()
                .post("/post")
                .then()
                .statusCode(200)
                .body("data", equal("Привет из Постмана"))
        ;

    }

}
