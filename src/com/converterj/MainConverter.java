// Package
package com.converterj;

public class MainConverter {
    // Classes
    public Temperature temperature;
    public Area area;
    public Lenght lenght;
    public Time time;
    public Volume volume;
    public Weight weight;

    // MainConverter
    public MainConverter() {
        temperature = new Temperature();
        area = new Area();
        lenght = new Lenght();
        time = new Time();
        volume = new Volume();
        weight = new Weight();
    }
}