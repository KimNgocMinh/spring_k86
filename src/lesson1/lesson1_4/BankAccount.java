package lesson1.lesson1_4;

public class BankAccount {
    private long amount = 20000000;

    public long getAmount() {
        return amount;
    }

    public void setAmount(long amount) {
        this.amount = amount;
    }

    public synchronized void withdrawal(long money,String name) {
        long balance = amount;
        if (money > amount) {
            System.out.println(name + " need: " + money);
            System.out.println(name + " Withdrawal Error!");
            System.out.println(name + " see: " + balance);
        } else {
            System.out.println(name + " need: " + money);
            System.out.println(name + " Withdrawal Successfully!");
            balance = amount - money;
            System.out.println(name + " see: " + balance);
            setAmount(balance);
        }
    }
}
