package com.viewQwest.appTesting.scripts;

import com.jayway.restassured.RestAssured;
import com.viewQwest.appTesting.contexts.SmartSwitchContext;
import com.viewQwest.appTesting.documents.SmartSwitchDocument;
import org.codehaus.jettison.json.JSONException;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

/**
 * TC01_TC01_TurnOnSmartSwitch
 */
public class OTC34_TurnOnSmartSwitch {

    @BeforeTest
    public void checkConnectivity() {
        Octopus octopus = new Octopus();
        RestAssured.baseURI = octopus.checkOctopusConnectivity();
    }


    @Test
    public void turnOnSmartSwitch() throws JSONException {
        SmartSwitchDocument smartSwitch = new SmartSwitchDocument();
        smartSwitch.setContext(SmartSwitchContext.build("ON"));
        smartSwitch.smartSwitchControl();
    }
}

