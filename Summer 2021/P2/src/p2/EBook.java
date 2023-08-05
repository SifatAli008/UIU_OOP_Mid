package p2;

public class EBook extends Book {

    public String format;

    public EBook(int chapters, int pages, String format) {
        super(chapters, pages);
        this.format = format;
    }


    @Override
    public void printSummary() {
        System.out.println("Chapters : " + chapters);
        System.out.println("Pages : " + pages);
        System.out.println("Format : " + format);
    }
}
