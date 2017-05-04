package com.nestor.util;

import io.restassured.response.ResponseBody;

import java.util.Map;

import static io.restassured.RestAssured.given;

/**
 * Created by nestor on 04.05.2017.
 */
public class Requests {

    public static void doGet(String url, Map<String, ?> params) {
        ResponseBody body = given()
                .params(params)
                .when().
                get(url).
                body();
        body.prettyPrint();
    }


}
