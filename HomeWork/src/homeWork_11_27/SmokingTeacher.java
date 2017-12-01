package homeWork_11_27;

public class SmokingTeacher extends Teacher implements ISmoking{

	public SmokingTeacher(String name, int age) {
		super(name, age);
		// TODO Auto-generated constructor stub
	}
	@Override
	public void showInfo() {
		super.showInfo();
	}
	@Override
	public void smoke() {
		System.out.println(name + "ÕýÔÚ³éÑÌ");
	}

}
