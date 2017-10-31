package inputandoutput;

import java.io.*;

public class InputAndOutput {
    public static void main(String[] args) throws IOException {
        File outFile = new File("OutputFile.txt");
        File inFile = new File("InputFile.txt");
        
        FileWriter out = new FileWriter(outFile);
        BufferedReader in = new BufferedReader(new FileReader(inFile));

        //Code Here...
        String input = "";
        String newInput;
        while((newInput = in.readLine()) != null)
        {
            input += (newInput + "\r\n");
        }
        out.write(input);
        
        out.close();
        in.close();
    }
}