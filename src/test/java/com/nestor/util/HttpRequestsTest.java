package com.nestor.util;

import org.junit.Assert;
import org.junit.Test;

import java.io.IOException;
import java.util.HashMap;

/**
 * Created by sbt-velichko-aa on 18.04.17.
 */
public class HttpRequestsTest {

    @Test
    public void sendPost() throws Exception {
        int responseToken = -1;
        HashMap<String, Object> paramsRequestToken = new HashMap<>();
        paramsRequestToken.put("oauth_callback", "http://172.29.84.43:8080/webservice/");
        try {
            responseToken = HttpRequests.sendPost("https://api.twitter.com/oauth/request_token", paramsRequestToken);
        } catch (IOException e) {
            e.printStackTrace();
        }
        Assert.assertEquals(200, responseToken);
    }

}