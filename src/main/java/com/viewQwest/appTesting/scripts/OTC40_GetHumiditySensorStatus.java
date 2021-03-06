package com.viewQwest.appTesting.scripts;

import com.jayway.restassured.RestAssured;
import com.viewQwest.appTesting.contexts.SensorStatusContext;
import com.viewQwest.appTesting.documents.SensorStatusDocument;
import org.codehaus.jettison.json.JSONException;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class OTC40_GetHumiditySensorStatus {
    @BeforeTest
    public void checkConnectivity() {
        Octopus octopus = new Octopus();
        RestAssured.baseURI = octopus.checkOctopusConnectivity();
    }

    @Test
    public void getHumiditySensorStatus() throws JSONException {
        SensorStatusDocument humiditySensor = new SensorStatusDocument();
        humiditySensor.setContext(SensorStatusContext.build("sensor_relhumidity"));
        humiditySensor.GetSensorStatus();
    }
}
