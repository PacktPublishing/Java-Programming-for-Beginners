package gettingobjectoriented;

import java.util.*;

public class GettingObjectOriented {
    public static void main(String[] args) {
            Person john = new Person("John", "Doe", new GregorianCalendar(1988,1,5));
            //Person john = new Person("John", "Doe");
            //Person john = new Person();
 
            System.out.println(
                    "Hello my name is " + 
                    john.fullName() +
                    ". I am " +
                    john.age(new GregorianCalendar()) +
                    " years old.");
    }
}