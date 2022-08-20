package mypackage.com;

import java.util.*;

public class Rotate7DigitNumberUpto3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		/*
		 long x = sc.nextLong(); 
		 long d = x % 1000; 
		 long p = x / 1000;
		 System.out.println(d + "" + p);
		 */
		
		//String
		 int x=sc.nextInt();
         sc.close();
         String s=String.valueOf(x);
         String sub=s.substring(s.length()-3);
         int num=Integer.parseInt(sub);
         System.out.print(num+s.substring(0,s.length()-3));

		
		
		

	}

}
