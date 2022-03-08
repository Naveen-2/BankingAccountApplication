package com;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
         /*
          PROCEDURE
          1. Create SavingsAccount Object for two users
          2. Modify interest rate for the month
          3. Calculate monthly interest rate for both users
          4. Repeat steps 2 & 3 for month 2
         */

        /*
         * Savings Account object created
         * */
        Scanner input = new Scanner(System.in);
        float annualInterestRate;

        SavingsAccount saver1 = new SavingsAccount(2000);
        SavingsAccount saver2 = new SavingsAccount(3000);

        System.out.println("Savings Balance of saver 1: $" + saver1.getSavingsBalance());
        System.out.println("Savings Balance of saver 2: $" + saver2.getSavingsBalance());

        /*
        Getting new Annual interest rate
         */
        System.out.print("Enter Annual interest rate for 1st month: ");
        annualInterestRate = input.nextFloat();
        /*
        Modifying interest rate in the Savings account class
         */
        SavingsAccount.modifyInterestRate(annualInterestRate);
        System.out.println("First Month Interest rate set to " + SavingsAccount.getAnnualInterestRate() + "%.");
        /*
        Calculating Monthly interest amount for the savers and adding it to savingsBalance
         */
        saver1.calculateMonthlyInterest();
        saver2.calculateMonthlyInterest();

        System.out.println("Savings balance of saver 1 after 1st month at " + SavingsAccount.getAnnualInterestRate() + "% interest: $" + saver1.getSavingsBalance());
        System.out.println("Savings balance of saver 2 after 1st month at " + SavingsAccount.getAnnualInterestRate() + "% interest: $" + saver2.getSavingsBalance());

        /*
        * Repeating same process 2 & 3 for the 2nd month
        * */
        System.out.print("Enter Annual interest rate for 2nd month: ");
        annualInterestRate = input.nextFloat();
        SavingsAccount.modifyInterestRate(annualInterestRate);
        System.out.println("Second Month Interest rate set to " + SavingsAccount.getAnnualInterestRate() + "%.");

        saver1.calculateMonthlyInterest();
        saver2.calculateMonthlyInterest();

        System.out.println("Savings balance of saver 1 after 2nd month at " + SavingsAccount.getAnnualInterestRate() + "% interest: $" + saver1.getSavingsBalance());
        System.out.println("Savings balance of saver 2 after 2nd month at " + SavingsAccount.getAnnualInterestRate() + "% interest: $" + saver2.getSavingsBalance());

    }
}
