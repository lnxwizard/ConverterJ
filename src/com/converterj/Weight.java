// Package
package com.converterj;

// Import
import java.util.*;

public class Weight {
    Scanner scan = new Scanner(System.in);

    // Kilograms to Pounds
    public void kgToLbs() {
        System.out.println("Please Enter Kilograms Value: ");
        double kg = scan.nextDouble();
        double lbs = kg * 2.2046;
        System.out.println(kg + "kg is " + lbs + "lbs");
    }

    // Kilograms to Stones
    public void kgToSt() {
        System.out.println("Please Enter Kilograms Value: ");
        double kg = scan.nextDouble();
        double st = kg * 0.15747;
        System.out.println(kg + "kg is " + st + "st");
    }

    // Pounds to Kilograms
    public void lbsToKg() {
        System.out.println("Please Enter Pounds Value: ");
        double lbs = scan.nextDouble();
        double kg = lbs / 2.2046;
        System.out.println(lbs + "lbs is " + kg + "kg");
    }

    // Stones to Kilograms
    public void stToKg() {
        System.out.println("Please Enter Stones Value: ");
        double st = scan.nextDouble();
        double kg = st / 0.15747;
        System.out.println(st + "st is " + kg + "kg");
    }

    // Grams to Ounces
    public void gToOz() {
        System.out.println("Please Enter Grams Value: ");
        double g = scan.nextDouble();
        double oz = g * 0.035274;
        System.out.println(g + "g is " + oz + "oz");
    }

    // Ounces to Grams
    public void ozToG() {
        System.out.println("Please Enter Grams Value: ");
        double oz = scan.nextDouble();
        double g = oz / 0.035274;
        System.out.println(oz + "oz is " + g + "g");
    }
}