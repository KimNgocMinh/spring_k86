package lesson1.lesson1_4;

public class WithdrawalThread extends Thread {
    private BankAccount bankAccount;
    private Long money;

    public WithdrawalThread(BankAccount bankAccount,Long money) {
        this.bankAccount = bankAccount;
        this.money = money;
    }

    @Override
    public void run() {
        bankAccount.withdrawal(money,this.getName());
    }
}
