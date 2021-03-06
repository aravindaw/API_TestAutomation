package com.viewQwest.appTesting.scripts;

import com.jayway.restassured.RestAssured;
import com.viewQwest.appTesting.contexts.SmartSwitchContext;
import com.viewQwest.appTesting.documents.SmartSwitchDocument;
import org.codehaus.jettison.json.JSONException;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

/**
 * OTC35_TurnOffSmartSwitch
 */
public class OTC35_TurnOffSmartSwitch {
    @BeforeTest
    public void checkConnectivity() {
        Octopus octopus = new Octopus();
        RestAssured.baseURI = octopus.checkOctopusConnectivity();
    }

    @Test
    public void turnOffSmartSwitch() throws JSONException {
        SmartSwitchDocument smartSwitch = new SmartSwitchDocument();
        smartSwitch.setContext(SmartSwitchContext.build("OFF"));
        smartSwitch.smartSwitchControl();
    }
}
