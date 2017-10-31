package advancedmethods;

public class AdvancedMethods {
    public static void main(String[] args) {
        int[] x = 5;

        magic(x);
        
        System.out.println("main: " + x);
    }
    
    public static void magic(int input)
    {
        input += 10;
    }
}