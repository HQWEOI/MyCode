package practice_11_13;

public class Employee_6 {
	String name;
	int Asalary;
	MyData_6 ept = new MyData_6();
	public void setName(String name) {
		this.name = name;
	}
	public void setAsalary(int asalary) {
		Asalary = asalary;
	}
	public void getinf() {
		System.out.println(" ������"+name+" ��н ��"+Asalary+"�ܹ�ʱ�䣺" );
		ept.getData();
	}
	public static void main(String[] args) {
		Employee_6 emp = new Employee_6();
		emp.setAsalary(10000);
		emp.setName("С��");
		emp.ept.setData(1998, 10, 1);
		emp.getinf();
	}
}
