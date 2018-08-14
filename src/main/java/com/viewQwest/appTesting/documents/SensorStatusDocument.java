package com.viewQwest.appTesting.documents;

import com.google.gson.Gson;
import com.jayway.restassured.http.ContentType;
import com.jayway.restassured.response.Response;
import com.viewQwest.appTesting.contexts.SensorStatusContext;
import com.viewQwest.appTesting.service.Group;
import com.viewQwest.appTesting.service.Members;
import org.apache.log4j.Logger;
import org.testng.Assert;

import static com.jayway.restassured.RestAssured.given;

public class SensorStatusDocument implements Document {
    private static Logger log = Logger.getLogger(SensorStatusDocument.class);
    private SensorStatusContext context = null;

    public void GetSensorStatus() {
        Response response = given().
                when().
                get("/octopus/layout/groups/custom/members").
                then().
                contentType(ContentType.JSON).
                extract().
                response();
        Assert.assertEquals(response.statusCode(), 200);
        System.out.println(response.asString());

        Gson gson = new Gson();
        Group[] groupList = gson.fromJson(response.asString(), Group[].class);
        String defaultGroupName = "default_group";

        for (Group group : groupList) {
            if (group.getName().equals(defaultGroupName)) {
                for (Members member : group.getMembers()) {
                    log.info("Current members of the Default Group :" + member.getName());
                    if (member.getName().contains(context.getSensorName())) {

                        log.info("\n[[ HARDWARE NAME : " + member.getHardware().getName() + " ]]" + "\n" +
                                "[[ DEVICE LABEL : " + member.getLabel() + " ]]" + "\n" +
                                "[[ HARDWARE STATUS : " + member.getHardware().getStatus() + " ]]" + "\n" +
                                "[[ BATTERY LEVEL: " + member.getBatteryLevel() + " ]]" + "\n" +
                                "[[ STATE OF THE DEVICE : " + member.getState() + " ]]");

                    }
                }
            }

        }


    }

    public void setContext(SensorStatusContext context) {
        this.context = context;
    }
}
