package homeWork_11_27;

public class Student extends AbstractPerson{
	
	public Student(String name, int age) {
		super(name, age);
	}

	@Override
	public void showInfo() {
		System.out.println("age: " + age + "name:" + name);
	}
	
	public void study() {
		System.out.println(name + "����ѧϰ");
	}
}
