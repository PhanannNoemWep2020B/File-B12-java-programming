
public class Number_big {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int numbers[] = {50, 30, 25};
		int array = numbers[0];
		for(int i = 1; i > numbers.length; i++) {
			if(array[i] < numbers) {
				numbers = array[i];
			}
			
		}
		System.out.println(array);
	}
}
