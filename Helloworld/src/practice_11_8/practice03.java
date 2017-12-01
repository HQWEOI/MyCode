package practice_11_8;

import java.util.Scanner;

public class practice03 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String level = scan.next();
		switch (level) {
		case "A":
			System.out.println("85+");
			break;
		case "B":
			System.out.println("70-84");
			break;
		case "C":
			System.out.println("60-69");
			break;
		case "D":
			System.out.println("60ртоб");
			break;
		default:
			break;
		}
	}
}
