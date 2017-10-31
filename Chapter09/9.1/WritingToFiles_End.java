package writingtofiles;

import java.io.*;

public class WritingToFiles {
    public static void main(String[] args) throws IOException {
        BufferedWriter out = null;
        
        try {
            out = new BufferedWriter(new FileWriter("out.txt", true));

            for(long number : FibonacciNumbers())
            {
                out.write(String.valueOf(number) + "\r\n");
                //System.out.println(number);
            }
        }
        catch(IOException e) {
            System.err.println("File IO Failed.");
        }
        finally{
            out.close();
        }
    }
    
    private static long[] FibonacciNumbers()
    {
        long[] fibNumbers = new long[50];
        fibNumbers[0] = 0;
        fibNumbers[1] = 1;
        for(int i = 2; i < 50; i++)
        {
            fibNumbers[i] = fibNumbers[i - 1] + fibNumbers[i - 2];
        }
        return fibNumbers;
    }
}