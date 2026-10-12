package com.hms;

public class VehicleInsurance extends Insurance {

    private String vehicleType;
    private double vehicleValue;
    private int vehicleAge;

    public VehicleInsurance(int policyId,
                            String customerName,
                            String phoneNumber,
                            String aadharNumber,
                            String panNumber,
                            String vehicleType,
                            double vehicleValue,
                            int vehicleAge) {

        super(policyId,
              customerName,
              phoneNumber,
              aadharNumber,
              panNumber,
              calculateCoverage(vehicleType, vehicleValue, vehicleAge));

        this.vehicleType = vehicleType;
        this.vehicleValue = vehicleValue;
        this.vehicleAge = vehicleAge;
    }

    private static double calculateCoverage(String vehicleType,
                                            double vehicleValue,
                                            int vehicleAge) {

        double coverageRate;

        if (vehicleType.equalsIgnoreCase("Bike")) {
            coverageRate = 0.80;
        }
        else if (vehicleType.equalsIgnoreCase("Car")) {
            coverageRate = 0.85;
        }
        else if (vehicleType.equalsIgnoreCase("SUV")) {
            coverageRate = 0.90;
        }
        else {
            coverageRate = 0.75;
        }

        double coverage = vehicleValue * coverageRate;

        if (vehicleAge > 5) {
            coverage = coverage * 0.90;
        }

        return coverage;
    }

    @Override
    public double calculatePremium() {

        double premiumRate;

        if (vehicleType.equalsIgnoreCase("Bike")) {
            premiumRate = 0.03;
        }
        else if (vehicleType.equalsIgnoreCase("Car")) {
            premiumRate = 0.04;
        }
        else if (vehicleType.equalsIgnoreCase("SUV")) {
            premiumRate = 0.05;
        }
        else {
            premiumRate = 0.06;
        }

        // Additional premium for older vehicles
        if (vehicleAge > 5) {
            premiumRate += 0.02;
        }

        return getCoverageAmount() * premiumRate;
    }

    // Check eligibility
    @Override
    public boolean checkEligibility() {

        if (vehicleAge >= 0 &&
            vehicleAge <= 15 &&
            vehicleValue > 0) {

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
        System.out.println("Vehicle Type    : " + vehicleType);
        System.out.println("Vehicle Value   : " + vehicleValue);
        System.out.println("Vehicle Age     : " + vehicleAge + " years");
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