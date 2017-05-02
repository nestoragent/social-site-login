package com.nestor.util;

import io.restassured.response.ResponseBody;
import org.junit.Test;

import java.io.IOException;
import java.util.HashMap;

import static io.restassured.RestAssured.given;

/**
 * Created by sbt-velichko-aa on 18.04.17.
 */
public class HttpRequestsTest {

    @Test
    public void sendPost() throws Exception {
//        int responseToken = -1;
//        HashMap<String, Object> paramsRequestToken = new HashMap<>();
//        paramsRequestToken.put("oauth_callback", "http://172.29.84.43:8080/webservice/");
//        try {
//            responseToken = HttpRequests.sendPost("https://api.twitter.com/oauth/request_token", paramsRequestToken);
//        } catch (IOException e) {
//            e.printStackTrace();
//        }
//         ResponseBody body = given().
//                param("oauth_callback", "http://172.29.84.43:8080/webservice/").
////                param("oauth_consumer_key", "cChZNFj6T5R0TigYB9yd1w").
////                param("oauth_nonce", "ea9ec8429b68d6b77cd5600adbbb0456").
////                param("oauth_signature", "F1Li3tvehgcraF8DMJ7OyxO4w9Y%3D").
////                param("oauth_signature_method", "HMAC-SHA1").
//                param("oauth_timestamp", System.currentTimeMillis()).
//                param("oauth_version", "1.0").
//                when().
//                post("https://api.twitter.com/oauth/request_token").
//                body();
//        body.prettyPrint();
//        Assert.assertEquals(200, responseToken);
    }

}