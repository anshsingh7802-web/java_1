class Case4 {
    int id;
    String name;
    double price;
    int quantity;

    Case4(int id, String name, double price, int quantity) {
        this.id = id;
        this.name = name;
        this.price = price;
        this.quantity = quantity;
    }

    double totalCost() {
        return price * quantity;
    }

    public static void main(String[] args) {
        Case4 p1 = new Case4(101, "Mobile", 15000, 1);
        Case4 p2 = new Case4(102, "Mouse", 500, 2);

        double bill = p1.totalCost() + p2.totalCost();

        System.out.println("Mobile Cost: " + p1.totalCost());
        System.out.println("Mouse Cost: " + p2.totalCost());
        System.out.println("Total Bill: " + bill);

        if (bill > 5000) {
            double discount = bill * 0.10;
            bill = bill - discount;
            System.out.println("Discount: " + discount);
        }

        System.out.println("Final Bill: " + bill);
    }
}