/**
 * 
 */
package mypackage.com;

/**
 * @author prajw
 *
 */

//Two Pointer Approach;
public class checkPalindromeInArray {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[]= {1,2,3,2,1};
		boolean flag=true;
		int i=0;
		int j=a.length-1;
		
		while(i<j) {
			if(a[i]==a[j]) {
				i++;
				j--;
			}
			else {
				flag=false;
				break;
			}
		}
		System.out.println("Array is Palindrome: "+flag);

	}

}
