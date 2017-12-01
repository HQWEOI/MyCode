package practice_11_8;

import java.util.Scanner;

public class practice02 {
	private static Scanner in;
	public static void main(String[] args) {
		in = new Scanner(System.in);
		int n = in.nextInt();
		for(int i=0;i<n+1;i++) {
		System.out.println();
		for(int j=0;j<i;j++)
			System.out.print("*");
	}
}
}