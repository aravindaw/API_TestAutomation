package com.viewQwest.appTesting.service;

public class Hardware {
    private String name;
    private String status;
    private String thingUId;
    private String statusDetaill;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getThingUId() {
        return thingUId;
    }

    public void setThingUId(String thingUId) {
        this.thingUId = thingUId;
    }

    public String getStatusDetaill() {
        return statusDetaill;
    }

    public void setStatusDetaill(String statusDetaill) {
        this.statusDetaill = statusDetaill;
    }

    public Hardware(String name, String status, String thingUId, String statusDetaill) {

        this.name = name;
        this.status = status;
        this.thingUId = thingUId;
        this.statusDetaill = statusDetaill;
    }
}
