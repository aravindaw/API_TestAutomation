package com.viewQwest.appTesting.service;

public class Group {
    private String name;
    private String label;
    private Members[] members;

    public Group(String name, String label, Members[] members) {
        this.name = name;
        this.label = label;
        this.members = members;
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

    public Members[] getMembers() {
        return members;
    }

    public void setMembers(Members[] members) {
        this.members = members;
    }
}
