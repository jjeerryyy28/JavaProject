package mypackage.com;

import java.util.Scanner;

public class DivideNumberBy2_3_5tillDivisible {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int step = sc.nextInt();
		while (n % 2 == 0) {
			step = step + 2;
			n = n / 2;
		}
		while (n % 3 == 0) {
			step = step + 3;
			n = n / 3;
		}
		while (n % 5 == 0) {
			step = step + 5;
			n = n / 5;
		}
		System.out.println(step);
		System.out.print(n);
	}
}
