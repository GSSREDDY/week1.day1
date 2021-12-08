package week1.day1;

public class Mobile {
	
	String brandName = "Santosh";
	
	
	
	public void makeCall() {
System.out.println("call connected");
	}

	public void sendSms() {
System.out.println("sms sent");
	}
	
	
	public static void main(String[] args) {

		Mobile mob = new Mobile();
		mob.makeCall();
mob.sendSms();
String brandName = "Raju";
System.out.println(brandName);

System.out.println(mob.brandName);

	}

}
