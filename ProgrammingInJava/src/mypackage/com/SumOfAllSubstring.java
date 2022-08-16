/*
 * Take a String str as input and print the sum of all substrings of a string representing a number.

Eg: str="1234"

Sum = 1 + 2 + 3 + 4 + 12 + 23 + 34 + 123 + 234 + 1234 = 1670

Note: Number will be in string fromat.

Input Format

A String.

Constraints

1<=str.length<=1000

Output Format

An Integer value.

Sample Input 0
12345

Sample Output 0
16755
*/




package mypackage.com;

import java.util.Scanner;

public class SumOfAllSubstring {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		String str=sc.nextLine();
		int sum=0;
		for(int i=0;i<str.length();i++) {
			for(int j=i;j<str.length();j++) {
				String temp=str.substring(i,j+1);
				int x=Integer.parseInt(temp);
				sum=sum+x;
			}
		}
		System.out.println(sum);
	}

}
