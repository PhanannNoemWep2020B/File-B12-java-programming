public class web {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int count = 0;
		for(int i = 1; i <= 15; i++){
			if(i % 2 == 0){
				count++;
			}
		}
		System.out.print("There are: " + count+" " + "even number");
	}
}
