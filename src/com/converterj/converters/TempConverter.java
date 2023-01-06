package com.converterj.converters;


/**
 * TemperatureConverter Interface
 * We want to provide our converter class implementations with an abstraction to follow
 * https://www.baeldung.com/java-interfaces
 *
 * Dev note: If using intelliJ or other proper IDE, you can click through the interface class and find the classes that
 * implement it. Seems trivial now, but in professional environments its a brilliant way to see which classes implement
 * the interface.
 */
public interface TempConverter {

    // Celsius to Fahrenheit
    public void celsiusToFahrenheit();

    // Celsius to Kelvin
    public void celsiusToKelvin();

    // Fahrenheit to Celsius
    public void fahrenheitToCelsius();

    // Fahrenheit to Kelvin
    public void fahrenheitToKelvin();

    // Kelvin to Celsius
    public void  kelvinToCelsius();

    // Kelvin to Fahrenheit
    public void kelvinToFahrenheit();

}
