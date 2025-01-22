package com.api.tests;
import org.testng.annotations.Test;
import static io.restassured.RestAssured.*;
import static org.hamcrest.Matchers.*;

public class APITests {

    @Test
    public void login() {
        given()
                .baseUri("http://64.227.160.186:8080/api/auth/")
                .header("Content-type","application/json")
                .body("{\"username\": \"uday1234\", \"password\": \"uday12345\"}")
                .when()
                .log().all()
                .post("/login")
                .then()
                .log().all()
                .statusCode(200)
                .time(lessThan(3000L));
    }

}
