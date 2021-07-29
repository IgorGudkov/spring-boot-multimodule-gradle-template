package com.gudkov.demo;

import org.junit.jupiter.api.Test;

import static io.restassured.RestAssured.given;
import static org.apache.http.HttpStatus.SC_OK;
import static org.hamcrest.Matchers.equalTo;

public class DemoFuncTest extends BaseFuncTest {

    @Test
    public void demoGreetingTest() {

        given()
                .param("name", "Demo")
                .when()
                .get("/api/v1/demo/greeting")
                .then()
                .statusCode(SC_OK)
                .assertThat()
                .body(equalTo("Hello Demo!"));
    }
}
