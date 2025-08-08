
package omandam11;

import java.util.Scanner;
import banking.bankingClass;

public class banking {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("HELLO WELCOME TO THE SYSTEM!");
        System.out.println("What do you feel doing today? ");
        System.out.println("1. Banking");
        System.out.println("2. Doctors Appointment");
        System.out.println("3. Shopping");
        
        bankingClass bApp[] = new bankingClass[10];
        
        System.out.print("Enter choice: ");
        int choice = sc.nextInt();
        int resp;
        switch(choice){
            case 1:
              do{
                System.out.println("1. Register Account");
                System.out.println("2. Login Account");
                System.out.println("3. View All Accounts");
                System.out.println("Enter Selection: ");
                int action = sc.nextInt();
                
                switch(action){
                    case 1:
                        bApp[0] = new bankingClass();
                        System.out.print("Enter Account No.: ");
                        bApp[0].setAccountNo(sc.nextInt());
                        System.out.print("Enter Account Pin: ");
                        bApp[0].seimport java.util.Scanner;
import banking.bankingClass;

public class banking {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("HELLO WELCOME TO THE SYSTEM!");
        System.out.println("What do you feel doing today? ");
        System.out.println("1. Banking");
        System.out.println("2. Doctors Appointment");
        System.out.println("3. Shopping");
        
        bankingClass bApp[] = new bankingClass[10];
        
        System.out.print("Enter choice: ");
        int choice = sc.nextInt();
        int resp;
        switch(choice){
            case 1:
              do{
                System.out.println("1. Register Account");
                System.out.println("2. Login Account");
                System.out.println("3. View All Accounts");
                System.out.println("Enter Selection: ");
                int action = sc.nextInt();
                
                switch(action){
                    case 1:
                        bApp[0] = new bankingClass();
                        SystemtPin(sc.nextInt());
                        break;
                    case 2:
                        int attempts = 3;
                        bankingClass bc = new bankingClass();

                        System.out.print("Enter your Account No: ");
                        int accountNo = sc.nextInt();

                        System.out.print("Enter your Pin: ");
                        int pin = sc.nextInt();

                        while(!(bc.verifyAccount(accountNo, pin))){
                            if(attempts == 1){
                                System.out.println("ATTEMPT LIMIT REACHED!");
                                System.exit(0);
                            }

                            attempts--;
                            System.out.println("Attempt Left: "+attempts);

                            System.out.println("INVALID ACCOUNT!");
                            System.out.print("Enter your Account No: ");
                            accountNo = sc.nextInt();
                            System.out.print("Enter your Pin: ");
                            pin = sc.nextInt();

                        }
                        
               
                    break;
                    case 3:
                        break;
                
                }
                  System.out.print("Do you want to continue? (1/0):");
                  resp = sc.nextInt();
              }while(resp == 1);
                
                break;
            case 2:
                
                break;
            case 3:
                
                break;
            default:
                System.out.println("Invalid Selection!");
        
        }
            
    }
    
}