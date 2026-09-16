package Case_Study_2;

class BankAccount {
    int balance = 10000;

    synchronized void withdraw(int amount) {
        if (amount <= balance) {
            System.out.println(Thread.currentThread().getName() + " is withdrawing " + amount);
            balance = balance - amount;
            System.out.println("Remaining balance: " + balance);
        } else {
            System.out.println("Insufficient balance");
        }
    }
}

class Customer extends Thread {
    BankAccount account;

    Customer(BankAccount account) {
        this.account = account;
    }

    public void run() {
        account.withdraw(6000);
    }
}

public class case1 {
    public static void main(String[] args) {

        BankAccount account = new BankAccount();

        Customer c1 = new Customer(account);
        Customer c2 = new Customer(account);

        c1.setName("Customer 1");
        c2.setName("Customer 2");

        c1.start();
        c2.start();
    }
}
