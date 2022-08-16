package mypackage.com;

import java.lang.reflect.Array;
import java.util.Arrays;

public class MilkAndWaterHackerrank {

	public static void main(String[] args) {
		int a[] = {-5 ,-3, 4 ,8 ,-11, 6, -4, 5 ,17 ,7,0};
		int i=0;
		int j=a.length-1;
		//Maintain order;
		while(i<j) {
			if(a[i]<0) {
				i++;
			}
			if(a[j]>=0) {
				j--;
			}
			if(a[i]>=0 && a[j]<0) {
				int temp=a[i];
				a[i]=a[j];
				a[j]=temp;
				i++;
				j--;
			}
		}
		System.out.println(Arrays.toString(a));
		
	}

}
