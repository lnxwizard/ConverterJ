// Package
package com.converterj;

// Imports
import java.util.*;

public class Temperature {
    Scanner scan = new Scanner(System.in);

    // Celsius to Fahrenheit
    public void c_to_f() {
        System.out.println("Please Enter Celsius Value: ");
        double c = scan.nextDouble();
        double f = (c * 1.8000) + 32;
        System.out.println(c + "°C is " + f + "°F");
    }

    // Celsius to Kelvin
    public void  c_to_k() {
        System.out.println("Please Enter Celsius Value: ");
        double c = scan.nextDouble();
        double k = c + 273.15;
        System.out.println(c + "°C is " + k + "°K");
    }

    // Fahrenheit to Celsius
    public void f_to_c() {
        System.out.println("Please Enter Fahrenheit Value: ");
        double f = scan.nextDouble();
        double c = (f - 32) / 1.8000;
        System.out.println(f + "°F is " + c + "°C");
    }

    // Fahrenheit to Kelvin
    public void f_to_k() {
        System.out.println("Please Enter Fahrenheit Value: ");
        double f = scan.nextDouble();
        double k = ((f - 32) / 1.8000) + 273.15;
        System.out.println(f + "°F is " + k + "°K");
    }

    // Kelvin to Celsius
    public void  k_to_c() {
        System.out.println("Please Enter Kelvin Value: ");
        double k = scan.nextDouble();
        double c = k - 273.15;
        System.out.println(k + "°K is " + c + "°C");
    }

    // Kelvin to Fahrenheit
    public void k_to_f() {
        System.out.println("Please Enter Kelvin Value: ");
        double k = scan.nextDouble();
        double f = ((k - 273.15) * 1.8000) + 32;
        System.out.println(k + "°K is " + f + "°F");
    }
}