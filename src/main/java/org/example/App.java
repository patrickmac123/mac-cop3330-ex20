package org.example;
import java.util.Scanner;
import java.math.*;
import java.text.NumberFormat;

/*
 *  UCF COP3330 Fall 2021 Assignment 1 Exercise 20 Solution
 *  Copyright 2021 Patrick Mac
 */

public class App
{
    private static final double wiTax = 0.05;
    private static final double illTax = 0.08;
    private static final double eauTax = 0.005;
    private static final double dunnTax = 0.004;

    static void wisconsin(double order)
    {
        double tax;
        double total;
        double countyTax;
        double totalTax;
        Scanner scan = new Scanner(System.in);
        System.out.print("What county do you live in? ");
        String stringCounty = scan.nextLine();

        if(stringCounty.equals("Eau Claire"))
        {
            tax = order * wiTax;
            countyTax = order * eauTax;
            totalTax = tax + countyTax;
            total = order + tax + countyTax;
            BigDecimal formattedTax = new BigDecimal(totalTax).setScale(2, RoundingMode.HALF_UP);
            BigDecimal formattedTotal = new BigDecimal(total).setScale(2, RoundingMode.HALF_UP);
            NumberFormat defaultFormat = NumberFormat.getCurrencyInstance();

            System.out.println("The tax is "+defaultFormat.format(formattedTax)+".\n"+"The total is "+defaultFormat.format(formattedTotal)+".");
            return;
        }
        else if(stringCounty.equals("Dunn"))
        {
            tax = order * wiTax;
            countyTax = order * dunnTax;
            totalTax = tax + countyTax;
            total = order + tax + countyTax;
            BigDecimal formattedTax = new BigDecimal(totalTax).setScale(2, RoundingMode.HALF_UP);
            BigDecimal formattedTotal = new BigDecimal(total).setScale(2, RoundingMode.HALF_UP);
            NumberFormat defaultFormat = NumberFormat.getCurrencyInstance();

            System.out.println("The tax is "+defaultFormat.format(formattedTax)+".\n"+"The total is "+defaultFormat.format(formattedTotal)+".");
            return;
        }
        else
        {
            tax = order * wiTax;
            total = order + tax;
            BigDecimal formattedTax = new BigDecimal(tax).setScale(2, RoundingMode.HALF_UP);
            BigDecimal formattedTotal = new BigDecimal(total).setScale(2, RoundingMode.HALF_UP);
            NumberFormat defaultFormat = NumberFormat.getCurrencyInstance();

            System.out.println("The tax is "+defaultFormat.format(formattedTax)+".\n"+"The total is "+defaultFormat.format(formattedTotal)+".");
            return;
        }
    }
    static void illinois(double order)
    {
        double tax;
        double total;

        tax = order * illTax;
        total = order + tax;
        BigDecimal formattedTax = new BigDecimal(tax).setScale(2, RoundingMode.HALF_UP);
        BigDecimal formattedTotal = new BigDecimal(total).setScale(2, RoundingMode.HALF_UP);
        NumberFormat defaultFormat = NumberFormat.getCurrencyInstance();

        System.out.println("The tax is "+defaultFormat.format(formattedTax)+".\n"+"The total is "+defaultFormat.format(formattedTotal)+".");
        return;

    }
    static void other(double order)
    {
        BigDecimal formattedTotal = new BigDecimal(order).setScale(2, RoundingMode.HALF_UP);
        NumberFormat defaultFormat = NumberFormat.getCurrencyInstance();

        System.out.println("The total is "+defaultFormat.format(formattedTotal)+".");
        return;
    }

    public static void main( String[] args )
    {
        Scanner scan = new Scanner(System.in);
        System.out.print( "What is the order amount? ");
        String stringOrder = scan.nextLine();
        System.out.print( "What state do you live in? ");
        String stringState = scan.nextLine();

        double order = Double.parseDouble(stringOrder);

        if(stringState.equals("Wisconsin"))
        {
            wisconsin(order);
        }
        else if(stringState.equals("Illinois"))
        {
            illinois(order);
        }
        else
        {
            other(order);
        }
    }
}