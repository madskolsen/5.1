package com.company;
import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
        //Scanner
        Scanner scanner = new Scanner(System.in);
        System.out.println("Angiv et tal for at se om det er et positivt single digit number: ");

        //Værdi af x
        double x = scanner.nextDouble();

        if (x>0 && x<10) {
            System.out.println("Positive single digit number.");
        }

    }
}
