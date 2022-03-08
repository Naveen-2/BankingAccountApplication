package com;

public class Main {

    public static void main(String[] args) {

        /**
         * PROCEDURE
         * 1. Create SavingsAccount Object for two users
         * 2. Modify interest rate for the month
         * 3. Calculate monthly interest rate for both users
         * 4. Repeat steps 2 & 3 for month 2
         */

        /*
        * Savings Account object created
        * */
        SavingsAccount saver1 = new SavingsAccount(2000, "saver1");
        SavingsAccount saver2 = new SavingsAccount(3000, "saver2");

        System.out.println("Savings Balance of saver 1: $" + saver1.getSavingsBalance());
        System.out.println("Savings Balance of saver 2: $" + saver2.getSavingsBalance());

        /*
         * 2. Modify Interest rate for the month
         */
        SavingsAccount.modifyInterestRate();

        /*
         * 3. Calculating monthly interest and adding to current savings balance
         */
        saver1.calculateMonthlyInterest();
        saver2.calculateMonthlyInterest();

        System.out.println("Savings balance of saver 1 after 1st month at " + SavingsAccount.getAnnualInterestRate() + "% interest: $" + saver1.getSavingsBalance());
        System.out.println("Savings balance of saver 2 after 1st month at " + SavingsAccount.getAnnualInterestRate() + "% interest: $" + saver2.getSavingsBalance());

        SavingsAccount.modifyInterestRate();

        saver1.calculateMonthlyInterest();
        saver2.calculateMonthlyInterest();

        System.out.println("Savings balance of saver 1 after 2nd month at " + SavingsAccount.getAnnualInterestRate() + "% interest: $" + saver1.getSavingsBalance());
        System.out.println("Savings balance of saver 2 after 2nd month at " + SavingsAccount.getAnnualInterestRate() + "% interest: $" + saver2.getSavingsBalance());

    }
}
