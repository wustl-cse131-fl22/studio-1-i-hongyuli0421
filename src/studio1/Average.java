package studio1;

import java.util.Scanner;

public class Average {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("Enter value for arg 0");
		int n1 = in.nextInt();
		System.out.println("Enter value for arg 1: ");
		int n2 = in.nextInt();
		// TODO Auto-generated method stub
		double average = (n1+n2)/2.0;
		System.out.print("Average of "+n1+" and "+n2+" is "+average);
		
	}

}
