package week1.day1;

public class Mobile {

	public void makeCall() {
		System.out.println("Making Call");
		
		String mobileModel = "iPhone";
		float mobileWeight = 1.066f;
		
		System.out.println("Mobile name: "+ mobileModel);
		System.out.println("Mobile weight: "+ mobileWeight);
		
	}
	
	
	 public void sendMsg() {
		System.out.println("Sending Message");
		boolean isFullyCharged = true;
		int mobileCost= 1900;
		
		System.out.println("Charged: "+ isFullyCharged);
		System.out.println("Mobile Cost: "+ mobileCost);
		
	}
	
	public static void main(String[] args) {
		Mobile mobileObject = new Mobile();
		mobileObject.makeCall();
		mobileObject.sendMsg();
	}
}
