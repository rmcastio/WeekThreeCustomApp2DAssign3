package edu.whccd.rcastillo;

import java.util.Scanner;

public class Main
{

    public static void main(String[] args)
    {
    Scanner scanner = new Scanner(System.in);
    System.out.print("last Name: ");
    String lastName = scanner.nextLine();
    System.out.print("first Name: ");
    String firstName = scanner.nextLine();
    System.out.println("Hello " + lastName + "," + " " + firstName);

    System.out.println("******************");

    System.out.print("Enter first Integer: ");
    int firstInt = scanner.nextInt();
    System.out.print("Enter second Integer: ");
    int secondInt = scanner.nextInt();

    int add = firstInt + secondInt;
    int sub = firstInt - secondInt;
    int mult = firstInt + secondInt;
    int div = firstInt / secondInt;
    int modu = firstInt % secondInt;

    System.out.println("Addition: " + add);
    System.out.println("Subtraction: " + sub);
    System.out.println("Multiplication: " + mult);
    System.out.println("Division: " + div);
    System.out.println("Modulus: " + modu);


    }
}
