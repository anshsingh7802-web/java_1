import java.util.Scanner;

class Employee {
    int id;
    String name;
    double basic;

    void display() {
        double hra = basic * 0.20;
        double da = basic * 0.10;
        double gross = basic + hra + da;

        System.out.println("Employee ID: " + id);
        System.out.println("Name: " + name);
        System.out.println("Basic Salary: " + basic);
        System.out.println("HRA: " + hra);
        System.out.println("DA: " + da);
        System.out.println("Gross Salary: " + gross);
    }
}

public class Case3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Employee e = new Employee();

        System.out.print("Employee ID: ");
        e.id = sc.nextInt();

        sc.nextLine();
        System.out.print("Name: ");
        e.name = sc.nextLine();

        System.out.print("Basic Salary: ");
        e.basic = sc.nextDouble();

        e.display();
        sc.close();
    }
}