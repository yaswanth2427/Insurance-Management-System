package com.hms;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        while (true) {

            System.out.println("\n========================================");
            System.out.println("       INSURANCE MANAGEMENT SYSTEM");
            System.out.println("========================================");
            System.out.println("1. Life Insurance");
            System.out.println("2. Health Insurance");
            System.out.println("3. Vehicle Insurance");
            System.out.println("4. Home Insurance");
            System.out.println("5. Exit");
            System.out.println("========================================");

            System.out.print("Enter your choice: ");
            int choice = sc.nextInt();

            Insurance insurance = null;

            switch (choice) {


            case 1:

                System.out.println("\n--- LIFE INSURANCE ---");

                System.out.print("Policy ID: ");
                int id1 = sc.nextInt();

                sc.nextLine();

                System.out.print("Customer Name: ");
                String name1 = sc.nextLine();

                System.out.print("Phone Number: ");
                String phone1 = sc.next();

                if (!Validation.isValidPhone(phone1)) {
                    System.out.println("Invalid Phone Number!");
                    System.out.println("Phone number must contain exactly 10 digits.");
                    sc.close();
                    return;
                }

                System.out.print("Aadhar Number: ");
                String aadhar1 = sc.next();

                if (!Validation.isValidAadhar(aadhar1)) {
                    System.out.println("Invalid Aadhar Number!");
                    System.out.println("Aadhar number must contain exactly 12 digits.");
                    sc.close();
                    return;
                }

                System.out.print("PAN Card: ");
                String pan1 = sc.next().toUpperCase();

                if (!Validation.isValidPAN(pan1)) {
                    System.out.println("Invalid PAN Card!");
                    System.out.println(
                            "PAN must contain 5 letters, 4 numbers and end with a letter.");
                    sc.close();
                    return;
                }

                System.out.print("Age: ");
                int age1 = sc.nextInt();

                System.out.print("Annual Income: ");
                double income1 = sc.nextDouble();

                insurance = new LifeInsurance(
                        id1,
                        name1,
                        phone1,
                        aadhar1,
                        pan1,
                        age1,
                        income1
                );

                break;


            case 2:

                System.out.println("\n--- HEALTH INSURANCE ---");

                System.out.print("Policy ID: ");
                int id2 = sc.nextInt();

                sc.nextLine();

                System.out.print("Customer Name: ");
                String name2 = sc.nextLine();

                System.out.print("Phone Number: ");
                String phone2 = sc.next();

                if (!Validation.isValidPhone(phone2)) {
                    System.out.println("Invalid Phone Number!");
                    System.out.println("Phone number must contain exactly 10 digits.");
                    sc.close();
                    return;
                }

                System.out.print("Aadhar Number: ");
                String aadhar2 = sc.next();

                if (!Validation.isValidAadhar(aadhar2)) {
                    System.out.println("Invalid Aadhar Number!");
                    System.out.println("Aadhar number must contain exactly 12 digits.");
                    sc.close();
                    return;
                }

                System.out.print("PAN Card: ");
                String pan2 = sc.next().toUpperCase();

                if (!Validation.isValidPAN(pan2)) {
                    System.out.println("Invalid PAN Card!");
                    System.out.println(
                            "PAN must contain 5 letters, 4 numbers and end with a letter.");
                    sc.close();
                    return;
                }

                System.out.print("Age: ");
                int age2 = sc.nextInt();

                sc.nextLine();

                System.out.print("Medical History (Yes/No): ");
                String medicalHistory2 = sc.nextLine();

                insurance = new HealthInsurance(
                        id2,
                        name2,
                        phone2,
                        aadhar2,
                        pan2,
                        age2,
                        medicalHistory2
                );

                break;


            case 3:

                System.out.println("\n--- VEHICLE INSURANCE ---");

                System.out.print("Policy ID: ");
                int id3 = sc.nextInt();

                sc.nextLine();

                System.out.print("Customer Name: ");
                String name3 = sc.nextLine();

                System.out.print("Phone Number: ");
                String phone3 = sc.next();

                if (!Validation.isValidPhone(phone3)) {
                    System.out.println("Invalid Phone Number!");
                    System.out.println("Phone number must contain exactly 10 digits.");
                    sc.close();
                    return;
                }

                System.out.print("Aadhar Number: ");
                String aadhar3 = sc.next();

                if (!Validation.isValidAadhar(aadhar3)) {
                    System.out.println("Invalid Aadhar Number!");
                    System.out.println("Aadhar number must contain exactly 12 digits.");
                    sc.close();
                    return;
                }

                System.out.print("PAN Card: ");
                String pan3 = sc.next().toUpperCase();

                if (!Validation.isValidPAN(pan3)) {
                    System.out.println("Invalid PAN Card!");
                    System.out.println(
                            "PAN must contain 5 letters, 4 numbers and end with a letter.");
                    sc.close();
                    return;
                }

                System.out.print("Vehicle Type (Bike/Car/SUV): ");
                String vehicleType3 = sc.next();

                System.out.print("Vehicle Value: ");
                double vehicleValue3 = sc.nextDouble();

                System.out.print("Vehicle Age: ");
                int vehicleAge3 = sc.nextInt();

                insurance = new VehicleInsurance(
                        id3,
                        name3,
                        phone3,
                        aadhar3,
                        pan3,
                        vehicleType3,
                        vehicleValue3,
                        vehicleAge3
                );

                break;


            case 4:

                System.out.println("\n--- HOME INSURANCE ---");

                System.out.print("Policy ID: ");
                int id4 = sc.nextInt();

                sc.nextLine();

                System.out.print("Customer Name: ");
                String name4 = sc.nextLine();

                System.out.print("Phone Number: ");
                String phone4 = sc.next();

                if (!Validation.isValidPhone(phone4)) {
                    System.out.println("Invalid Phone Number!");
                    System.out.println("Phone number must contain exactly 10 digits.");
                    sc.close();
                    return;
                }

                System.out.print("Aadhar Number: ");
                String aadhar4 = sc.next();

                if (!Validation.isValidAadhar(aadhar4)) {
                    System.out.println("Invalid Aadhar Number!");
                    System.out.println("Aadhar number must contain exactly 12 digits.");
                    sc.close();
                    return;
                }

                System.out.print("PAN Card: ");
                String pan4 = sc.next().toUpperCase();

                if (!Validation.isValidPAN(pan4)) {
                    System.out.println("Invalid PAN Card!");
                    System.out.println(
                            "PAN must contain 5 letters, 4 numbers and end with a letter.");
                    sc.close();
                    return;
                }

                System.out.print("Property Type (Apartment/House/Villa): ");
                String propertyType4 = sc.next();

                System.out.print("Property Value: ");
                double propertyValue4 = sc.nextDouble();

                System.out.print("Property Age: ");
                int propertyAge4 = sc.nextInt();

                insurance = new HomeInsurance(
                        id4,
                        name4,
                        phone4,
                        aadhar4,
                        pan4,
                        propertyType4,
                        propertyValue4,
                        propertyAge4
                );

                break;


            case 5:

                System.out.println("\nThank you for using Insurance Management System!");
                System.out.println("************ Developed By YASH ************");
                sc.close();
                return;


            default:

                System.out.println("Invalid choice!");
                continue;
            }



            System.out.println("\n========================================");
            System.out.println("           POLICY DETAILS");
            System.out.println("========================================");

            insurance.displayPolicyDetails();

            System.out.println("========================================");
        }
    }
}