// Package
package com.converterj;

import com.converterj.converters.TempConverter;


/**
 * Main converter class that exposes our converter logic to the main class.
 *
 * Note how the TempConverter interface is implemented here but hides and offloads the implementation to our Temperature class.
 */
public class MainConverter implements TempConverter{
     /**
     * Here we make our tempConverter private as it's good practice to isolate our implementation classes.
     * As MainConverter is the class we are exposing in the Main class, we want to hide our implementation details.
     * This provides lots of advantages. A great example that relates to our new TempConverter interface pattern, is
     * that we can modify how we implement the temp converter without having our calling classes know that we changed it.
     * This is a very power mechanism.
     */
    private TempConverter temperature;
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

    /**
     * Since the main converter implements the interface, we can hide how this class actually does the work.
     *
     *  Putting proper javadoc comments should surface them through the developer's IDE when they are autocompleting the
     *  method calls. Giue it a try by clicking the method call in the Main class and you'll see this comment.
     */
    @Override
    public void celsiusToFahrenheit() {
        temperature.celsiusToFahrenheit();
    }

    @Override
    public void celsiusToKelvin() {
        temperature.celsiusToKelvin();
    }

    @Override
    public void fahrenheitToCelsius() {
        temperature.fahrenheitToCelsius();
    }

    @Override
    public void fahrenheitToKelvin() {
        temperature.fahrenheitToKelvin();
    }

    @Override
    public void kelvinToCelsius() {
        temperature.kelvinToCelsius();
    }

    @Override
    public void kelvinToFahrenheit() {
        temperature.kelvinToFahrenheit();
    }
}