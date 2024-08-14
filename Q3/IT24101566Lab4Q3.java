import java.util.Scanner;
public class IT24101566Lab4Q3
{
	public static void main(String args[])
       {
	    Scanner input = new Scanner(System.in);
	    System.out.print("Enter a number : ");
	    double num = input.nextDouble();
	    String result;
	     
	    result = (num>0) ? "Positive" : (num==0) ? "The number is Zero" : "Negative";
	    System.out.println(result);
	}
}
	    
	    
            
	