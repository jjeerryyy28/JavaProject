package mypackage.com;

import java.util.Scanner;

public class FindGreaterNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter first number: ");
		int a=sc.nextInt();
		System.out.println("Enter second number: ");
		int b=sc.nextInt();
		System.out.println("Enter third number: ");
		int c=sc.nextInt();
		int largest = c > (a > b ? a : b) ? c : ((a > b) ? a : b);
		System.out.println("the largest number is: "+largest);
		sc.close();

	}

}
