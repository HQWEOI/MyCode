package homeWork_11_27;

public class SmokingBikingTeacher extends Teacher implements ISmoking,IBiking{

	public SmokingBikingTeacher(String name, int age) {
		super(name, age);
	}

	@Override
	public void bike() {
		System.out.println(name + "���������г�");
		
	}

	@Override
	public void smoke() {
		System.out.println(name + "���ڳ���");
		
	}

}
