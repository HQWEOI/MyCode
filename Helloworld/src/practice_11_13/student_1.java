package practice_11_13;

public class student_1 {
	String name;
	score_1 sc = new score_1();
	public  void setData(String name1,String km,int grade) {
		this.name = name1;
		sc.course = km;
		sc.grade = grade;
	}
	public void getResault() {
		System.out.println("姓名：" + name +" 科目： "+ sc.course+ " 分数： "+ sc.grade);
	}
	public static void main(String[] args) {
		student_1 stu = new student_1();
		stu.setData("哈哈哈", "语文", 199);
		stu.getResault();
	}
}
