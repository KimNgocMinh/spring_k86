package lesson1.lesson1_4;

public class Main {
    public static void main(String[] args) {
        BankAccount bankAccount = new BankAccount();
        WithdrawalThread thread1 = new WithdrawalThread(bankAccount, 15000000l);
        WithdrawalThread thread2 = new WithdrawalThread(bankAccount, 20000000l);
        thread1.setName("Husband");
        thread2.setName("Wife");
        thread1.start();
        thread2.start();
    }
}
