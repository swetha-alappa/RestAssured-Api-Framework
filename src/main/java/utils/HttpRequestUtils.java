package utils;


import io.restassured.RestAssured;
import io.restassured.http.Method;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

import java.io.IOException;

public class HttpRequestUtils {

    public static String makeRequest(String baseUri, Method method) throws IOException {
        RestAssured.baseURI = baseUri;
        RequestSpecification httpRequest = RestAssured.given();
        Response response = httpRequest.request(method);
        return response.getBody().asString();
    }

    public static String makeRequest(String baseUri, Method method,String requestBody) throws IOException {
        RestAssured.baseURI = baseUri;
        RequestSpecification httpRequest = RestAssured.given();
        httpRequest.body(requestBody);
        Response response = httpRequest.request(method);
        return response.getBody().asString();
    }
}
