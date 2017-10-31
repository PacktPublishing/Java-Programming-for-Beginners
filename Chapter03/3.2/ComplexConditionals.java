
package complexconditionals;

import java.util.*;

public class ComplexConditionals {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        String input = reader.next();
        String sOne = "abc";
        String sTwo = "z";
        
        boolean bool1 = input.contains(sOne);
        boolean bool2 = input.contains(sTwo);
        
        if((bool1 || bool2) && false)
        {
            System.out.println("TRUE");
        }
        else
        {
            System.out.println("FALSE");
        }
    }
}
