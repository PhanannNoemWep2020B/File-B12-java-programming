
public class Array {

	public Array() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int number[] = {5, 45, 22 , 11};
		 int average = 1;
		 int sum = 0;
		 for(int i = 0; i < number.length; i++) {
 		 System.out.print("|" + number[i]);
			 sum += number[i];
		average = sum / number.length;
		 }
		 System.out.println("|");
	 System.out.println("Average " + average);
		 
//		 for(int element:number) {
//			 System.out.println(element);
//		 }
	}

}
