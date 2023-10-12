package com.pluralsight;

import java.text.NumberFormat;
import java.util.Scanner;
import java.lang.Math;

public class MortgageCalculator {
    public static void main(String[] args) {
        final byte months_in_year = 12;
        final byte percent = 100;
        final double monthly_payment = 495.09;
                
                
        
        Scanner scanner = new Scanner(System.in);

        System.out.print("Principal amount : ");
        int principal = scanner.nextInt();

        System.out.print("Annual interest rate : ");
        float annualinterest = scanner.nextFloat();
        float monthlyinterest = annualinterest/percent/months_in_year;

        System.out.print("Period (Years) : ");
        byte years = scanner.nextByte();

        int numberOfPayments = years * months_in_year;
        
        float monthlyInterest;
        
        double totalInterest = (monthly_payment * months_in_year) - principal;

        numberOfPayments = years * months_in_year;

        double mortgage = principal * (monthlyinterest * Math.pow(1 + monthlyinterest, numberOfPayments)) / Math.pow( 1 + monthlyinterest , numberOfPayments )- 1;

        String mortgageFormatted = NumberFormat.getCurrencyInstance().format(mortgage);

        System.out.println("MORTGAGE : " + mortgageFormatted);

    }
//Interest = (principal * rate) / time
    public static void calculatorFutureValue(Scanner scanner) {
        final byte months_in_year = 12;
        final byte percent = 100;


        System.out.println("Initial deposit: ");
        double initialDeposit = scanner.nextDouble();

        System.out.println("Annual interest rate");
        float annualinterest = scanner.nextFloat();
        float monthlyinterest = annualinterest/percent/months_in_year;

        System.out.print("Period (Years) : ");
        byte years = scanner.nextByte();
        
        double mortgage = initialDeposit * (1 + annualinterest) * months_in_year;

        double futureValue;

        double principle = 1.75;
        double interestEarned =  (principle * annualinterest) / months_in_year;

        String mortgageFormatted = NumberFormat.getCurrencyInstance().format(mortgage);

        System.out.println("MORTGAGE : " + mortgageFormatted);


    }

}