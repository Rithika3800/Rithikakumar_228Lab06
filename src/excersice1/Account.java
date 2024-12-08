package excersice1;

public class Account
{
    private double balance;
    // Constructor for initial balance
    public Account(double Balance1)
    {
        balance = Balance1;
    }
    // Synchronized method to deposit an amount into the account
    public synchronized void deposit(double Amt)
    {
        //increases the balance,
        balance += Amt;
        System.out.println("Deposited Amount: $" + Amt +
                " --> Current Amount: $" + balance);
    }
    // Synchronized method to withdraw an amount into the account
    public synchronized void withdraw(double Amt)
    {
        //decreses the balance
        if (Amt <= balance)
        {
            balance -= Amt;
            System.out.println("Withdrew Amount: $" + Amt +
                    "--> Current Amount: $" + balance);
        } else {
            System.out.println("Insufficient Amount of $" + Amt);
        }
    }
    // Getter method to return the current balance
    public double getBalance()
    {
        // Return the balance value
        return balance;
    }
}

