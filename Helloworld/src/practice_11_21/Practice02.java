package practice_11_21;

import java.util.Scanner;

public class Practice02 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n;
		n = scan.nextInt();
		
		switch(n){
			case 1:
			case 3:
			case 5:
			case 7:
			case 8:
			case 10:
			case 12:
				System.out.println("31Ìì");
				break;
			case 4:
			case 6:
			case 9:
			case 11:
				
				System.out.println("30Ìì");
				break;
			case 2:
				System.out.println("29Ìì");
				break;
			
				
		}
	}
}
