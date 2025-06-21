abstract class Payment {
    abstract void validate();
    abstract void process();
}

class CreditCard extends Payment {
    void validate() {
        System.out.println("Validating Credit Card");
    }
    void process() {
        System.out.println("Processing Credit Card");
    }
}

class PayPal extends Payment {
    void validate() {
        System.out.println("Validating PayPal");
    }
    void process() {
        System.out.println("Processing PayPal");
    }
}

class BankTransfer extends Payment {
    void validate() {
        System.out.println("Validating Bank Transfer");
    }
    void process() {
        System.out.println("Processing Bank Transfer");
    }
}

public class Hw2 {
    public static void main(String[] args) {
        CreditCard cc = new CreditCard();
        cc.validate();
        cc.process();

        PayPal pp = new PayPal();
        pp.validate();
        pp.process();

        BankTransfer bt = new BankTransfer();
        bt.validate();
        bt.process();
    }
}
