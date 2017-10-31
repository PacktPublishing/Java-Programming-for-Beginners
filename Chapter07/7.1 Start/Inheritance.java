package inheritance;

public class Inheritance {
    public static void main(String[] args) {
        Book a = new Book(
                "The Lord Of The Rings", 
                "J.R.R. Tolkein",
                "George Allen and Unwin", 
                "Fantasy");
        Poem b = new Poem(
                "The Iliad",
                "Homer",
                "Dactylic Hexameter");
        
        a.Print();
        b.Print();
    }
}
