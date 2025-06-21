class Account {
    double balance;

    Account(double balance) {
        this.balance = balance;
    }

    double calculateInterest() {
        return balance * 0.01;
    }
}

class SavingsAccount extends Account {
    SavingsAccount(double balance) {
        super(balance);
    }

    double calculateInterest() {
        return balance * 0.04;
    }
}

class FixedDepositAccount extends Account {
    FixedDepositAccount(double balance) {
        super(balance);
    }

    double calculateInterest() {
        return balance * 0.07;
    }
}

public class Hw9 {
    public static void main(String[] args) {
        Account a = new Account(1000);
        SavingsAccount s = new SavingsAccount(1000);
        FixedDepositAccount f = new FixedDepositAccount(1000);

        System.out.println(a.calculateInterest());
        System.out.println(s.calculateInterest());
        System.out.println(f.calculateInterest());
    }
}
