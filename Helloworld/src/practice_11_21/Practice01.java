package practice_11_21;

import java.util.Scanner;

public class Practice01 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int fraction = scan.nextInt();
		if (fraction>=90&&fraction<=100) {
				System.out.println("����");
		}
		else if(fraction>=80) {
			System.out.println("����");
		}
		else if(fraction>=70){
			System.out.println("һ��");
		}
		else if(fraction>=60) {
			System.out.println("����");
		}
		else 
			System.out.println("������");
	}
}

