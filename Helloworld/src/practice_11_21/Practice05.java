package practice_11_21;
import java.util.Arrays;

public class Practice05 {

	public static void main(String[] args) {
		int[] score={0,0,1,2,3,5,4,5,2,8,7,6,9,5,4,8,3,1,0,2,4,8,7,9,5,2,1,2,3,9};
		int oddNum = 0;
		int even = 0;
		
		for(int i=0;i<score.length;i++) {
			if(score[i]%2==0) {
				even++;
			}
			else oddNum++;
		}
		System.out.println("偶数的个数是" + even + "\t" + "奇数的个数是" + oddNum);
	}
}