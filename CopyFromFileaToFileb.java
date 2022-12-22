// Java program to copy content from
// one file to another

import java.io.*;
import java.util.*;

public class CopyFromFileaToFileb {
	
	   public static void main(String[] args) throws FileNotFoundException, IOException {

        FileReader fr = new FileReader("input.txt"); 
        BufferedReader br = new BufferedReader(fr); 
        FileWriter fw = new FileWriter("outfile.txt"); 
        String line;

        while((line = br.readLine()) != null)
        { 
            line = line.trim(); // remove leading and trailing whitespace
            line=line.replaceAll("\\s+", " ");
            fw.write(line);


        }
        fr.close();
        fw.close();
    }

}