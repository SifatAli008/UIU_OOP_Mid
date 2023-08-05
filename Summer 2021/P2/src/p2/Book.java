
package p2;

public class Book {
    public int chapters;
    public int pages;

    public Book() {
    }
    

    public Book(int chapters, int pages) {
        this.chapters = chapters;
        this.pages = pages;
    }
    
    public void printSummary(){
        System.out.println("Chapters : "+chapters);
        System.out.println("Pages : "+pages);
    }
}
