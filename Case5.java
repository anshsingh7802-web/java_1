class Case5 {
    int id;
    String title;
    String author;
    boolean available = true;

    void issueBook() {
        if (available) {
            available = false;
            System.out.println("Book Issued");
        } else {
            System.out.println("Book is already issued");
        }
    }

    void returnBook() {
        available = true;
        System.out.println("Book Returned");
    }

    void displayBook() {
        System.out.println("Book ID: " + id);
        System.out.println("Title: " + title);
        System.out.println("Author: " + author);
        System.out.println("Available: " + available);
    }

    public static void main(String[] args) {

        Case5 b = new Case5();

        b.id = 101;
        b.title = "Java Programming";
        b.author = "James Gosling";

        b.displayBook();
        b.issueBook();
        b.issueBook();
        b.returnBook();
        b.displayBook();
    }
}