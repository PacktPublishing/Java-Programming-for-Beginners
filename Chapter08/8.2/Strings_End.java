package strings;

public class Strings {

    public static void main(String[] args) {
        CustomPrinter printer = new CustomPrinter("> > %s < <");
        
        String s1 = new String("Strings are arrays of characters");
        String s2 = new String("Strings are arrays of characters");
        
        printer.println("string1: " + s1.replace("characters", "char"));
        printer.println("string2: " + s2);
    }
}