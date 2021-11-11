package com.example.demo;

import java.util.Scanner;

public class DrinksMachine {

    public enum Types {
        COFFEE,
        TEA,
        LEMONADE,
        MOJITO,
        MINERALKA,
        COCA_COLA
    }

    public static final double PRICECOF = 3.3;
    public static final double PRICETE = 8.0;
    public static final double PRICELE = 2.55;
    public static final double PRICEMOJ = 9.9;
    public static final double PRICEMIN = 3.1;
    public static final double PRICECCOLA = 5.95;


    public static void main(String[] args) {
        System.out.println("Choose drink: ");
        System.out.println("[COFFEE, TEA, LEMONADE, MOJITO, MINERALKA, COCA_COLA]");
        Scanner sc = new Scanner(System.in);
        String temp = sc.nextLine();

        String s = temp.toUpperCase();
        Types types = Types.valueOf(s);

        switch (types) {
            case TEA:
                System.out.println("Cup of tea cost: " + PRICETE);

                System.out.println("Enter number of cups: ");
                int kol = sc.nextInt();
                double sum = kol * PRICETE;
                System.out.println("Sum: " + sum);
                System.out.println("Smth else? (Yes/No):");
                Scanner input = new Scanner(System.in);
                String userInput = "";

                userInput = input.nextLine();
                if (userInput.equalsIgnoreCase("yes")) {
                    System.out.println("Choose drink: ");
                    System.out.println("[COFFEE, TEA, LEMONADE, MOJITO, MINERALKA, COCA_COLA]");
                }
                if (userInput.equalsIgnoreCase("no")) {
                    System.out.println("Sum: " + sum);
                    break;
                }


            case COFFEE:
                System.out.println("Cup of coffee cost: " + PRICECOF);

                System.out.println("Enter number of cups: ");
                int kol1 = sc.nextInt();
                double sum1 = kol1 * PRICECOF;
                System.out.println("Sum: " + sum1);
                System.out.println("Smth else? (Yes/No):");
                Scanner input1 = new Scanner(System.in);
                String userInput1 = "";

                userInput = input1.nextLine();
                if (userInput.equalsIgnoreCase("yes")) {
                    System.out.println("Choose drink: ");
                    System.out.println("[COFFEE, TEA, LEMONADE, MOJITO, MINERALKA, COCA_COLA]");
                }
                if (userInput.equalsIgnoreCase("no")) {
                    System.out.println("Sum: " + sum1);
                    break;
                }

            case MOJITO:
                System.out.println("Mohito cost: " + PRICEMOJ);
                System.out.println("Enter number of cups: ");
                int kol2 = sc.nextInt();
                double sum2 = kol2 * PRICEMOJ;
                System.out.println("Sum: " + sum2);
                System.out.println("Smth else? (Yes/No):");
                Scanner input2 = new Scanner(System.in);
                String userInput2 = "";

                userInput = input2.nextLine();
                if (userInput.equalsIgnoreCase("yes")) {
                    System.out.println("Choose drink: ");
                    System.out.println("[COFFEE, TEA, LEMONADE, MOJITO, MINERALKA, COCA_COLA]");


                }
                if (userInput.equalsIgnoreCase("no")) {
                    System.out.println("Sum: " + sum2);
                    break;
                }

            case LEMONADE:
                System.out.println("Cup of lemonade cost: " + PRICELE);

                System.out.println("Enter number of cups: : ");
                int kol3 = sc.nextInt();
                double sum3 = kol3 * PRICELE;
                System.out.println("Sum: " + sum3);
                System.out.println("Smth else? (Yes/No):");
                Scanner input3 = new Scanner(System.in);
                String userInput3 = "";

                userInput = input3.nextLine();
                if (userInput.equalsIgnoreCase("yes")) {
                    System.out.println("Choose drink: ");
                    System.out.println("[COFFEE, TEA, LEMONADE, MOJITO, MINERALKA, COCA_COLA]");


                }
                if (userInput.equalsIgnoreCase("no")) {
                    System.out.println("Sum: " + sum3);
                    break;
                }

            case COCA_COLA:
                System.out.println("Bottle of cola cost: " + PRICECCOLA);

                System.out.println("Enter number of bottles: ");
                int kol4 = sc.nextInt();
                double sum4 = kol4 * PRICECCOLA;
                System.out.println("Sum: " + sum4);
                System.out.println("Smth else? (Yes/No):");
                Scanner input4 = new Scanner(System.in);
                String userInput4 = "";

                userInput = input4.nextLine();
                if (userInput.equalsIgnoreCase("yes")) {
                    System.out.println("Choose drink: ");
                    System.out.println("[COFFEE, TEA, LEMONADE, MOJITO, MINERALKA, COCA_COLA]");


                }
                if (userInput.equalsIgnoreCase("no")) {
                    System.out.println("Sum: " + sum4);
                    break;
                }

            case MINERALKA:
                System.out.println("Bottle of mineral water cost:  " + PRICEMIN);

                System.out.println("Enter number of bottles: ");
                int kol5 = sc.nextInt();
                double sum5 = kol5 * PRICEMIN;
                System.out.println("Sum: " + sum5);
                System.out.println("Smth else? (Yes/No):");
                Scanner input5 = new Scanner(System.in);
                String userInput5 = "";

                userInput = input5.nextLine();
                if (userInput.equalsIgnoreCase("yes")) {
                    System.out.println("Choose drink: ");
                    System.out.println("[COFFEE, TEA, LEMONADE, MOJITO, MINERALKA, COCA_COLA]");


                }
                if (userInput.equalsIgnoreCase("no")) {
                    System.out.println("Sum: " + sum5);
                    break;
                }
        }
    }
}

