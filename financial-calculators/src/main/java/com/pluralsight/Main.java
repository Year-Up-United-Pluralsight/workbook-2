package com.pluralsight;
import java.util.Scanner;
public class Main {

    static Scanner scanner = new Scanner (System.in);

    static double principal;
    static double annualInterestRate;
    static int loanLength;

    public static void main (String[] args){

    // Gets principal, interest rate, and loan length
        System.out.print("Enter the principal: ");
        principal = scanner.nextDouble();

        System.out.print("Enter the interest rate: ");
        annualInterestRate = scanner.nextDouble();

        System.out.print("Enter the loan length: ");
        loanLength = scanner.nextInt();


    // Calculates Base Mortgage
        // M (Monthly Payment) = P × (i*(1+i)^n / ((1+i)^n)-1)
        // P = Principal

        // i (Monthly interest rate) = Annual interest rate / 12
        double monthlyInterestRate = annualInterestRate / 12;

        // n (Number of monthly payments) = Loan length * 12
        int numOfMonthlyPayments = loanLength * 12;

        // Shared Expression (i*(1+i)^n)
        double one_plus_i = (1 + monthlyInterestRate);                             // (1+i)
        double shared_expression = Math.pow(one_plus_i, numOfMonthlyPayments);     // (1+i)^n

        // Left and Right Expressions
        double leftExpression = monthlyInterestRate * shared_expression;          // i*(1+i)^n
        double rightExpression = shared_expression - 1;                           // ((1+i)^n)-1

        // Final Equation
        double monthlyPayment = principal * (leftExpression / rightExpression);

    // Calculates interest
        // Total Interest = (M×n)−P
        double totalInterest = (monthlyPayment * numOfMonthlyPayments) - principal;


    // Displays expected monthly payment and total interest paid
        // System.out.printf("");
        System.out.printf("A $%.2f loan at %.3f%% interest for %d years would have a $%.2f/mo payment with a total interest of $%.2f",
                principal, annualInterestRate, loanLength, monthlyPayment, totalInterest);

    }
}