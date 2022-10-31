package week1.day2;

public class Palindrome {

	public static void main(String[] args) {
		int n=12321;
		int r,m;
		int sum=0;
		
		m=n;
		while(n>0) {
			r=n%10;
			sum=(sum*10)+r;
			n=n/10;
		}
if (m==sum)
	System.out.println("The number is Palindrome");
else
	System.out.println("The number is not Palindrome");
	}

}
