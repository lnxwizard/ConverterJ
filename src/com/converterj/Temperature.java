// Package
package com.converterj;

// Imports
import com.converterj.converters.TempConverter;

import java.util.*;

public class Temperature implements TempConverter {
    Scanner scan = new Scanner(System.in);

    /**
    * Celsius to Fahrenheit implementation
    */
    @Override
    public void celsiusToFahrenheit() {
        System.out.println("Please Enter Celsius Value: ");
        double c = scan.nextDouble();
        double f = (c * 1.8000) + 32;
        System.out.println(c + "°C is " + f + "°F");
    }

    /**
     * Celsius to Kelvin
     */
    @Override
    public void celsiusToKelvin() {
        System.out.println("Please Enter Celsius Value: ");
        double c = scan.nextDouble();
        double k = c + 273.15;
        System.out.println(c + "°C is " + k + "°K");
    }

    /**
     * Fahrenheit to Celsius
     */
    @Override
    public void fahrenheitToCelsius() {
        System.out.println("Please Enter Fahrenheit Value: ");
        double f = scan.nextDouble();
        double c = (f - 32) / 1.8000;
        System.out.println(f + "°F is " + c + "°C");
    }

    /**
     * Fahrenheit to Kelvin
     */
    @Override
    public void fahrenheitToKelvin() {
        System.out.println("Please Enter Fahrenheit Value: ");
        double f = scan.nextDouble();
        double k = ((f - 32) / 1.8000) + 273.15;
        System.out.println(f + "°F is " + k + "°K");
    }

    /**
     * Kelvin To Celsius
     */
    @Override
    public void kelvinToCelsius() {
        System.out.println("Please Enter Kelvin Value: ");
        double k = scan.nextDouble();
        double c = k - 273.15;
        System.out.println(k + "°K is " + c + "°C");
    }

    /**
     * Kelvin to Fahrenheit
     */
    @Override
    public void kelvinToFahrenheit() {
        System.out.println("Please Enter Kelvin Value: ");
        double k = scan.nextDouble();
        double f = ((k - 273.15) * 1.8000) + 32;
        System.out.println(k + "°K is " + f + "°F");
    }
}