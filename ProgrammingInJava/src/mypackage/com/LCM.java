package mypackage.com;

public class LCM {

	public static void main(String[] args) {

		// TODO Auto-generated method stub
		int a = 10;
		int b = 15;
		int max = Math.max(a, b);
		int min = Math.min(a, b);
		int lcm = 0;
		for (int i = 1; i < Integer.MAX_VALUE; i++) {
			int mul = max * i;
			if (mul % min == 0) {
				lcm = mul;
				break;
			}
		}
		System.out.println(lcm);
	}
}
