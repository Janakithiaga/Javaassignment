package week1.day2;

import java.util.Arrays;

public class FindIntersection {

	public static void main(String[] args) {
		int[] a = {3,2,11,4,6,8,7};
		int[] b = {1,8,4,9,7};
		int n,m,i,j;
		Arrays.sort(a);
		Arrays.sort(b);
		n=a.length;
		m=b.length;
		for (i=1; i<=n;i++) {
			for (j=1;j<=m;j++) {
				if(a[i-1]==b[j-1])
				{
					System.out.println(a[i-1]);
				}
				
			}
		}
			
		

	}

}
