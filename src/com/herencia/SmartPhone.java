package com.herencia;

import com.clases.SmartDevice;

public class SmartPhone extends SmartDevice {

    public String sice;
    public double ppp;

    public SmartPhone () {}  // Constructor vacío

    public SmartPhone(String manufacturer, int year, String model, double version, String so, boolean videoCallsI,
                      boolean connectionI, String videoCalls, String connection, String sice, double ppp) {
        super(manufacturer, year, model, version, so, videoCallsI, connectionI, videoCalls, connection);
        this.sice = sice;
        this.ppp = ppp;
    }


}
