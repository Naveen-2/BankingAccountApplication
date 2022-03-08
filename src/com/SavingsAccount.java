package com;

import java.util.Scanner;

public class SavingsAccount {
    public static float annualInterestRate;
    private float savingsBalance;
    public final String name;

    /**
     * Constructor for class SavingsAccount to create object
     * @param savingsBalance - amount which the account need to create with.
     */
    SavingsAccount(float savingsBalance, String name){
        setSavingsBalance(savingsBalance);
        setAnnualInterestRate(savingsBalance);
        this.name = name;
    }

    /**
     * getAnnualInterestRate - method to get current annual interest rate of the account
     *
     * @return annualInterestRate
     */
    public static float getAnnualInterestRate() {
        return annualInterestRate;
    }

    /**
     * getSavingsBalance - method to read current savings balance from the account
     * @return savingsBalance
     */
    public float getSavingsBalance() {
        return savingsBalance;
    }

    /**
     * setAnnualInterestRate - method used to set annual interest rate to the account object
     * @param annualInterestRate - input interest rate
     */
    public static void setAnnualInterestRate(float annualInterestRate) {
        SavingsAccount.annualInterestRate = annualInterestRate;
    }

    /**
     * setSavingsBalance - method to update the calculated savings balance to account object
     * @param savingsBalance - balance amount that needs to be updated
     */
    public void setSavingsBalance(float savingsBalance) {
        this.savingsBalance = savingsBalance;
    }

    /**
     * calculateMonthlyInterest - method to calculate monthly interest based on
     * available savings and current interest rate of account object
     */
    public void calculateMonthlyInterest(){

        float savingsBalance = getSavingsBalance();
        float annualInterestRate = getAnnualInterestRate();

        float monthlyInterest = savingsBalance * ((annualInterestRate/100)/12);
        /*
        * savingsBalance updated with the calculated interest amount + savings balance for the month
        */
        savingsBalance = savingsBalance + monthlyInterest;

        setSavingsBalance(savingsBalance);

    }

    /**
     * modifyInterestRate - method to read interest rate from user and update it
     * for calculating interest in the month
     */
    public static void modifyInterestRate(){
        /*
        New interest rate got from user and annual interest rate is updated in class
         */
        Scanner input = new Scanner(System.in);
        System.out.print("Enter Annual interest rate for the month: ");
        float newInterestRate = input.nextFloat();

        setAnnualInterestRate(newInterestRate);

        System.out.println("Interest rate for the month is set to " + SavingsAccount.getAnnualInterestRate() + "%.");
        input.close();
    }

}
