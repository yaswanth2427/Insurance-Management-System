package com.hms;

public class HealthInsurance extends Insurance {

    private int age;
    private String medicalHistory;

    public HealthInsurance(int policyId,
                           String customerName,
                           String phoneNumber,
                           String aadharNumber,
                           String panNumber,
                           int age,
                           String medicalHistory) {

        super(policyId,
              customerName,
              phoneNumber,
              aadharNumber,
              panNumber,
              calculateCoverage(age, medicalHistory));

        this.age = age;
        this.medicalHistory = medicalHistory;
    }

    private static double calculateCoverage(int age, String medicalHistory) {

        double coverage;

        if (age <= 30) {
            coverage = 1000000;
        }
        else if (age <= 45) {
            coverage = 800000;
        }
        else if (age <= 60) {
            coverage = 600000;
        }
        else {
            coverage = 400000;
        }

        if (medicalHistory.equalsIgnoreCase("Yes")) {
            coverage = coverage * 0.80;
        }

        return coverage;
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
        else if (age <= 60) {
            premiumRate = 0.05;
        }
        else {
            premiumRate = 0.08;
        }

        if (medicalHistory.equalsIgnoreCase("Yes")) {
            premiumRate += 0.02;
        }

        return getCoverageAmount() * premiumRate;
    }

    @Override
    public boolean checkEligibility() {

        if (age >= 18 && age <= 70) {
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
        System.out.println("Medical History : " + medicalHistory);
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