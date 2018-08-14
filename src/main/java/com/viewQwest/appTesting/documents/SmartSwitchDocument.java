package com.viewQwest.appTesting.documents;

import com.google.gson.Gson;
import com.jayway.restassured.http.ContentType;
import com.jayway.restassured.response.Response;
import com.viewQwest.appTesting.contexts.SmartSwitchContext;
import com.viewQwest.appTesting.service.Group;
import com.viewQwest.appTesting.service.Members;
import org.testng.Assert;
import org.apache.log4j.*;


import static com.jayway.restassured.RestAssured.given;

public class SmartSwitchDocument implements Document {
    private static Logger log = Logger.getLogger(SmartSwitchDocument.class);
    private SmartSwitchContext context = null;

    public void smartSwitchControl() {
        Response response = given().
                when().
                get("/octopus/layout/groups/custom/members").
                then().
                contentType(ContentType.JSON).
                extract().
                response();
        Assert.assertEquals(response.statusCode(), 200);

        Gson gson = new Gson();
        Group[] groupList = gson.fromJson(response.asString(), Group[].class);
        String defaultGroupName = "default_group";

        for (Group group : groupList) {
            if (group.getName().equals(defaultGroupName)) {
                for (Members member : group.getMembers()) {
                    log.info("Current members :" + member.getName());
                    if (member.getName().contains("switch_binary")) {
                        String link = member.getLink();
                        Response command = given().
                                when().
                                body(context.getSwitchState()).
                                post(link).
                                then().
                                contentType(ContentType.TEXT).extract().response();
                        Assert.assertEquals(command.statusCode(), 200);

                    }
                }
            }

        }
    }

    public void setContext(SmartSwitchContext context) {
        this.context = context;
    }
}
