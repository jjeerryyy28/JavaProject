package mypackage.com;

import java.util.Scanner;

public class SwappingNumbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int a=sc.nextInt();
		int b=sc.nextInt();
		System.out.println("Values before swapping --> "+"a: "+a+ ", "+"b: " + b);
		int temp=a;
		a=b;
		b=temp;
		System.out.println("*********************");
		System.out.println("Values after swapping");
		System.out.println("-----------------------");
		System.out.println("Value of a: "+a);
		System.out.println("Value of b: "+b);
		sc.close();
	}

}
