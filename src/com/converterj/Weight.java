// Package
package com.converterj;

// Import
import java.util.*;

public class Weight {
    Scanner scan = new Scanner(System.in);

    // Kilograms to Pounds
    public void kg_to_lbs() {
        System.out.println("Please Enter Kilograms Value: ");
        double kg = scan.nextDouble();
        double lbs = kg * 2.2046;
        System.out.println(kg + "kg is " + lbs + "lbs");
    }

    // Kilograms to Stones
    public void kg_to_st() {
        System.out.println("Please Enter Kilograms Value: ");
        double kg = scan.nextDouble();
        double st = kg * 0.15747;
        System.out.println(kg + "kg is " + st + "st");
    }

    // Pounds to Kilograms
    public void lbs_to_kg() {
        System.out.println("Please Enter Pounds Value: ");
        double lbs = scan.nextDouble();
        double kg = lbs / 2.2046;
        System.out.println(lbs + "lbs is " + kg + "kg");
    }

    // Stones to Kilograms
    public void st_to_kg() {
        System.out.println("Please Enter Stones Value: ");
        double st = scan.nextDouble();
        double kg = st / 0.15747;
        System.out.println(st + "st is " + kg + "kg");
    }

    // Grams to Ounces
    public void g_to_oz() {
        System.out.println("Please Enter Grams Value: ");
        double g = scan.nextDouble();
        double oz = g * 0.035274;
        System.out.println(g + "g is " + oz + "oz");
    }

    // Ounces to Grams
    public void oz_to_g() {
        System.out.println("Please Enter Grams Value: ");
        double oz = scan.nextDouble();
        double g = oz / 0.035274;
        System.out.println(oz + "oz is " + g + "g");
    }
}