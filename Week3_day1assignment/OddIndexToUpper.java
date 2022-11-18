package week3.day1assignment;

public class OddIndexToUpper {

	public static void main(String[] args) {
		/*
		 Pseudo Code
		 * Declare String Input as Follow
		 * String test = "changeme";
		 * a) Convert the String to character array
		 * b) Traverse through each character (using loop)
		 * c)find the odd index within the loop (use mod operator)
		 * d)within the loop, change the character to uppercase, if the index is odd else don't change
		 */
		String test="janakipriya";
		char[] str=test.toCharArray();
		for(int i=0; i<str.length;i++) {
			if(i%2==0) {
				System.out.print(Character.toUpperCase(str[i]));
			}
			else {
				System.out.print(str[i]);
			}
		}
	}

	

}
