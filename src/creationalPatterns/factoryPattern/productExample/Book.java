package creationalPatterns.factoryPattern.productExample;

public class Book implements Product{
    private String title;
    private String author;

    public Book(String title, String author) {
        this.title = title;
        this.author = author;
    }

    @Override
    public void displayInfo() {
        System.out.println("Book - Title: " + title + ", Author: " + author);
    }
}
