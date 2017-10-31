package inheritance;
public class Book {
    private String title;
    private String author;
    private String publisher;
    private String genre;
    
    public Book(String title, String author, String publisher, String genre)
    {
        this.title = title;
        this.author = author;
        this.publisher = publisher;
        this.genre = genre;
    }
    
    public void Print()
    {
       System.out.println(title);
       System.out.println("\tWritten By: " + author);
       System.out.println("\tPublished By: " + publisher);
       System.out.println("\tIs A: " + genre);
    }
}
