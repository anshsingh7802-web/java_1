package Case_Study_2;

class TicketBooking {
    int seats = 5;

    synchronized void book(int number) {
        if (number <= seats) {
            System.out.println(Thread.currentThread().getName() + " booked " + number + " seats");
            seats = seats - number;
            System.out.println("Remaining seats: " + seats);
        } else {
            System.out.println(Thread.currentThread().getName() + " could not book seats");
        }
    }
}

class Customer extends Thread {
    TicketBooking booking;

    Customer(TicketBooking booking) {
        this.booking = booking;
    }

    public void run() {
        booking.book(2);
    }
}

public class case2 {
    public static void main(String[] args) {

        TicketBooking booking = new TicketBooking();

        Customer c1 = new Customer(booking);
        Customer c2 = new Customer(booking);
        Customer c3 = new Customer(booking);

        c1.setName("Customer 1");
        c2.setName("Customer 2");
        c3.setName("Customer 3");

        c1.start();
        c2.start();
        c3.start();
    }
}
