package com.viewQwest.appTesting.service;

import com.google.gson.Gson;
import com.jayway.restassured.RestAssured;
import com.jayway.restassured.http.ContentType;
import com.jayway.restassured.response.Response;
import org.codehaus.jettison.json.JSONArray;
import org.codehaus.jettison.json.JSONException;
import org.codehaus.jettison.json.JSONObject;
import org.testng.Assert;

import static com.jayway.restassured.RestAssured.given;

public class Service {
    private static String baseURL = "http://core.octopus:8181/rest";
    static JSONArray jsonArray;

    public static void main(String[] args) throws JSONException {
        RestAssured.baseURI = baseURL;
        Response response = given().when().get("/octopus/layout/groups/custom/members").then().contentType(ContentType.JSON).extract().response();
        Assert.assertEquals(response.statusCode(), 200);
        jsonArray = new JSONArray(response.body().asString());

        JSONObject jsonObject = jsonArray.getJSONObject(0);
        System.out.println(jsonObject);

        Gson gson = new Gson();
        Group group = gson.fromJson(String.valueOf(jsonObject), Group.class);
        System.out.println(group);
    }
}
