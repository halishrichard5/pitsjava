import java.io.*;
import java.util.Scanner;

public class ReturnFileSize 
{
	public static void main(String[] args) 
	{
		//create file object.
		// enter the file name.
		//File file = new File("F:/sample.txt");
  // Scanner for user input
  System.out.println("Enter the file name:");
  Scanner keyboard = new Scanner(System.in);
  String filename = keyboard.nextLine();
  File file = new File(filename);
  try {
   Scanner scan = new Scanner( file );
} catch (FileNotFoundException e) {
   // TODO Auto-generated catch block
   e.printStackTrace();
}      

		// calculate the size of the file.
		long fileSize = file.length();
		System.out.println("File size in bytes is : " + fileSize);
      
      
    

      if(file.canWrite()){
         System.out.println("File is  writeing only.");
      }
      else if(file.canRead()){
         System.out.println("File is read only.");
      }
      else{
         System.out.println("File is both reading and writing");  
      }
        	}
}