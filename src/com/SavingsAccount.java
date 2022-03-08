package com;

public class SavingsAccount {
    public static float annualInterestRate;
    private float savingsBalance;

    /**
     * Constructor for class SavingsAccount to create object
     * @param savingsBalance - amount which the account need to create with.
     */
    SavingsAccount(float savingsBalance){
        setSavingsBalance(savingsBalance);
        setAnnualInterestRate(savingsBalance);
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
     * modifyInterestRate - method to update new Interest rate
     */
    public static void modifyInterestRate(float newInterestRate){
        setAnnualInterestRate(newInterestRate);

    }

}
