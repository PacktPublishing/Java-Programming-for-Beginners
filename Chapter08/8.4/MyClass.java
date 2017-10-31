package theobjectclass;


public class MyClass {
    public String value;
    public MyClass(String value)
    {
        this.value = value;
        System.out.println("A MyClass object was created with value:" + value);
    }
    public void MyMethod()
    {
        System.out.println("MyMethod was called on a MyClass object with value: " + value);
    }
     
    @Override
    public boolean equals(Object obj)
    {
        if(obj == null)
            return false;
        
        if(!(obj instanceof MyClass))
        return false;
        
        return value.equals(((MyClass)obj).value);
    
}
}