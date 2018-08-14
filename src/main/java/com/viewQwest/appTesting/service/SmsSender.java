package com.viewQwest.appTesting.service;


import com.twilio.Twilio;
import com.twilio.rest.api.v2010.account.Message;
import com.twilio.type.PhoneNumber;

public class SmsSender {

    // Find your Account Sid and Auth Token at twilio.com/console
    public static final String ACCOUNT_SID = "XXXXX"; //change XXXXX before used
    public static final String AUTH_TOKEN = "XXXXX"; //change XXXXX before used

    public static void main(String[] args) {
        Twilio.init(ACCOUNT_SID, AUTH_TOKEN);

        Message message = Message
                .creator(new PhoneNumber("+60172870749"), // to
                        new PhoneNumber("+601117223235"), // from
                        "Test Message by: viewQwest..")
                .create();

        System.out.println(message.getSid());

    }
}