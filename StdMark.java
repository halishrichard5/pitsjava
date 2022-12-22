import java.util.Scanner;

public class StdMark

{
    public static void main(String args[])
    {
    	/* This program assumes that the student has 6 subjects,
    	 * thats why I have created the array of size 6. You can
    	 * change this as per the requirement.
    	 */
        int marks[] = new int[6];
        int i;
        float total=0, avg;
        Scanner scanner = new Scanner(System.in);
		
        
        for(i=0; i<5; i++) { 
           System.out.print("Enter Marks of Subject"+(i+1)+":");
           marks[i] = scanner.nextInt();
           total = total + marks[i];
        }
        scanner.close();
        //Calculating average here
        avg = total/6;
        System.out.println("Your mark is:"+avg);
        if(avg>=90)
        {
            System.out.print("Grade is:O\nGrade Points:10");
        }
        else if(avg>=80 && avg<91)
        {
           System.out.print(" Grade is:A+\nGrade Points:9");
        } 
        else if(avg>=70 && avg<81)
        {
            System.out.print("Grade is:A\nGrade Points:8");
        }
          else if(avg>=60 && avg<71)
        {
            System.out.print("Grade is:B+\nGrade Points:7");
        }
          else if(avg>=50 && avg<61)
        {
            System.out.print("Grade is:B\nGrade Points:6");
        }
      
        else
        {
            System.out.print("Grade is:RA\nGrade Points:5");
        }
    }
}