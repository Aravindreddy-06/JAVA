import java.util.*;

// Transaction Class
class Transaction {
    String type;
    double amount;
    Date date;

    Transaction(String type, double amount) {
        this.type = type;
        this.amount = amount;
        this.date = new Date();
    }

    public String toString() {
        return type + " | Amount: " + amount + " | Date: " + date;
    }
}

// Account Class
class Account {
    int accountNumber;
    double balance;
    ArrayList<Transaction> history;

    Account(int accountNumber, double balance) {
        this.accountNumber = accountNumber;
        this.balance = balance;
        history = new ArrayList<>();
    }

    void deposit(double amount) {
        balance += amount;
        history.add(new Transaction("Deposit", amount));
        System.out.println("Deposited: " + amount);
    }

    void withdraw(double amount) {
        if (amount > balance) {
            System.out.println("Insufficient Balance!");
        } else {
            balance -= amount;
            history.add(new Transaction("Withdraw", amount));
            System.out.println("Withdrawn: " + amount);
        }
    }

    void showBalance() {
        System.out.println("Balance: " + balance);
    }

    void showHistory() {
        if (history.isEmpty()) {
            System.out.println("No transactions yet.");
        } else {
            for (Transaction t : history) {
                System.out.println(t);
            }
        }
    }
}

// Main ATM Class
public class ATM_project {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // HashMap to store accounts
        HashMap<Integer, Account> accounts = new HashMap<>();

        // Sample accounts
        accounts.put(101, new Account(101, 1000));
        accounts.put(102, new Account(102, 2000));

        System.out.print("Enter Account Number: ");
        int accNo = sc.nextInt();

        if (!accounts.containsKey(accNo)) {
            System.out.println("Account not found!");
            return;
        }

        Account acc = accounts.get(accNo);

        // Menu loop (NO do-while)
        while (true) {
            System.out.println("\n--- ATM MENU ---");
            System.out.println("1. Check Balance");
            System.out.println("2. Deposit");
            System.out.println("3. Withdraw");
            System.out.println("4. Transaction History");
            System.out.println("5. Exit");

            System.out.print("Enter choice: ");
            int choice = sc.nextInt();

            if (choice == 1) {
                acc.showBalance();

            } else if (choice == 2) {
                System.out.print("Enter amount: ");
                double amount = sc.nextDouble();
                acc.deposit(amount);

            } else if (choice == 3) {
                System.out.print("Enter amount: ");
                double amount = sc.nextDouble();
                acc.withdraw(amount);

            } else if (choice == 4) {
                acc.showHistory();

            } else if (choice == 5) {
                System.out.println("Thank you!");
                break;

            } else {
                System.out.println("Invalid choice!");
            }
        }
        sc.close();
    }
}