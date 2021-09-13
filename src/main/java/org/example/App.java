/*
 *  UCF COP3330 Fall 2021 Assignment 1 Solution
 *  Copyright 2021 Cameron McDougal
 */

package org.example;
import java.util.Scanner;

public class App
{
    public static void main( String[] args )
    {
        int people;
        int pizzas;
        int slices;
        Scanner scanner = new Scanner(System.in);

        System.out.println("How many people?");
        people = scanner.nextInt();

        System.out.println("How many pizzas do you have?");
        pizzas = scanner.nextInt();

        System.out.println("How many slices per pizza?");
        slices = scanner.nextInt();

        scanner.close();

        System.out.printf("Each person gets %d pieces of pizza.\nThere are %d leftover pieces.", (slices * pizzas) / people, (slices * pizzas) % people);
    }
}
