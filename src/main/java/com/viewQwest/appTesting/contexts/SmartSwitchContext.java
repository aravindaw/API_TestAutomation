package com.viewQwest.appTesting.contexts;

public class SmartSwitchContext implements Context {

    private String switchState;

    public String getSwitchState() {
        return switchState;
    }

    public void setSwitchState(String switchState) {
        this.switchState = switchState;
    }

    public static SmartSwitchContext build(String state) {
        SmartSwitchContext context = new SmartSwitchContext();
        context.setSwitchState(state);
        return context;
    }


}
