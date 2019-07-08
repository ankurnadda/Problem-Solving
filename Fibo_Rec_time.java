import java.util.Scanner;

public class Fibo_Rec_time {

	public static long rec_fib (long  n)  //Algorithm 1.6, Recursive
	{
		if (n<=1)
		{
			return n;
		}
		
		else
		{
			return rec_fib(n-2) + rec_fib(n-1);
		}
	}
	
	public static void main(String[] args) {
		
		long number=1;
		long result;
		double start_time;
		double stop_time;
		double total_time;
		System.out.println("Program to calculate fibonnaci number using Recursive Algorithm with time calculation");
		
		Scanner scn = new Scanner(System.in);
		System.out.println("Enter the number");
		
		number = scn.nextInt(); 
		start_time = System.currentTimeMillis();    // Start time for function

		result = rec_fib(number);
		stop_time = System.currentTimeMillis();   // Stop time at the end of function execution

		total_time = (stop_time-start_time)*0.001;  // Convert to seconds

		System.out.println("The number selected is : " + number);

		System.out.println("The result is : " + result);
		
		if (total_time<60)
		{
			System.out.println("The time taken in seconds is :" + total_time + ",less than 60 seconds");

		}
		else
		{
			System.out.println("The time taken in seconds is :" + total_time + ", greater than 60 seconds");


		}
		

	}

}
