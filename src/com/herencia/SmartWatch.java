package com.herencia;

import com.clases.SmartDevice;

public class SmartWatch extends SmartDevice {

    String sice;
    double ppp;

    public SmartWatch () {} // Constructor vacío

    public SmartWatch(String manufacturer, int year, String model, double version, String so, boolean videoCallsI,
                      boolean connectionI, String videoCalls, String connection, String sice, double ppp) {
        super(manufacturer, year, model, version, so, videoCallsI, connectionI, videoCalls, connection);
        this.sice = sice;
        this.ppp = ppp;
    }
}
