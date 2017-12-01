package practice_11_8;

public class practice01 {
	public static void main(String[] args) {
		int sum = 0;
		for(int i=0;i<=100;i++) {
			if(i!=3&&i%10!=3&&i%100!=3)
			sum+=i;
		}
		System.out.println(sum);
	}
}
