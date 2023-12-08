public class Account {
    private double balance = 0;

    public Account(double balance) {
        this.balance = balance;
    }

    public synchronized void deposit(double amount) {
        if (amount < 0) {
            System.out.println("Can't deposit");
            return;
        }

        this.balance += amount;
        System.out.printf(
                "Deposit %.2f in thread %d, balance is %.2f%n",
                amount,
                Thread.currentThread().threadId(),
                balance
        );
    }

    public synchronized void withdraw(double amount) {
        if (amount < 0 || amount > this.balance) {
            System.out.println("Can't withdraw");
            return;
        }

        this.balance -= amount;
        System.out.printf(
                "Withdraw %.2f in thread %d, balance is %.2f%n",
                amount,
                Thread.currentThread().threadId(),
                balance
        );
    }
}
