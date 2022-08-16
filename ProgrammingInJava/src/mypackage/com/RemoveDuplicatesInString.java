package mypackage.com;

import java.util.Scanner;

public class RemoveDuplicatesInString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter String: ");
		String str = sc.nextLine();
		
		String s1=new String();
		
		for(int i=0;i<str.length();i++) {
			char c=str.charAt(i);
			if(!s1.contains(c+"")) {
				s1=s1+c;
			}
		}
		System.out.println(s1);
		sc.close();
	}

}
