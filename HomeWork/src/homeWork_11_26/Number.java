package homeWork_11_26;

public class Number {
	private int num1;
	private int num2;
	public Number(int num1,int num2) {
		this.num1 = num1;
		this.num2 = num2;
	}
	public int add() {
		return num1+num2;
	}
	public int sub() {
		return num1-num2;
	}
	public int multi() {
		return num1*num2;
	}
	public int div() {
		return num1/num2;
	}
	
	public static void main(String[] args) {
		Number num = new Number(10, 6);
		System.out.println("加法：" + num.add() + "减法：" + num.sub() +  "乘法：" + num.multi() + "除法：" + num.div());
	}
	
}
