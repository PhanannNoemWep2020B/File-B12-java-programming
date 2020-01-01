package phanann_noem_CH3_HW1;

public class number3 {

	public static void main(String[] args) {
	int i = 1;
	int sum = 0;
	do {
		if(i % 2 != 0) {
			sum = sum + i;
		}
		i++;
	}while(i <= 50);
		System.out.println("The average of odd number: " + sum / 25);
	}

}
