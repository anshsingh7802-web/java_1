class Emp {
    String name;
    int salary;

    Emp(String name, int salary) {
        this.name = name;
        this.salary = salary;
    }

    void display() {
        System.out.println("Name: " + name);
        System.out.println("Salary: " + salary);
    }
}

class Manager extends Emp {
    int bonus;

    Manager(String name, int salary, int bonus) {
        super(name, salary);
        this.bonus = bonus;
    }

    void displayManager() {
        display();
        System.out.println("Bonus: " + bonus);
        System.out.println("Total Salary: " + (salary + bonus));
    }
}

public class Case8 {
    public static void main(String[] args) {

        Emp e = new Emp("Ansh", 30000);
        e.display();

        System.out.println();

        Manager m = new Manager("Rahul", 50000, 10000);
        m.displayManager();
    }
}