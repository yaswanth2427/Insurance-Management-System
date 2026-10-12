package com.hms;

	public abstract class Insurance {

	    private int policyId;
	    private String customerName;
	    private String phoneNumber;
	    private String aadharNumber;
	    private String panNumber;
	    private double coverageAmount;

	    public Insurance(int policyId,
	                     String customerName,
	                     String phoneNumber,
	                     String aadharNumber,
	                     String panNumber,
	                     double coverageAmount) {

	        this.policyId = policyId;
	        this.customerName = customerName;
	        this.phoneNumber = phoneNumber;
	        this.aadharNumber = aadharNumber;
	        this.panNumber = panNumber;
	        this.coverageAmount = coverageAmount;
	    }

	    public int getPolicyId() {
	        return policyId;
	    }

	    public String getCustomerName() {
	        return customerName;
	    }

	    public String getPhoneNumber() {
	        return phoneNumber;
	    }

	    public String getAadharNumber() {
	        return aadharNumber;
	    }

	    public String getPanNumber() {
	        return panNumber;
	    }

	    public double getCoverageAmount() {
	        return coverageAmount;
	    }

	    public abstract boolean checkEligibility();

	    public abstract double calculatePremium();

	    public abstract void displayPolicyDetails();
	}

