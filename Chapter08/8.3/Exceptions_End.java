package exceptions;

import java.util.*;

public class Exceptions {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        
        while(true) {
            try{
                System.out.print("Input a number: ");
                float input = reader.nextFloat();
                System.out.println("You input the number: " + input);
                System.out.println("\r\n");
            }
            catch(InputMismatchException e) 
            {
                System.out.println("You passed invalid input. Not a float!");
                e.printStackTrace(System.out);
                System.out.println("\r\n");
            }
            finally
            {
                reader.nextLine();
            }
        }
    }
}