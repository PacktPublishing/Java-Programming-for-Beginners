package strings;

public class Strings {

    public static void main(String[] args) {
        String s1 = new String("Strings are arrays of characters");
        String s2 = new String("Strings are arrays of characters");
        
        System.out.println("string1: " + s1.replace("characters", "char"));
        System.out.println("string2: " + s2);
		System.out.println(s1 == s2);
		
    }
}