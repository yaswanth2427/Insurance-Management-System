package com.hms;

public class LifeInsurance extends Insurance {

    private int age;
    private double annualIncome;

    public LifeInsurance(int policyId,
                         String customerName,
                         String phoneNumber,
                         String aadharNumber,
                         String panNumber,
                         int age,
                         double annualIncome) {

        super(policyId,
              customerName,
              phoneNumber,
              aadharNumber,
              panNumber,
              calculateCoverage(age, annualIncome));

        this.age = age;
        this.annualIncome = annualIncome;
    }

    private static double calculateCoverage(int age, double annualIncome) {

        double coverage;

        if (age <= 30) {
            coverage = annualIncome * 15;
        }
        else if (age <= 45) {
            coverage = annualIncome * 10;
        }
        else if (age <= 55) {
            coverage = annualIncome * 7;
        }
        else {
            coverage = annualIncome * 5;
        }

        return Math.min(coverage, 6000000);
    }

    @Override
    public double calculatePremium() {

        double premiumRate;

        if (age <= 30) {
            premiumRate = 0.02;
        }
        else if (age <= 45) {
            premiumRate = 0.03;
        }
        else if (age <= 55) {
            premiumRate = 0.05;
        }
        else {
            premiumRate = 0.08;
        }

        return getCoverageAmount() * premiumRate;
    }

    @Override
    public boolean checkEligibility() {

        if (age >= 18 &&
            age <= 65 &&
            annualIncome >= 200000) {

            return true;
        }

        return false;
    }

    @Override
    public void displayPolicyDetails() {

        System.out.println("Policy ID       : " + getPolicyId());
        System.out.println("Customer Name   : " + getCustomerName());
        System.out.println("Phone Number    : " + getPhoneNumber());
        System.out.println("Aadhar Number   : " + getAadharNumber());
        System.out.println("PAN Card        : " + getPanNumber());
        System.out.println("Age             : " + age);
        System.out.println("Annual Income   : " + annualIncome);
        System.out.println("Coverage Amount : " + getCoverageAmount());

        System.out.printf("Premium         : %.2f%n",
                calculatePremium());

        if (checkEligibility()) {
            System.out.println("Status          : APPROVED");
        }
        else {
            System.out.println("Status          : REJECTED");
        }
    }
}