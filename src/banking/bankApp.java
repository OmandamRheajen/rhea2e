package banking;

import java.util.Scanner;

public class bankApp {
    
    private int accountNo;
    private float initialBalance;
    private int pin;

    public void setAccountNo(int accountNo) {
        this.accountNo = accountNo;
    }

    public int getAccountNo() {
        return accountNo;
    }

    public void setPin(int pin) {
        this.pin = pin;
    }

    public int getPin() {
        return pin;
    }
    
   
    
    
    
    
    
    
    
    public boolean verifyAccount(int acc, int pn){
        
            if(acc == accountNo && pn == pin){
                return true;
            }else{
                return false;
            }
    }
    
    public int setAccount(){
        return accountNo;
    }
    
    public void viewBalance(){
    
    
    }
    
    
    
}