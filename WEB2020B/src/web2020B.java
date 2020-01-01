public class web2020B {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int count = 0;
		for(int i = 1; i <= 15; i++){
			if(i % 2 == 1){
				count++;
			}
		}
		System.out.print("There are: " + count+" " + "odd number");
	}
}
