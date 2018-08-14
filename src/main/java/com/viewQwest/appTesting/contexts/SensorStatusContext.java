package com.viewQwest.appTesting.contexts;

public class SensorStatusContext implements Context {

    private String sensorName;

    public String getSensorName() {
        return sensorName;
    }

    public void setSensorName(String sensorName) {
        this.sensorName = sensorName;
    }

    public static SensorStatusContext build(String name) {
        SensorStatusContext context = new SensorStatusContext();
        context.setSensorName(name);
        return context;
    }
}
