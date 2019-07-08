import java.util.Scanner;

public class Fibo_Itr_time {
	
	public static long itr(int n){  // Standard Algoritm 1.7 from book
	    long[] arr = new long[n+2];
	    arr[0]=0;
	    arr[1]=1;
	    for (int i=2; i<=n; i++){
	        arr[i]=arr[i-2]+arr[i-1];
	    }
	    return arr[n];
	}
	

	public static void main(String[] args) {
		
		int number=1;
		long result;
		double start_time;
		double stop_time;
		double total_time;
		System.out.println("Program to calculate fibonnaci number using Iterative Algorithm with time calculation ");
		
		Scanner scn = new Scanner(System.in);
		System.out.println("Enter the number");
		
		number = scn.nextInt(); 
		start_time = System.currentTimeMillis();  // Calculate Starting System TIme

		result = itr(number);
		stop_time = System.currentTimeMillis();   // Calculate Stop time when function execution is done.

		total_time = start_time-stop_time;

		System.out.println("The number selected is : " + number);

		System.out.println("The result is : " + result);
		
		System.out.println("The time taken in milliseconds is :" + total_time); // Time taken in milliseconds
		

	}

}
