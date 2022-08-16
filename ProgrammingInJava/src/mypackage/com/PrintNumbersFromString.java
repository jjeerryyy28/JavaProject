package mypackage.com;

public class PrintNumbersFromString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "a1g0r1t8m4";
		
		int sum = 0;
		
		for(int i=0;i<str.length();i++) {
			char c1 = str.charAt(i);
			if(c1>='0' && c1<='9') {
				
				
				int num = c1 - '0';
				sum = sum + num;
			}
		}
		
		System.out.println(sum);
		
	}

}