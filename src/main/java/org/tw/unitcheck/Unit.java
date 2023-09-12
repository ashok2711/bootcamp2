package org.tw.unitcheck;

public enum Unit {

    CM(1.0),
    M(100)
    ;
    private double centimeters;


    Unit(double centimeters) {
        this.centimeters = centimeters;
    }

    public double getCentimeters() {
        return centimeters;
    }
}
