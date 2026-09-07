package com.joysistvi.loadreg.main;

import java.util.Scanner;

public class LoadRegistration {
    static Scanner scanner = new Scanner(System.in);
    static double balance = 500.00;
    static boolean hasActivePromo = false;

    public static void main(String[] args) {
        validateUssdCode();
        mainMenu();
        scanner.close();
    }

    public static void validateUssdCode() {
        while (true) {
            System.out.print("Enter USSD Code: ");
            String code = scanner.nextLine();

            if (code.equals("*143#")) {
                System.out.println("\nUSSD Code accepted!");
                return;
            } else {
                System.out.println("\nInvalid USSD Code. Please try again.\n");
            }
        }
    }

    public static void mainMenu() {
        while (true) {
            System.out.println("\n==============================");
            System.out.println("       GLOBE PREPAID");
            System.out.println("==============================");
            System.out.println("[1] Go Promos");
            System.out.println("[2] Go+ Promos");
            System.out.println("[3] GoUNLI Promos");
            System.out.println("[4] UnliGo Promos");
            System.out.println("[5] GoBOOSTERS");
            System.out.println("[6] Check Balance");
            System.out.println("[7] Borrow Load");
            System.out.println("[0] Exit");
            System.out.println("==============================");

            System.out.print("Enter your choice: ");
            String choice = scanner.nextLine();

            switch (choice) {
                case "1":
                    goPromos();
                    break;
                case "2":
                    goPlusPromos();
                    break;
                case "3":
                    goUnliPromos();
                    break;
                case "4":
                    unliGoPromos();
                    break;
                case "5":
                    goBoosters();
                    break;
                case "6":
                    checkBalance();
                    break;
                case "7":
                    borrowLoad();
                    break;
                case "0":
                    exitFunction();
                    break;
                default:
                    System.out.println("\nInvalid choice. Please try again.");
            }
        }
    }

    public static void goPromos() {
        while (true) {
            System.out.println("\n==============================");
            System.out.println("         GO PROMOS");
            System.out.println("==============================");
            System.out.println("[1] Go59");
            System.out.println("[2] Go59 for Students");
            System.out.println("[0] Back");
            System.out.println("==============================");

            System.out.print("Enter your choice: ");
            String choice = scanner.nextLine();

            switch (choice) {
                case "1":
                    promoDetails(
                            "Go59",
                            59,
                            3,
                            "5GB All-Sites + 1GB 5G",
                            "Unli All-Net Texts"
                    );
                    break;
                case "2":
                    promoDetails(
                            "Go59 for Students",
                            59,
                            3,
                            "5GB All-Sites + 1GB 5G + 1GB GoLEARN",
                            "Unli All-Net Texts"
                    );
                    break;
                case "0":
                    return;
                default:
                    System.out.println("\nInvalid choice. Please try again.");
            }
        }
    }

