
package omandam11;

import java.util.Scanner;


public class Omandam11 {

   
    public static void main(String[] args) {
       
        Scanner sx = new Scanner(System.in);
                
           System.out.println("Enter name: ");
           String name = sx.nextLine();
           
           System.out.println("Enter Birth Year: ");
           int by = sx.nextInt();
           
            int age = 2025 - by;
            
        System.out.println("\nHello "+name+" Your age is "+age);
            
           
    }
    
}
