package excersice1;

import java.util.ArrayList;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Run
{
    public static void main(String[] args)
    {
        System.out.println("*****Displaying the Transactions****\n");
        //initial balance
        Account acnt = new Account(5000);
        //ArrayList to hold the Transaction objects
        ArrayList<Transaction> transactions = new ArrayList<>();
        transactions.add(new Transaction(acnt, "deposit Amount", 500));
        transactions.add(new Transaction(acnt, "withdraw Amount", 350));
        transactions.add(new Transaction(acnt, "withdraw Amount", 30000));
        transactions.add(new Transaction(acnt, "deposit Amount", 100));
        //thread with fixed number of threads
        ExecutorService executor = Executors.newFixedThreadPool(3);
        for (Transaction transaction : transactions) {
            executor.execute(transaction);
        }

        executor.shutdown();
    }
}

