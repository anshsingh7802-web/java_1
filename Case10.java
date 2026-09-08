interface Payment {
    void pay();
}

class CreditCard implements Payment {
    public void pay() {
        System.out.println("Paid by Credit Card");
    }
}

class UPI implements Payment {
    public void pay() {
        System.out.println("Paid by UPI");
    }
}

class NetBanking implements Payment {
    public void pay() {
        System.out.println("Paid by Net Banking");
    }
}

public class Case10 {
    public static void main(String[] args) {

        Payment p = new CreditCard();
        p.pay();

        p = new UPI();
        p.pay();

        p = new NetBanking();
        p.pay();
    }
}