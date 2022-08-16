/**
 * 
 */
package mypackage.com;

import java.util.Scanner;

/**
 * @author prajw
 *
 */
public class StringDemo {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine();
		System.out.println(str.substring(0,11));
		System.out.println(str.indexOf("you"));
		System.out.println(str.lastIndexOf("He"));
		System.out.println("Length: "+str.length());
		sc.close();

	}

}
