class Student {

    String[] courses = new String[5];
    int count = 0;

    void registerCourse(String course) {
        if (count < 5) {
            courses[count++] = course;
        } else {
            System.out.println("Maximum 5 courses allowed!");
        }
    }

    void displayCourses() {
        for (int i = 0; i < count; i++) {
            System.out.println(courses[i]);
        }
    }
}

public class Case9 {
    public static void main(String[] args) {

        Student s = new Student();

        s.registerCourse("Java");
        s.registerCourse("DSA");
        s.registerCourse("DBMS");
        s.registerCourse("OS");
        s.registerCourse("CN");
        s.registerCourse("Web"); // 6th course

        s.displayCourses();
    }
}