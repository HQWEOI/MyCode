package teat;

import java.util.Scanner;

public class LX35 {
	public static void main(String[] args) {
		int temp = 0;
		int a;
		Scanner in = new Scanner(System.in);
		int[] array = new int[in.nextInt()];
		for(int i=0;i<array.length;i++) {
			array[i] = in.nextInt();
		}

		for(int i=0;i<array.length;i++) {
			if(array[0]<array[i]) {
				temp = array[i];
		array[i] = array [0];
		array[0] = temp;
		}	
		}
		a =array.length-1;
		for(int i=a-1;i>0;i--) {
		if(array[a]>array[i]) {
		temp = array[i];
		array[i] = array [a];
			array[a] = temp;
			}
	}
		for(int i=0;i<array.length;i++) {
		System.out.println(array[i]);
	}
	
	}
}
