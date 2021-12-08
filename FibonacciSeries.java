package week1.day1;

public class FibonacciSeries {
	
	// out put must be 0,1,1,2,3,5,8,13,

	public static void main(String[] args) {

		int num1 = 0 ;
		int num2 = 1;
		
		int sum = 0 ;
		System.out.println(num1);
		System.out.println(num2);
		
		for (int i = 1; i <= 6; i++) {
			
			sum = num1 + num2;
			System.out.println(sum);
			
			num1=num2;
			num2=sum;
			
			
		}
		
	
		
		
	}

}
