package homeWork_11_27;

public class Teacher extends AbstractPerson{
	


	public Teacher(String name, int age) {
		super(name, age);
	}

	@Override
	public void showInfo() {
		System.out.println("age: " + age + "name:" + name);
	}
	
	public void teach() {
		System.out.println(name + "ÕıÔÚ½ÌÊÚ");
	}
	
}
