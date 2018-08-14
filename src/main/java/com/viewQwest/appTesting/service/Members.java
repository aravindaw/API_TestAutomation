package com.viewQwest.appTesting.service;

public class Members {
    private String state;
    private String link;
    private String name;
    private String label;
    private String type;
    private Hardware hardware;
    private String icon;
    private String batteryLevel;

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public Hardware getHardware() {
        return hardware;
    }

    public void setHardware(Hardware hardware) {
        this.hardware = hardware;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLabel() {
        return label;
    }

    public void setLabel(String label) {
        this.label = label;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getIcon() {
        return icon;
    }

    public void setIcon(String icon) {
        this.icon = icon;
    }

    public String getBatteryLevel() {
        return batteryLevel;
    }

    public void setBatteryLevel(String batteryLevel) {
        this.batteryLevel = batteryLevel;
    }

    public String getLink() {
        return link;
    }

    public void setLink(String link) {
        this.link = link;
    }

    public Members(String name, String label, String type, String icon, String batteryLevel, Hardware hardware, String link, String state) {
        this.name = name;
        this.label = label;
        this.type = type;
        this.icon = icon;
        this.batteryLevel = batteryLevel;
        this.hardware = hardware;
        this.link = link;
        this.state = state;
    }
}
