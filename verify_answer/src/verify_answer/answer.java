package verify_answer;

public class answer {

	public static void main(String[] args) {
//		int x = 50;
//		int y = 100;
//		
//		System.out.println(y += x);
//		System.out.println(y -= x);
//		System.out.println(y *= x);
//		System.out.println(y / x);
//		System.out.println(y % x);
		 int oddNumber = 1;
	        int evenNumber = 2;
	        int totalEven = 0;
	        while (evenNumber <= 50)
	        {
	            totalEven = totalEven + evenNumber;
	            evenNumber = evenNumber + 2;
	        }
	      System.out.printf ( "Total sum of the even number is ", totalEven);
	}

}
