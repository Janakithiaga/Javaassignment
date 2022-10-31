package week1.day2;

import java.util.Arrays;

public class MissingElementInArray {

	public static void main(String[] args) {
	int[] arr = {1,4,3,5,7,6,8};
	Arrays.sort(arr);
	int i,n;
	n=arr.length;
	for (i=arr[0];i<=n;i++) {
		if (i!=arr[i-1]) {
			System.out.println("The missing number is "+i);
			break;
		}
	}
	

	}

}
