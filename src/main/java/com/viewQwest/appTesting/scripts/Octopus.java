package com.viewQwest.appTesting.scripts;

import com.jayway.restassured.RestAssured;
import com.jayway.restassured.response.Response;
import com.viewQwest.appTesting.documents.SmartSwitchDocument;
import org.testng.Assert;

import static com.jayway.restassured.RestAssured.given;

public class Octopus {
    private static org.apache.log4j.Logger log = org.apache.log4j.Logger.getLogger(SmartSwitchDocument.class);

    public String checkOctopusConnectivity() {
        String baseURL = "http://core.octopus:8181/rest";
        RestAssured.baseURI = baseURL;

        Response response = given().get("/uuid");
        Assert.assertEquals(response.statusCode(), 200);
        log.info(response.asString());
        return baseURL;
    }

}
