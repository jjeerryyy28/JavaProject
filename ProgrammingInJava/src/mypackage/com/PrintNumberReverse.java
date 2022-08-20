package mypackage.com;

import java.util.Scanner;

public class PrintNumberReverse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		 int n=456;
	       int rev=0;
	       while(n>0){
	       rev=rev*10+n%10;
	       n=n/10;
	       }
	        System.out.println(rev);
	        sc.close();
	}

}
