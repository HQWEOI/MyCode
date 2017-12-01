package practice_11_27;

public class Student extends AbstractPerson{
	private String className;
	
	public Student() {
		super();
	}
	
	public Student(String name, int age, String className) {
		super(name, age);
		this.className = className;
	}


	@Override
	public void speak() {
		System.out.println(name + "����˵��");
	}

	@Override
	public void showInfo() {
		System.out.println("Student [className=" + className + ", name=" + name + ", age=" + age + "]");
	}
	
	public void study() {
		System.out.println(name + "����ѧϰ");
	}
	
	
	@Override
	public String toString() {
		return "Student [className=" + className + ", name=" + name + ", age=" + age + "]";
	}

	public String getClassName() {
		return className;
	}

	public void setClassName(String className) {
		this.className = className;
	}

}