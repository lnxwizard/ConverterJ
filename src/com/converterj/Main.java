// Package
package com.converterj;

// Import
import java.util.*;

public class Main {
    public static void main(String[] args) {

        boolean showAgainMM = true;
        while (showAgainMM) {
            Scanner scan = new Scanner(System.in);

            MainConverter mCon = new MainConverter();

            System.out.println("What do you want to convert? ");
            System.out.println("______________________________________");
            System.out.println("| 1: Temperature                     |");
            System.out.println("| 2: Length(Not Available for now.)  |");
            System.out.println("| 3: Area(Not Available for now.)    |");
            System.out.println("| 4: Volume(Not Available for now.)  |");
            System.out.println("| 5: Weight                          |");
            System.out.println("| 6: Time                            |");
            System.out.println("______________________________________");

            System.out.print("Input: ");
            int user_action = scan.nextInt();

            switch (user_action) {
                case 1:
                    System.out.println("Please select a operation:");
                    System.out.println("_____________________________");
                    System.out.println("| 1: Celsius to Fahrenheit  |");
                    System.out.println("| 2: Celsius to Kelvin      |");
                    System.out.println("| 3: Fahrenheit to Celsius  |");
                    System.out.println("| 4: Fahrenheit to Kelvin   |");
                    System.out.println("| 5: Kelvin to Celsius      |");
                    System.out.println("| 6: Kelvin to Fahrenheit   |");
                    System.out.println("_____________________________");

                    System.out.print("Input: ");
                    int temperature_action = scan.nextInt();

                    switch (temperature_action) {
                        case 1:
                            mCon.temperature.c_to_f();
                            break;
                        case 2:
                            mCon.temperature.c_to_k();
                            break;
                        case 3:
                            mCon.temperature.f_to_c();
                            break;
                        case 4:
                            mCon.temperature.f_to_k();
                            break;
                        case 5:
                            mCon.temperature.k_to_c();
                            break;
                        case 6:
                            mCon.temperature.k_to_f();
                            break;
                        default:
                            System.out.println("Please select a valid option!");
                            break;
                    }
                    break;
                case 5:
                    System.out.println("Please select a operation:");
                    System.out.println("___________________________");
                    System.out.println("| 1: Kilograms to Pounds  |");
                    System.out.println("| 2: Kilograms to Stones  |");
                    System.out.println("| 3: Pounds to Kilograms  |");
                    System.out.println("| 4: Stones to Kilograms  |");
                    System.out.println("| 5: Grams to Ounces      |");
                    System.out.println("| 6: Ounces to Gram       |");
                    System.out.println("___________________________");

                    System.out.print("Input: ");
                    int weight_action = scan.nextInt();

                    switch (weight_action) {
                        case 1:
                            mCon.weight.kg_to_lbs();
                            break;
                        case 2:
                            mCon.weight.kg_to_st();
                            break;
                        case 3:
                            mCon.weight.lbs_to_kg();
                            break;
                        case 4:
                            mCon.weight.st_to_kg();
                            break;
                        case 5:
                            mCon.weight.g_to_oz();
                            break;
                        case 6:
                            mCon.weight.oz_to_g();
                            break;
                        default:
                            System.out.println("Please select a valid option!");
                            break;
                    }
                    break;
                case 6:
                    System.out.println("Please select a operation:");
                    System.out.println("_______________________");
                    System.out.println("| 1: Seconds to Hour  |");
                    System.out.println("| 2: Seconds to Day   |");
                    System.out.println("| 3: Minutes to Day   |");
                    System.out.println("| 4: Hour to Seconds  |");
                    System.out.println("| 5: Day to Seconds   |");
                    System.out.println("| 6: Day to Minutes   |");
                    System.out.println("_______________________");

                    System.out.print("Input: ");
                    int time_action = scan.nextInt();

                    switch (time_action) {
                        case 1:
                            mCon.time.s_to_hr();
                            break;
                        case 2:
                            mCon.time.s_to_day();
                            break;
                        case 3:
                            mCon.time.min_to_day();
                            break;
                        case 4:
                            mCon.time.hr_to_s();
                            break;
                        case 5:
                            mCon.time.day_to_s();
                            break;
                        case 6:
                            mCon.time.day_to_min();
                            break;
                        default:
                            System.out.println("Please select a valid option!");
                            break;
                    }
                    break;
                default:
                    System.out.println("Please select a valid option!");
                    break;
            }
        }
    }
}