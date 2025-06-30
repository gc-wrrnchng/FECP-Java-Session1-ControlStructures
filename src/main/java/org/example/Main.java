package org.example;
import java.util.*;
//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Get Membership Status
        System.out.print("Enter membership status (Regular, VIP, Premium): ");
        String getMembership = scanner.nextLine();

        // Get User Age
        System.out.print("Enter age: ");
        int getAge = scanner.nextInt();

        float getPrice = 0.00f;
        // Switch Case
        switch (getMembership.toLowerCase()){
            case "regular": {
                if(getAge < 18){
                    getPrice = 50.00f;
                } else if(getAge > 64) {
                    getPrice = 75.00f;
                } else {
                    getPrice = 100.00f;
                }
                break;
            }
            case "vip": {
                if(getAge < 18){
                    getPrice = 75.00f;
                } else if(getAge > 64) {
                    getPrice = 112.50f;
                } else {
                    getPrice = 150.00f;
                }
                break;
            }
            case "premium": {
                if(getAge < 18){
                    getPrice = 100.00f;
                } else if(getAge > 64) {
                    getPrice = 150.00f;
                } else {
                    getPrice = 200.00f;
                }
                break;
            }
            default: {
                System.out.println("Invalid membership status entered.");
                break;
            }
        }
        System.out.print("Price: $");
        System.out.printf("%.2f", getPrice);
    }
}