package com.nestor.util;

import io.restassured.response.ResponseBody;

import javax.net.ssl.HttpsURLConnection;
import java.io.BufferedReader;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.URL;
import java.util.Map;

import static io.restassured.RestAssured.given;


/**
 * Created by sbt-velichko-aa on 18.04.17.
 */
public class HttpRequests {

    private static final String USER_AGENT = "Mozilla/5.0";

    /**
     * Class not for extends
     */
    private HttpRequests() {}

    public static int sendTwitterPost(Map<String, ?> params) {
        ResponseBody body = given().
                param("oauth_callback", "http://172.29.84.43:8080/webservice/").
                param("oauth_consumer_key", Props.get("user.consumer_key")).
                param("oauth_token", Props.get("user.token")).
                param("oauth_nonce", "ea9ec8429b68d6b77cd5600adbbb0456").
                param("oauth_signature_method", "HMAC-SHA1").
                param("oauth_timestamp", System.currentTimeMillis()).
                param("oauth_version", "1.0").
                params(params).
                when().
                post("https://api.twitter.com/oauth/request_token").
                body();
        body.prettyPrint();
    }

    /**
     * method to send get requests
     *
     * @param url
     * @param params
     * @return
     */
    public static int sendGet(String url, String... params) {
        int resultCode = -1;


        return resultCode;
    }

    public static int sendPost(String url, Map<String, Object> params) throws IOException {
        int responseCode = -1;
        URL obj = new URL(url);
        HttpsURLConnection con = (HttpsURLConnection) obj.openConnection();

        //add reuqest header
        con.setRequestMethod("POST");
        con.setRequestProperty("User-Agent", USER_AGENT);
        con.setRequestProperty("Accept-Language", "en-US,en;q=0.5");
        con.setRequestProperty("Accept-Language", "en-US,en;q=0.5");

//        StringBuffer urlParameters = new StringBuffer();
//        params.forEach((k, v) -> urlParameters.append(k).append("=").append(v.toString()));
        String urlParameters = "oauth_callback=http://172.29.84.43:8080/webservice/";
        // Send post request
        con.setDoOutput(true);
        DataOutputStream wr = new DataOutputStream(con.getOutputStream());
        wr.writeBytes(urlParameters);
        wr.flush();
        wr.close();

        responseCode = con.getResponseCode();
        System.out.println("\nSending 'POST' request to URL : " + url);
        System.out.println("Post parameters : " + urlParameters);
        System.out.println("Response Code : " + responseCode);

        BufferedReader in = new BufferedReader(
                new InputStreamReader(con.getInputStream()));
        String inputLine;
        StringBuffer response = new StringBuffer();

        while ((inputLine = in.readLine()) != null) {
            response.append(inputLine);
        }
        in.close();

        //print result
        System.out.println(response.toString());

        return responseCode;
    }


}
