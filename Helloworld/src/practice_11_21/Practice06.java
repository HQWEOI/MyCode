package practice_11_21;

import java.util.ArrayList;
import java.util.Scanner;

public class Practice06 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		ArrayList<Integer> score = new ArrayList(); 
		double sum = 0;
		double avg = 0;
		int temp = 0;
		while(true) {
			temp = scan.nextInt();
			if(temp == -1) {
				break;
			}
			else { 
				score.add(temp);
			}
		}
		for (int j = 0; j < score.size(); j++) {
			sum += score.get(j); 	
	
		}
		
		avg = sum/(score.size());
		System.out.println("ƽ������" + avg);

	}
}
