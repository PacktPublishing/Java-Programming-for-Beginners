package serialization;

import java.io.*;

public class Serialize {
    public static void main(String argv[]) {
        Car c = new Car("FDAJFD54254", "Nisan", "Altima", "Green", 2000);
        
        try {
            FileOutputStream outFile = new FileOutputStream("serialized.dat");
            ObjectOutputStream out = new ObjectOutputStream(outFile);
            out.writeObject(c);
            out.close();
            outFile.close();
        }
        catch(IOException e)
        {
            System.err.println("ERROR");
        }
    }
}