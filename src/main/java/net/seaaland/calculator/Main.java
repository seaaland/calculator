package net.seaaland.calculator;

import net.seaaland.calculator.module.CalculationModule;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        CalculationModule module = new CalculationModule();

        for (int i = 0; i < 50; i++)
            System.out.println();

        System.out.println("-> Put the first number of your calculation:");
        int one = scanner.nextInt();

        System.out.println("-> Put the second number of your calculation:");
        int two = scanner.nextInt();

        System.out.println("-> Select one of the options below:");
        System.out.println(" [1] Addition;\n [2] Subtraction;\n [3] Multiplication;\n [4] Division.");

        switch (scanner.nextInt()) {
            case 1:
                System.out.println("-> The result of your operation is " + module.getAddition(one, two) + "!");
                break;

            case 2:
                System.out.println("-> The result of your operation is " + module.getSubtraction(one, two) + "!");
                break;

            case 3:
                System.out.println("-> The result of your operation is " + module.getMultiplication(one, two) + "!");
                break;

            case 4:
                System.out.println("-> The result of your operation is " + module.getDivision(one, two) + "!");
                break;
        }

        System.out.println("\n -> Thank you for using the calculator ;)");
    }
}