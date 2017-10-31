package exceptions;

import java.util.*;

public class Exceptions {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        
        while(true) {
            System.out.print("Input a number: ");
            float input = reader.nextFloat();
            System.out.println("You input the number: " + input);
            System.out.println("\r\n");
        }
    }
}