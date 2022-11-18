package week3.day1assignment;

public class RemoveDuplicate {

	public static void main(String[] args) {
		/*
		 * Pseudo code 
		 * a) Use the declared String text as input
		 * b) Initialize an integer variable as count	  
		 * c) Split the String into array and iterate over it 
		 * d) Initialize another loop to check whether the word is there in the array
		 * e) if it is available then increase and count by 1. 
		 * f) if the count > 1 then replace the word as "" 
		 
		 * g) Displaying the String without duplicate words	
		 */
		String text = "We learn java basics as part of java sessions in java week1";
		int count = 0;
		int i,j;
		String dup = "";
		String[] split = text.split(" ");
		for ( i= 0; i<split.length-1; i++) {
		
			for( j=i+1; j<split.length-1;j++) {
				
				if(split[i].equals(split[j])) {
					//System.out.println(split[i]);
					dup=split[j];
			count=count+1;
				}
			}
		}
		System.out.println(count);
		if(count>1) {
		System.out.println(text.replace(dup," "));
	}
}
}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	


