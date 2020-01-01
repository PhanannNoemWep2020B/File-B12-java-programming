package phanann_noem_CH3_HW1;

import java.util.Scanner;

public class number4 {

	public number4() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner myObj = new Scanner(System.in);  // Create a Scanner object
	    System.out.println("Enter your order");
        String letter = " ";
	    letter = myObj.nextLine();
	    switch(letter) {
	    case "a":
	    case "A":
	    	System.out.println("You order BayChha.");
	        break;
	    case "b":
	    case "B":
	    	System.out.println("You order Ice Tea.");
	    	break;
	    case "c":
	    case "C":
	    	System.out.println("You order Soup");
	    	break;
	    default:
	    	System.out.println("Out of order");
	    }  
	    
	}

}
