package excersice1;

public class Transaction implements Runnable
{
    // Account object to perform transactions
    public Account acnt;

    // String variable to store the type of transaction
    public String transType;

    // Double variable to store the amount
    public double amt;

    // Constructor
    public Transaction(Account acnt, String transType, double amt) {
        this.acnt = acnt;
        this.transType = transType;
        this.amt = amt;
    }

    // The run method
    public void run() {
        if (transType.toLowerCase().equals("deposit amount")) {
            acnt.deposit(amt);
        }

        else if (transType.toLowerCase().equals("withdraw amount")) {
            acnt.withdraw(amt);
        }

        else {
            System.out.println("Invalid.");
        }
    }
}
