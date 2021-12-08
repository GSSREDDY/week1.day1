package week1.day1;

//under Class is Gobalvariable

public class GobalVariable {
	
	String mobileModel = "Samsung";
	float mobileWeight = 209.9F;
	boolean isFullCharged = true;
	double mobileCost = 38986.8975d;
	
	

	public static void main(String[] args) {
		GobalVariable myphone = new GobalVariable();
		
		System.out.println(myphone.mobileModel);
		System.out.println(myphone.mobileWeight);
		System.out.println(myphone.isFullCharged);
		System.out.println(myphone.mobileCost);
		
		
	

	}

}