    public static void goPlusPromos() {
        while (true) {
            System.out.println("\n==============================");
            System.out.println("         GO+ PROMOS");
            System.out.println("==============================");
            System.out.println("[1] Go+99");
            System.out.println("[2] Go+109");
            System.out.println("[3] Go+129");
            System.out.println("[4] Go+149");
            System.out.println("[5] Go+179");
            System.out.println("[6] Go+250");
            System.out.println("[7] Go+400");
            System.out.println("[0] Back");
            System.out.println("==============================");

            System.out.print("Enter your choice: ");
            String choice = scanner.nextLine();

            switch (choice) {
                case "1":
                    promoDetails(
                            "Go+99",
                            99,
                            7,
                            "8GB All-Sites + 4GB 5G + 8GB Choice of Apps",
                            "Unli All-Net Texts + 1 Discount Voucher"
                    );
                    break;
                case "2":
                    promoDetails(
                            "Go+109",
                            109,
                            7,
                            "10GB All-Sites + 4GB 5G + 8GB Choice of Apps",
                            "Unli All-Net Texts + 1 Discount Voucher"
                    );
                    break;
                case "3":
                    promoDetails(
                            "Go+129",
                            129,
                            7,
                            "10GB All-Sites + 8GB 5G + 8GB Choice of Apps",
                            "Unli Globe/TM Calls + Unli All-Net Texts + 1 Voucher"
                    );
                    break;
                case "4":
                    promoDetails(
                            "Go+149",
                            149,
                            7,
                            "12GB All-Sites + 8GB 5G + 8GB Choice of Apps",
                            "Unli All-Net Calls & Texts + 1 Discount Voucher"
                    );
                    break;
                case "5":
                    promoDetails(
                            "Go+179",
                            179,
                            7,
                            "8GB All-Sites + Unli 5G + 8GB Choice of Apps",
                            "Unli All-Net Texts + 1 Discount Voucher"
                    );
                    break;
                case "6":
                    promoDetails(
                            "Go+250",
                            250,
                            7,
                            "15GB All-Sites + Unli 5G + 15GB Choice of Apps",
                            "1 Discount Voucher"
                    );
                    break;
                case "7":
                    promoDetails(
                            "Go+400",
                            400,
                            7,
                            "25GB All-Sites + Unli 5G + 15GB Choice of Apps",
                            "1 Discount Voucher"
                    );
                    break;
                case "0":
                    return;
                default:
                    System.out.println("\nInvalid choice. Please try again.");
            }
        }
    }

    public static void goUnliPromos() {
        while (true) {
            System.out.println("\n==============================");
            System.out.println("        GoUNLI PROMOS");
            System.out.println("==============================");
            System.out.println("[1] GoUNLI20");
            System.out.println("[2] GoUNLI30");
            System.out.println("[3] GoUNLI50");
            System.out.println("[4] GoUNLI95");
            System.out.println("[5] GoUNLI180");
            System.out.println("[6] GoUNLI350");
            System.out.println("[0] Back");
            System.out.println("==============================");

            System.out.print("Enter your choice: ");
            String choice = scanner.nextLine();

            switch (choice) {
                case "1":
                    promoDetails(
                            "GoUNLI20",
                            20,
                            1,
                            "50MB",
                            "Unli Calls & Texts All Networks"
                    );
                    break;
                case "2":
                    promoDetails(
                            "GoUNLI30",
                            30,
                            2,
                            "100MB",
                            "Unli Calls & Texts All Networks"
                    );
                    break;
                case "3":
                    promoDetails(
                            "GoUNLI50",
                            50,
                            3,
                            "500MB",
                            "Unli Calls & Texts All Networks"
                    );
                    break;
                case "4":
                    promoDetails(
                            "GoUNLI95",
                            95,
                            7,
                            "1GB",
                            "Unli Calls & Texts All Networks"
                    );
                    break;
                case "5":
                    promoDetails(
                            "GoUNLI180",
                            180,
                            15,
                            "2GB",
                            "Unli Calls & Texts All Networks"
                    );
                    break;
                case "6":
                    promoDetails(
                            "GoUNLI350",
                            350,
                            30,
                            "3GB",
                            "Unli Calls & Texts All Networks"
                    );
                    break;
                case "0":
                    return;
                default:
                    System.out.println("\nInvalid choice. Please try again.");
            }
        }
    }

    public static void unliGoPromos() {
        while (true) {
            System.out.println("\n==============================");
            System.out.println("        UNLIGO PROMOS");
            System.out.println("==============================");
            System.out.println("[1] UnliGo99 Facebook");
            System.out.println("[2] UnliGo99 Instagram");
            System.out.println("[3] UnliGo99 TikTok");
            System.out.println("[0] Back");
            System.out.println("==============================");

            System.out.print("Enter your choice: ");
            String choice = scanner.nextLine();

            switch (choice) {
                case "1":
                    promoDetails(
                            "UnliGo99 Facebook",
                            99,
                            7,
                            "5GB All-Sites + Unli Facebook",
                            "Unli All-Net Texts"
                    );
                    break;
                case "2":
                    promoDetails(
                            "UnliGo99 Instagram",
                            99,
                            7,
                            "5GB All-Sites + Unli Instagram",
                            "Unli All-Net Texts"
                    );
                    break;
                case "3":
                    promoDetails(
                            "UnliGo99 TikTok",
                            99,
                            7,
                            "5GB All-Sites + Unli TikTok",
                            "Unli All-Net Texts"
                    );
                    break;
                case "0":
                    return;
                default:
                    System.out.println("\nInvalid choice. Please try again.");
            }
        }
    }

