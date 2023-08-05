package p2;

public class InheritanceTest {

    public static void main(String[] args) {
        Book java = new Book();
        int chapters = 8, pages = 500;
        EBook c = new EBook(chapters, pages, "pdf");
        Book b = java;
        b.printSummary();
        b = c;
        b.printSummary();
    }

}
