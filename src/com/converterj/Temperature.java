// Package
package com.converterj;

// Imports
import com.converterj.converters.TempConverter;
import java.util.*;

public class Temperature implements TempConverter {
    Scanner scan = new Scanner(System.in);
    
    public static final double CELSIUS_TO_FARH_RATIO = 1.8000;
    public static final double FARH_TEMP_FOR_ZERO_CELSIUS = 32;
    public static final double ZERO_KELVINS = 273.15;

    /**
    * Celsius to Fahrenheit implementation
    */
    @Override
    public void celsiusToFahrenheit() {
        System.out.println("Please Enter Celsius Value: ");
        double c = scan.nextDouble();
        double f = (c * CELSIUS_TO_FARH_RATIO) + FARH_TEMP_FOR_ZERO_CELSIUS;
        System.out.println(c + "°C is " + f + "°F");
    }

    /**
     * Celsius to Kelvin
     */
    @Override
    public void celsiusToKelvin() {
        System.out.println("Please Enter Celsius Value: ");
        double c = scan.nextDouble();
        double k = c + ZERO_KELVINS;
        System.out.println(c + "°C is " + k + "°K");
    }

    /**
     * Fahrenheit to Celsius
     */
    @Override
    public void fahrenheitToCelsius() {
        System.out.println("Please Enter Fahrenheit Value: ");
        double f = scan.nextDouble();
        double c = (f - FARH_TEMP_FOR_ZERO_CELSIUS) / CELSIUS_TO_FARH_RATIO;
        System.out.println(f + "°F is " + c + "°C");
    }

    /**
     * Fahrenheit to Kelvin
     */
    @Override
    public void fahrenheitToKelvin() {
        System.out.println("Please Enter Fahrenheit Value: ");
        double f = scan.nextDouble();
        double k = ((f - FARH_TEMP_FOR_ZERO_CELSIUS) / CELSIUS_TO_FARH_RATIO) + ZERO_KELVINS;
        System.out.println(f + "°F is " + k + "°K");
    }

    /**
     * Kelvin To Celsius
     */
    @Override
    public void kelvinToCelsius() {
        System.out.println("Please Enter Kelvin Value: ");
        double k = scan.nextDouble();
        double c = k - ZERO_KELVINS;
        System.out.println(k + "°K is " + c + "°C");
    }

    /**
     * Kelvin to Fahrenheit
     */
    @Override
    public void kelvinToFahrenheit() {
        System.out.println("Please Enter Kelvin Value: ");
        double k = scan.nextDouble();
        double f = ((k - ZERO_KELVINS) * CELSIUS_TO_FARH_RATIO) + FARH_TEMP_FOR_ZERO_CELSIUS;
        System.out.println(k + "°K is " + f + "°F");
    }
}