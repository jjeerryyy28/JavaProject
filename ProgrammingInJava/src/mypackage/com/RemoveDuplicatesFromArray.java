package mypackage.com;

import java.util.Scanner;

public class RemoveDuplicatesFromArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc =new Scanner(System.in);
		System.out.println("Enter String: ");
		String str=sc.nextLine();
		String temp=str.charAt(0)+"";
		
		char c[]=str.toCharArray();
		
		for(int i=1;i<c.length;i++) {
			if(c[i]!=c[i-1]) {
				temp=temp+c[i];
			}
		}
		System.out.println("Characters after removing duplicates: "+temp);
	}

}
