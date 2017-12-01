package practice_11_21;
import java.util.Arrays;

public class Practice04 {

	public static void main(String[] args) {
		int[] score={0,0,1,2,3,5,4,5,2,8,7,6,9,5,4,8,3,1,0,2,4,8,7,9,5,2,1,2,3,9};
		int[] count;
		count = new int[10];
		for(int i=0;i<score.length;i++) {
			switch(score[i]) {
			case 0:
				count[0] += 1;
				break;
			case 1:
				count[1] += 1;
				break;
			case 2:
				count[2] += 1;
				break;
			case 3:
				count[3] += 1;
				break;
			case 4:
				count[4] += 1;
				break;
			case 5:
				count[5] += 1;
				break;
			case 6:
				count[6] += 1;
				break;
			case 7:
				count[7] += 1;
				break;
			case 8:
				count[8] += 1;
				break;
			case 9:
				count[9] += 1;
				break;
			default:
				System.out.println("default");
				break;
			}
		}
		for(int j=0;j<count.length;j++) {
			System.out.println(j+"循环次数是"+count[j]);
		}
	}
}
