package section15_Threads.threads_challenge;

public class Test {
    public static void main(String[] args) {
        BankAccount bankAccount = new BankAccount(1000.00, "12345678");

        Thread thread1 = new Thread(new Runnable() {
            @Override
            public void run() {
                bankAccount.deposit(300.00);
                bankAccount.withdraw(50);
            }
        });

        Thread thread2 = new Thread(new Runnable() {
            @Override
            public void run() {
                bankAccount.deposit(203.75);
                bankAccount.withdraw(100);
            }
        });

        thread1.start();
        thread2.start();
    }
}
