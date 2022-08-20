package mypackage.com;

public class Max_math {
	public static void main(String [] args) {
		int a[]= {0,1,0,0,1,1,0,0,0};
		int count = 0;
		int max=0;
		int c=20;
		double e=40.405;
		double b=-40.909;
		double s=50.901;
		for(int i=0;i<a.length;i++) {
			if(a[i]==0) {
				count++;
			}
			else {
				count=0;
			}
			max=Math.max(count,max);
		}
		double min=Math.min(c, b);
		double ab=Math.abs(b);
		double ceil=Math.ceil(b);
		System.out.println(Math.ceil(s));
		System.out.println(Math.floor(e));
		System.out.println(ceil);
		System.out.println(ab);
		System.out.println(min);
		System.out.println(max);
	}
}
