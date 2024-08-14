import java.util.Scanner;
public class IT24101566Lab4Q1
{
      public static void main(String args[])
     {
         Scanner input = new Scanner(System.in);
	 System.out.print("Enter a number: ");
	 double num = input.nextDouble();
	 
    	 if (num>0)
        {
           System.out.println("Positive");
	}
         else if (num==0)
        {
	   System.out.println("The number is Zero");
        }
         else 
        {
           System.out.println("Negative");
        }
    }
}