    public static void goBoosters() {
        if (!hasActivePromo) {
            System.out.println("\n==============================");
            System.out.println("         GOBOOSTERS");
            System.out.println("==============================");
            System.out.println("You don't have an active Go or Go+ promo.");
            System.out.println("You need an active promo to use GoBOOSTERS.");
            System.out.println("==============================");
            System.out.println("[1] Buy a Go Promo");
            System.out.println("[2] Buy a Go+ Promo");
            System.out.println("[3] Back");
            System.out.println("[0] Exit");
            System.out.println("==============================");

            System.out.print("Enter your choice: ");
            String choice = scanner.nextLine();

            switch (choice) {
                case "1":
                    goPromos();
                    return;
                case "2":
                    goPlusPromos();
                    return;
                case "3":
                    return;
                case "0":
                    exitFunction();
                    return;
                default:
                    System.out.println("\nInvalid choice. Please try again.");
                    return;
            }
        }

        while (true) {
            System.out.println("\n==============================");
            System.out.println("         GOBOOSTERS");
            System.out.println("==============================");
            System.out.println("[1] GoCALL10");
            System.out.println("[2] GoWATCH10");
            System.out.println("[3] GoPLAY10");
            System.out.println("[4] GoSHARE10");
            System.out.println("[0] Back");
            System.out.println("==============================");

            System.out.print("Enter your choice: ");
            String choice = scanner.nextLine();

            switch (choice) {
                case "1":
                    boosterDetails(
                            "GoCALL10",
                            10,
                            "Unli Calls to All Networks",
                            "1 Day"
                    );
                    break;
                case "2":
                    boosterDetails(
                            "GoWATCH10",
                            10,
                            "1GB for Video Apps",
                            "1 Day"
                    );
                    break;
                case "3":
                    boosterDetails(
                            "GoPLAY10",
                            10,
                            "1GB for Gaming Apps",
                            "1 Day"
                    );
                    break;
                case "4":
                    boosterDetails(
                            "GoSHARE10",
                            10,
                            "1GB for Social Media Apps",
                            "1 Day"
                    );
                    break;
                case "0":
                    return;
                default:
                    System.out.println("\nInvalid choice. Please try again.");
            }
        }
    }

    public static void promoDetails(
            String promoName,
            double price,
            int validity,
            String data,
            String freebies) {

        while (true) {
            System.out.println("\n==============================");
            System.out.println("        PROMO DETAILS");
            System.out.println("==============================");
            System.out.println("Promo: " + promoName);
            System.out.println("Price: ₱" + price);
            System.out.println("Validity: " + validity + " day(s)");
            System.out.println("Data: " + data);
            System.out.println("Freebies: " + freebies);
            System.out.println("==============================");
            System.out.println("[1] Register");
            System.out.println("[2] Back");
            System.out.println("[0] Exit");
            System.out.println("==============================");

            System.out.print("Enter your choice: ");
            String choice = scanner.nextLine();

            switch (choice) {
                case "1":
                    if (balance >= price) {
                        balance -= price;
                        hasActivePromo = true;

                        System.out.println("\nPromo successfully registered!");
                        System.out.println("Promo: " + promoName);
                        System.out.printf("Remaining Balance: ₱%.2f%n", balance);

                        transactionMenu();
                        return;
                    } else {
                        System.out.println("\nInsufficient balance.");
                        System.out.printf("Your balance: ₱%.2f%n", balance);
                        System.out.printf("Required: ₱%.2f%n", price);
                        return;
                    }
                case "2":
                    return;
                case "0":
                    exitFunction();
                    break;
                default:
                    System.out.println("\nInvalid choice. Please try again.");
            }
        }
    }

