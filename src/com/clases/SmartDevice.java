package com.clases;

public class SmartDevice {

    protected String manufacturer;
    protected int year;
    protected String model;
    protected double version;
    protected String so;
    protected boolean videoCallsI;
    protected boolean connectionI;
    protected String videoCalls;
    protected String connection;


    public SmartDevice() {

    }

    public SmartDevice(String manufacturer, int year, String model, double version, String so,
                       boolean videoCallsI, boolean connectionI, String videoCalls, String connection) {
        this.manufacturer = manufacturer;
        this.year = year;
        this.model = model;
        this.version = version;
        this.so = so;
        this.videoCallsI = videoCallsI;
        this.connectionI = connectionI;
        this.videoCalls = videoCalls;
        this.connection = connection;
    }

    public void internetConnect(boolean enabled) {

        this.connectionI = enabled;
        this.videoCallsI = enabled;
    }


}

