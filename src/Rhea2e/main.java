package Rhea2e;

import java.util.Scanner;
import banking.banking;

public class main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        banking[] bapp = new banking[99];
        int accountCount = 0; 
        int response;

        do {
            System.out.println("\nWELCOME TO MY SYSTEM!");
            System.out.println("What do you feel like doing today?");
            System.out.println("1. Banking");
            System.out.println("2. Shopping");
            System.out.println("3. Pay Bills");
            System.out.print("Enter your choice: ");
            int choice = sc.nextInt();
            
            switch (choice) {
                case 1:
                    System.out.println("\n1. Register");
                    System.out.println("2. Login");
                    System.out.println("3. Exit");
                    System.out.print("Enter Action: ");
                    int action = sc.nextInt();

                    switch (action) {
                        case 1:
                            if (accountCount < bapp.length) {
                                System.out.print("Enter Account No.: ");
                                int newAccNo = sc.nextInt();
                                System.out.print("Enter Pin No.: ");
                                int newPin = sc.nextInt();
                                
                                bapp[accountCount] = new banking(newAccNo, newPin);
                                System.out.println("Registered Account No: " + bapp[accountCount].getAccNo());
                                accountCount++;
                            } else {
                                System.out.println("Maximum number of accounts reached.");
                            }
                            break;

                        case 2:
                            System.out.print("Enter Account No.: ");
                            int accn = sc.nextInt();
                            System.out.print("Enter Pin No.: ");
                            int pin = sc.nextInt();

                            banking loggedInAccount = null;
                            for (int i = 0; i < accountCount; i++) {
                                if (bapp[i].verifyAccount(accn, pin)) {
                                    loggedInAccount = bapp[i];
                                    break;
                                }
                            }

                            if (loggedInAccount != null) {
                                System.out.println("\nLOGIN SUCCESS!");
                                
                                int bankChoice;
                                do {
                                    System.out.println("\n*** BANKING MENU ***");
                                    System.out.println("1. Deposit");
                                    System.out.println("2. Withdraw");
                                    System.out.println("3. Check Balance");
                                    System.out.println("4. Logout");
                                    System.out.print("Enter your choice: ");
                                    bankChoice = sc.nextInt();

                                    switch (bankChoice) {
                                        case 1:
                                            System.out.print("Enter amount to deposit: ");
                                            float depositAmount = sc.nextFloat();
                                            loggedInAccount.deposit(depositAmount);
                                            break;
                                        case 2:
                                            System.out.print("Enter amount to withdraw: ");
                                            float withdrawAmount = sc.nextFloat();
                                            loggedInAccount.withdraw(withdrawAmount);
                                            break;
                                        case 3:
                                            System.out.println("Current balance: " + loggedInAccount.getBalance());
                                            break;
                                        case 4:
                                            System.out.println("Logging out...");
                                            break;
                                        default:
                                            System.out.println("Invalid choice.");
                                    }
                                } while (bankChoice != 4);
                            } else {
                                System.out.println("Invalid account number or PIN.");
                            }
                            break;

                        case 3:
                            
                            break;
                        default:
                            System.out.println("INVALID ACTION");
                    }
                    break;
                case 2:
                    System.out.println("Shopping feature not implemented.");
                    break;
                case 3:
                    System.out.println("Pay Bills feature not implemented.");
                    break;
                default:
                    System.out.println("INVALID ACTION!");
            }
            System.out.print("\nDo you want to Continue? (1/0): ");
            response = sc.nextInt();
        } while (response == 1);
    }
}