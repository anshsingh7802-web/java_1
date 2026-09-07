import java.util.Scanner;

class Case7 {
    int balance = 10000;
    int pin = 1234;

    void atm() {
        Scanner sc = new Scanner(System.in);

        int attempts = 0;
        boolean correct = false;

        while (attempts < 3) {
            System.out.print("Enter PIN: ");
            int p = sc.nextInt();

            if (p == pin) {
                correct = true;
                break;
            } else {
                attempts++;
                System.out.println("Wrong PIN");
            }
        }

        if (!correct) {
            System.out.println("3 wrong attempts. Account blocked.");
            return;
        }

        System.out.println("1. Withdraw");
        System.out.println("2. Deposit");
        System.out.println("3. Balance");

        System.out.print("Enter choice: ");
        int choice = sc.nextInt();

        if (choice == 1) {
            System.out.print("Enter amount: ");
            int amount = sc.nextInt();

            if (amount <= balance) {
                balance = balance - amount;
                System.out.println("Withdrawal successful");
            } else {
                System.out.println("Insufficient balance");
            }
        } else if (choice == 2) {
            System.out.print("Enter amount: ");
            int amount = sc.nextInt();
            balance = balance + amount;
            System.out.println("Deposit successful");
        } else if (choice == 3) {
            System.out.println("Balance: " + balance);
        }
    }

    public static void main(String[] args) {
        Case7 a = new Case7();
        a.atm();
    }
}

