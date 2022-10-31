package week1.day2;

public class PrimeNumber {

	public static void main(String[] args) {
		int n=101;
		int i;
		boolean j=false;
		for (i=2; i<=n/2; ++i) {
		if (n%i==0) {
			j=true;
			break;
					}
							
}
		if (!j)
			System.out.println("This is a prime number");
		else
			System.out.println("This is not a prime number");
}
}