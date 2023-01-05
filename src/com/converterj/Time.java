// Packages
package com.converterj;

//Imports
import java.util.*;

public class Time {
    Scanner scan = new Scanner(System.in);

    // Seconds to Hour
    public void s_to_hr() {
        System.out.println("Please Enter Seconds Value: ");
        double s = scan.nextDouble();
        double hr = s * 0.00027778;
        System.out.println(s + "s is " + hr + "hr");
    }

    // Seconds to Day
    public void s_to_day() {
        System.out.println("Please Enter Seconds Value: ");
        double s = scan.nextDouble();
        double day = s * 0.000011574;
        System.out.println(s + "s is " + day + "day");
    }

    // Minutes to Day
    public void min_to_day() {
        System.out.println("Please Enter Minutes Value: ");
        double min = scan.nextDouble();
        double day = min * 0.00069444;
        System.out.println(min + "min is " + day + "day");
    }

    // Hour to Seconds
    public void hr_to_s() {
        System.out.println("Please Enter Hours Value: ");
        double hr = scan.nextDouble();
        double s = hr / 0.00027778;
        System.out.println(hr + "hr is " + s + "s");
    }

    // Day to Seconds
    public void day_to_s() {
        System.out.println("Please Enter Days Value: ");
        double day = scan.nextDouble();
        double s = day / 0.000011574;
        System.out.println(day + "day is " + s + "s");
    }

    // Day to Minutes
    public void day_to_min() {
        System.out.println("Please Enter Days Value: ");
        double day = scan.nextDouble();
        double min = day * 1440;
        System.out.println(day + "day is " + min + "min");
    }
}