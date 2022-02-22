/*
Quintin Amon
Exercise 6
2/22/22
 */

package com.company;

import java.util.Scanner;

import static java.lang.Double.parseDouble;
import static java.lang.Integer.parseInt;

public class Main {
    public static void main(String[] args) {
        printInt();
        printDouble();
        printString();
    }
    static void printInt(){
        Scanner usrInt = new Scanner(System.in);
        System.out.println("Please enter an Integer");
        String integerString = usrInt.nextLine();
        boolean isInt = false;
        while(!isInt){
            try{
                parseInt(integerString);
                isInt = true;
            }catch(Exception e){
                System.out.println("Not a valid input, please enter an Integer");
                integerString = usrInt.nextLine();
            }
        }
    }
    static void printDouble(){
        Scanner usrDouble = new Scanner(System.in);
        System.out.println("Please enter a Double");
        String doubleString = usrDouble.nextLine();
        boolean isDouble = false;
        while(!isDouble){
            try{
                parseDouble(doubleString);
                isDouble = true;
            }catch(Exception e){
                System.out.println("Not a valid input, please enter a Double");
                doubleString = usrDouble.nextLine();
            }
        }
    }
    static void printString(){
        Scanner usrString = new Scanner(System.in);
        System.out.println("Please enter a String");
        String string = usrString.nextLine();
        boolean isString = false;
        while(!isString){
            try{
                Double.parseDouble(string);
                System.out.println("Please enter a string");
                string = usrString.nextLine();
            }
            catch(Exception e){
                System.out.println(string);
                isString = true;
            }
        }
    }
}
