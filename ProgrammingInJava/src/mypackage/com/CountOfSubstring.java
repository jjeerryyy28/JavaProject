package mypackage.com;

public class CountOfSubstring {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str="abcdefgh";
		int n=str.length();
		for(int i=0;i<str.length();i++) {
			for(int j=i;j<str.length();j++) {
				System.out.println(str.substring(i,j+1));
			}
		}
		System.out.println(n*(n+1)/2);
	}

}
