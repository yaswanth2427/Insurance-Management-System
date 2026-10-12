package com.hms;

public class HomeInsurance extends Insurance {

    private String propertyType;
    private double propertyValue;
    private int propertyAge;

    public HomeInsurance(int policyId,
                         String customerName,
                         String phoneNumber,
                         String aadharNumber,
                         String panNumber,
                         String propertyType,
                         double propertyValue,
                         int propertyAge) {

        super(policyId,
              customerName,
              phoneNumber,
              aadharNumber,
              panNumber,
              calculateCoverage(propertyType, propertyValue, propertyAge));

        this.propertyType = propertyType;
        this.propertyValue = propertyValue;
        this.propertyAge = propertyAge;
    }

    private static double calculateCoverage(String propertyType,
                                            double propertyValue,
                                            int propertyAge) {

        double coverageRate;

        if (propertyType.equalsIgnoreCase("Apartment")) {
            coverageRate = 0.80;
        }
        else if (propertyType.equalsIgnoreCase("House")) {
            coverageRate = 0.85;
        }
        else if (propertyType.equalsIgnoreCase("Villa")) {
            coverageRate = 0.90;
        }
        else {
            coverageRate = 0.75;
        }

        double coverage = propertyValue * coverageRate;

        if (propertyAge > 10) {
            coverage = coverage * 0.90;
        }

        return coverage;
    }

    @Override
    public double calculatePremium() {

        double premiumRate;

        if (propertyType.equalsIgnoreCase("Apartment")) {
            premiumRate = 0.02;
        }
        else if (propertyType.equalsIgnoreCase("House")) {
            premiumRate = 0.025;
        }
        else if (propertyType.equalsIgnoreCase("Villa")) {
            premiumRate = 0.03;
        }
        else {
            premiumRate = 0.035;
        }

        if (propertyAge > 10) {
            premiumRate += 0.01;
        }

        return getCoverageAmount() * premiumRate;
    }

    @Override
    public boolean checkEligibility() {

        if (propertyAge >= 0 &&
            propertyAge <= 50 &&
            propertyValue > 0) {

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
        System.out.println("Property Type   : " + propertyType);
        System.out.println("Property Value  : " + propertyValue);
        System.out.println("Property Age    : " + propertyAge + " years");
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