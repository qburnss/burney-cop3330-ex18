/*
 *  UCF COP3330 Summer 2021 Assignment 18 Solution
 *  Copyright 2021 Quentin_Burney
 */
import java.util.Scanner;

public class Tempconv {
    public static void main(String[] args){
        double temp, celsius=0, fahr=0;
        System.out.println("Enter C to convert from Fahrenheit to Celsius \n Enter F to convert Celsius to Fahrenheit");
        Scanner scanner1 = new Scanner(System.in);
        String answer = scanner1.next();
        answer.toLowerCase();
        System.out.println("Your choice " + answer);



        if(answer.contentEquals("c")) {
            System.out.println("Please enter the temperature in fahrenheit:");
            Scanner scanner = new Scanner(System.in);
            String newtemp = scanner.next();
            temp = Double.parseDouble(newtemp);
            celsius = (temp -32) * (5 / 9);
            System.out.println("The temperature in Celsius is " + celsius);
        }
        if(answer.contentEquals("f")){
            System.out.println("Please enter the temperature in celsius:");
            Scanner scanner = new Scanner(System.in);
            String newtemp = scanner.next();
            temp = Double.parseDouble(newtemp);
            fahr = (temp * 9 / 5) + 32;
            System.out.println("The temperature in Fahrenheit is " + fahr);
        }

    }
}
