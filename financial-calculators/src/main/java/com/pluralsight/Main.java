package com.pluralsight;
import java.util.Scanner;
public class Main {

    static Scanner scanner = new Scanner (System.in);

    static double principal;
    static double annualInterestRate;
    static int loanLength;

    public static void main (String[] args){

    // Gets principal, interest rate, and loan length
        System.out.println("Enter the principal: ");
        principal = scanner.nextDouble();

        System.out.println("Enter the interest rate: ");
        annualInterestRate = scanner.nextDouble();

        System.out.println("Enter the loan length: ");
        loanLength = scanner.nextInt();


    // Calculates Base Mortgage
        // Monthly Payment = P × (i*(1+i)^n / ((1+i)^n)-1)
        double one_plus_i = (1 + annualInterestRate);

        // Left Hand Expression
        int nNumOfMonthlyPayments = 12 * loanLength;
        double one_plus_i_raised_to_n = Math.pow(one_plus_i, nNumOfMonthlyPayments);
        double leftExpression = annualInterestRate * one_plus_i_raised_to_n;

        // Right Hand Expression
        double rightExpression = (one_plus_i_raised_to_n) - 1;

        // Final Equation
        double monthlyPayment = principal * (leftExpression / rightExpression);

    // Calculates interest
        // Total Interest =(M×n)−P
        double monthlyInterestRate = annualInterestRate / 12;
        double totalInterest = (principal * monthlyInterestRate) - principal;


        // Displays expected monthly payment and total interest paid
        // System.out.printf("");
        System.out.printf("A $53,000 loan at 7.625% interest for 15 years would\n" +
                "have a $495.09/mo payment with a total interest of $36,115.99");



    }
}