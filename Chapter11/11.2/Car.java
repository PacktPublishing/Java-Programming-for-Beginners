
package readingxml;


public class Car {
    public String vin;
    public String make;
    public String model;
    public int year;
    public String color;
    public Car()
    {
        
    }
    @Override
    public String toString()
    {
        return String.format("%d %s %s %s, vin:%s", year, 
        color, make,model, vin);
    }

}
