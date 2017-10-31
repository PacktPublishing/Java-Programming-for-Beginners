package inheritance;
public class Poem extends Literature {
    private String style;
    
    public Poem(String title, String author, String style)
    {
        super(title, author);
        this.style = style;
    }
    
    @Override public void Print()
    {
       System.out.println("POEM: " + title);
       System.out.println("\tWritten By: " + author);
       System.out.println("\tIn The Style Of: " + style);
    }
}
