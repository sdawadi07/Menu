package Menuapp;

import java.util.Scanner;

public class Menu {
public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    int total = 0;

    System.out.println("       Welcome to Nepali Thali");

    System.out.println("View our menu");

    System.out.println("Nepali Thali- $15");
    System.out.println("Veg momo- $10");
    System.out.println("Chicken momo- $13");
    System.out.println("Thukpa- $10");
    System.out.println("Chowmein-$12");


    System.out.print("Enter the number of item from the menu above: ");
    int number = scanner.nextInt();
    scanner.nextLine();

    String item = null;



    for (int i = 1; i <= number; i++) {
        System.out.println("Enter the item name:" + i );
        item = scanner.nextLine().toLowerCase().trim();
    }
    switch (item) {
        case "nepali_thali":
            total += 15;
            break;

        case "veg_momo":
            total += 10;
            break;

        case "chicken_momo":
            total += 13;
            break;

        case "thukpa":
            total += 10;
            break;

        case "chowmein":
            total += 12;
            break;

        default:
            System.out.println("Invalid items");

    }
    System.out.println("Total Bill:$" + total + ".");

    System.out.println("     Thank you for visiting!");
}
}
