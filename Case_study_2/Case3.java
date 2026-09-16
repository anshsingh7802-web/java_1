package Case_Study_2;

class FoodPreparation extends Thread {

    public void run() {
        System.out.println("Food preparation started");
        
        try {
            Thread.sleep(2000);
        } catch (Exception e) {
        }

        System.out.println("Food preparation completed");
    }
}

class FoodDelivery extends Thread {

    public void run() {
        System.out.println("Food delivery started");
        System.out.println("Food delivered");
    }
}

public class case3 {
    public static void main(String[] args) {

        FoodPreparation p = new FoodPreparation();
        FoodDelivery d = new FoodDelivery();

        p.start();

        try {
            p.join();
        } catch (Exception e) {
        }

        d.start();
    }
}
