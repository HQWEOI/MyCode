package practice_11_13;

public class MyData_6 {
	int year;
	int mouth;
	int day;
	public void setData(int year,int mouth,int day) {
		this.year = year;
		this.mouth = mouth;
		this.day = day;

	}
	public void getData() {
		System.out.println(year + " Äê " + mouth  + " ÔÂ " + day + " ÈÕ ");
	}
	public static void main(String[] args) {
		MyData_6 test = new MyData_6();
		test.setData(1992, 12, 1);
		test.getData();
	}
}
