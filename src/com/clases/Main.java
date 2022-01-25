package com.clases;

import com.herencia.SmartPhone;
import com.herencia.SmartWatch;

public class Main {

    public static void main(String[] args) {



        System.out.println("Telefono movil");
        SmartPhone telMovil = new SmartPhone("JBG", 2022, "Fho", 1.0, "SOj",
                true, true, "Si", "Si","Siete p",1080);

        System.out.println("Size: " + telMovil.sice);
        System.out.println("PPP: " + telMovil.ppp);
        // Llamada al método
        telMovil.internetConnect(telMovil.connectionI);
        System.out.println("Connected video call: " + telMovil.videoCallsI);


        System.out.println(" ");

        System.out.println("Reloj Inteligente");
        SmartWatch relojIntelli = new SmartWatch ("ASN", 2022, "uN", 1.3, "AS",
                true, true, "Yes", "Yes","Dos plugadas", 480);

        System.out.println("Manufacturer: " + relojIntelli.manufacturer);
        System.out.println("Model: " + relojIntelli.model);
        // Llamada al método
        relojIntelli.internetConnect(relojIntelli.connectionI);
        System.out.println("Connected: " +relojIntelli.connectionI);

    }
}
