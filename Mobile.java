package week1.day1;

public class Mobile {
	public void makeCall() {
		String mobileModel="MotoX4";
		double mobileWeight=100.25;
		System.out.println("This is my mobile model"+  mobileModel);
		System.out.println("This is my mobile Weight" + mobileWeight);
	}       
	public void sendMsg() {
	boolean isFullCharged=true;
	int mobileCast=16450;
	System.out.println("My mobile case" + mobileCast);
	}
	public static void main(String[] args) {
		Mobile obj=new Mobile();
		obj.makeCall();
		obj.sendMsg();
				
	}
	

}
