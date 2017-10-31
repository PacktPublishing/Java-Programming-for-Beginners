package advancedmethods;

import java.util.*;

public class AdvancedMethods {
    public static void main(String[] args) {
        int[] x = {5,4,3,2,1};

        magic(x);
        
        System.out.println("main: " + Arrays.toString(x));
    }
    
    public static void magic(int input)
    {
        input += 10;
    }
    public static void magic(int[] input)
    {
        for(int i = 0; i < input.length; i++)
			input[i] += 10;
    }
}