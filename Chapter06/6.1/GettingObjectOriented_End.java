package gettingobjectoriented;

import java.util.*;

public class GettingObjectOriented {
    public static void main(String[] args) {
            Person john = new Person();
            john.firstName = "John";
            john.lastName = "Doe";
            john.birthday = new GregorianCalendar(1988,1,5);
            
            System.out.println(john.age(new GregorianCalendar()));           
    }
}