// Package
package com.converterj;

// Import
import java.util.*;
import java.lang.*;

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
                            //Now that application only knows that our mainConverter does the work, it and the developers
                            //do not need to know that they are using the main converters temperature class.
                            mCon.celsiusToFahrenheit();
                            break;
                        case 2:
                            mCon.celsiusToKelvin();
                            break;
                        case 3:
                            mCon.fahrenheitToCelsius();
                            break;
                        case 4:
                            mCon.fahrenheitToKelvin();
                            break;
                        case 5:
                            mCon.kelvinToCelsius();
                            break;
                        case 6:
                            mCon.kelvinToFahrenheit();
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
                            mCon.weight.kgToLbs();
                            break;
                        case 2:
                            mCon.weight.kgToSt();
                            break;
                        case 3:
                            mCon.weight.lbsToKg();
                            break;
                        case 4:
                            mCon.weight.stToKg();
                            break;
                        case 5:
                            mCon.weight.gToOz();
                            break;
                        case 6:
                            mCon.weight.ozToG();
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
                            mCon.time.sToHr();
                            break;
                        case 2:
                            mCon.time.sToDay();
                            break;
                        case 3:
                            mCon.time.minToDay();
                            break;
                        case 4:
                            mCon.time.hrToS();
                            break;
                        case 5:
                            mCon.time.dayToS();
                            break;
                        case 6:
                            mCon.time.dayToMin();
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

            // Last Choice
            System.out.println("Are You Want to Continue? (y/n)");
            char choice = scan.next().charAt(0);

            boolean showAgainLC = true;
            while (showAgainLC) {
                switch (choice) {
                    case 'y':
                        showAgainLC = false;
                        break;
                    case 'n':
                        showAgainMM = false;
                        showAgainLC = false;
                        break;
                    default:
                        System.out.println("Please Select a Valid Option...");
                        showAgainLC = false;
                        break;
                }
            }
        }
    }
}