package homeWork_11_27;

public class SmokingStudent extends Student implements ISmoking{

	public SmokingStudent(String name, int age) {
		super(name, age);
	}

	@Override
	public void showInfo() {
		super.showInfo();
	}

	@Override
	public void smoke() {
		System.out.println(name + "ÕıÔÚ³éÑÌ");
		
	}
	

}