    public static void boosterDetails(
            String boosterName,
            double price,
            String benefit,
            String validity) {

        System.out.println("\n==============================");
        System.out.println("       BOOSTER DETAILS");
        System.out.println("==============================");
        System.out.println("Booster: " + boosterName);
        System.out.println("Price: ₱" + price);
        System.out.println("Benefit: " + benefit);
        System.out.println("Validity: " + validity);
        System.out.println("==============================");
        System.out.println("[1] Register");
        System.out.println("[2] Back");
        System.out.println("[0] Exit");
        System.out.println("==============================");

        while (true) {
            System.out.print("Enter your choice: ");
            String choice = scanner.nextLine();

            switch (choice) {
                case "1":
                    if (balance >= price) {
                        balance -= price;

                        System.out.println("\nGoBOOSTER successfully registered!");
                        System.out.println("Booster: " + boosterName);
                        System.out.printf("Remaining Balance: ₱%.2f%n", balance);

                        transactionMenu();
                        return;
                    } else {
                        System.out.println("\nInsufficient balance.");
                        System.out.printf("Your balance: ₱%.2f%n", balance);
                        System.out.printf("Required: ₱%.2f%n", price);
                        return;
                    }
                case "2":
                    return;
                case "0":
                    exitFunction();
                    break;
                default:
                    System.out.println("\nInvalid choice. Please try again.");
            }
        }
    }

    public static void checkBalance() {
        System.out.println("\n==============================");
        System.out.println("        CHECK BALANCE");
        System.out.println("==============================");
        System.out.printf("Current Balance: ₱%.2f%n", balance);
        System.out.println("==============================");
    }

    public static void borrowLoad() {
        while (true) {
            System.out.println("\n==============================");
            System.out.println("         BORROW LOAD");
            System.out.println("==============================");
            System.out.println("[1] Borrow ₱10");
            System.out.println("[2] Borrow ₱20");
            System.out.println("[0] Back");
            System.out.println("==============================");

            System.out.print("Enter your choice: ");
            String choice = scanner.nextLine();

            switch (choice) {
                case "1":
                    balance += 10;
                    System.out.println("\nYou borrowed ₱10 load.");
                    System.out.printf("Current Balance: ₱%.2f%n", balance);
                    transactionMenu();
                    return;
                case "2":
                    balance += 20;
                    System.out.println("\nYou borrowed ₱20 load.");
                    System.out.printf("Current Balance: ₱%.2f%n", balance);
                    transactionMenu();
                    return;
                case "0":
                    return;
                default:
                    System.out.println("\nInvalid choice. Please try again.");
            }
        }
    }

    public static void transactionMenu() {
        while (true) {
            System.out.println("\n==============================");
            System.out.println("      TRANSACTION COMPLETE");
            System.out.println("==============================");
            System.out.println("[1] Main Menu");
            System.out.println("[0] Exit");
            System.out.println("==============================");

            System.out.print("Enter your choice: ");
            String choice = scanner.nextLine();

            switch (choice) {
                case "1":
                    mainMenu();
                case "0":
                    exitFunction();
                    break;
                default:
                    System.out.println("\nInvalid choice. Please try again.");
            }
        }
    }

    public static void exitFunction() {
        while (true) {
            System.out.print("\nAre you sure you want to exit? [Y/N]: ");
            String confirmation = scanner.nextLine();

            if (confirmation.equalsIgnoreCase("Y")) {
                System.out.println("\nThank you for using Globe Prepaid!");
                System.exit(0);
            } else if (confirmation.equalsIgnoreCase("N")) {
                System.out.println("\nReturning to Main Menu...");
                return;
            } else {
                System.out.println("Invalid input. Please enter Y or N.");
            }
        }
    }
}