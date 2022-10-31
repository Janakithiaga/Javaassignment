package week1.day2;

public class FibanocciSeries {

	public static void main(String[] args) {
		int firstnum=0;
		int secnum=1;
		int sum,i;
		System.out.println(firstnum);
		System.out.println(secnum);
		for (i=1;i<9;i++) {
			sum=firstnum+secnum;
			System.out.println(sum);
			firstnum=secnum;
			secnum=sum;
		}
			}
	}


