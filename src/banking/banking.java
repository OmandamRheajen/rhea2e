package banking;

public class banking {

    private int accNo;
    private int pin;
    private float balance;

    
    public banking(int accNo, int pin) {
        this.accNo = accNo;
        this.pin = pin;
        this.balance = 0.0f; 
    }

        public int getAccNo() {
        return accNo;
    }

        public int getPin() {
        return pin;
    }

    public float getBalance() {
        return balance;
    }

    public boolean verifyAccount(int acc, int pn) {
        return this.accNo == acc && this.pin == pn;
    }

    public void withdraw(float amount) {
        if (amount > 0 && this.balance >= amount) {
            this.balance -= amount;
            System.out.println("Withdrawal successful. New balance is: " + this.balance);
        } else {
            System.out.println("Invalid withdrawal amount or insufficient balance.");
        }
    }

    public void deposit(float amount) {
        if (amount > 0) {
            this.balance += amount;
            System.out.println("Deposit successful. New balance is: " + this.balance);
        } else {
            System.out.println("Invalid deposit amount.");
        }
    }
}