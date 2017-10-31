package inheritance;
public class Poem {
    private String title;
    private String author;
    private String style;
    
    public Poem(String title, String author, String style)
    {
        this.title = title;
        this.author = author;
        this.style = style;
    }
    
    public void Print()
    {
       System.out.println(title);
       System.out.println("\tWritten By: " + author);
       System.out.println("\tIn The Style Of: " + style);
    }
}
