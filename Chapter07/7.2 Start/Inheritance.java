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
        
        Literature[] lits = new Literature[5];
        lits[0] = a;
        lits[1] = b;
        lits[2] = a;
        lits[3] = b;
        lits[4] = a;

        for(int i = 0; i < lits.length; i++)
        {
            lits[i].Print();
        }
    }
}
