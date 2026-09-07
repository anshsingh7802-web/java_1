class Case6 {
    int id;
    String name;
    int age;
    double temperature;

    void display() {
        System.out.println("Patient ID: " + id);
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Temperature: " + temperature);

        if (temperature > 100.4) {
            System.out.println("Fever");
        } else {
            System.out.println("Normal");
        }
    }

    public static void main(String[] args) {

        Case6 p = new Case6();

        p.id = 101;
        p.name = "Ansh";
        p.age = 20;
        p.temperature = 101.2;

        p.display();
    }
}
