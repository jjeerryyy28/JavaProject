/*Take a String str as input and print the sum of all substrings of a string representing a number.

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

public class SumOfSubString {
	static int toDigit(char ch)
	{
	  return (ch - '0');
	}
	 
	// Returns sum of all subString of num
	static int sumOfSubStrings(String num)
	{
	  int n = num.length();
	 
	  // Storing prev value
	  int prev = toDigit(num.charAt(0));
	 
	  int res = prev;
	 
	  int current = 0;
	 
	  // SubStrings sum upto current index
	  // loop over all digits of String
	  for (int i = 1; i < n; i++)
	  {
	    int numi = toDigit(num.charAt(i));
	 
	    // Update each sumofdigit
	    // from previous value
	    current = (i + 1) * numi + 10 * prev;
	 
	    // Add current value to the result
	    res += current;
	     
	    // Update previous
	    prev = current;
	  }
	  return res;
	}
	 
	// Driver code to test above methods
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		String num = sc.nextLine();
		System.out.print(sumOfSubStrings(num) + "\n");
/*		Scanner sc = new Scanner(System.in);
		String num = sc.nextLine();

		System.out.println(sumOfSubstrings(num));
	}
	public static int sumOfSubstrings(String num) {
		int n = num.length();
		int sumofdigit[] = new int[n];

	
		sumofdigit[0] = num.charAt(0) - '0';
		int result = sumofdigit[0];

		for (int i = 1; i < n; i++) {
			int number = num.charAt(i) - '0';

			sumofdigit[i] = (i + 1) * number + 10 * sumofdigit[i - 1];

			result += sumofdigit[i];
		}

		return result; 
		*/
		
	}
}