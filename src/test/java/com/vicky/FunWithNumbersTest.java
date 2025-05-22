package com.vicky;

import io.quarkus.test.junit.QuarkusTest;
import org.junit.jupiter.api.Test;

import static io.restassured.RestAssured.given;
import static org.hamcrest.CoreMatchers.is;

@QuarkusTest
class FunWithNumbersTest {
    @Test
    void testFunWithNumbersAddEndpoint() {
        given()
          .when().get("/funWithNumbers/addFish")
          .then()
             .statusCode(200)
             .body(is("42"));
    }

    @Test
    void testFunWithNumbersMinusEndpoint() {
        given()
                .when().get("/funWithNumbers/minusFish")
                .then()
                .statusCode(200)
                .body(is("-42"));
    }

    @Test
    void testFunWithNumbersSoLong() {
        given()
                .when().get("/funWithNumbers/soLong")
                .then()
                .statusCode(200)
                .body(is(""));
    }
}