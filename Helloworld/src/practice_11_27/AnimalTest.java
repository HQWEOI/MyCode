package practice_11_27;

public class AnimalTest {
	
	private static final double PI = 3.14;
	
	public static void main(String[] args) {
		//Cannot instantiate the type AbstractAnimal
		//AbstractAnimal animal = new AbstractAnimal();
		
		
		
		Student student = new Student("zhangsan", 20, "java1711");
		student.showInfo();
		student.speak();
		student.walk();
		student.study();
		
		System.out.println("---------------");
		//վ�ڶ���Animal����Ƕ�ȥ�����ѧ��
		AbstractAnimal animal = new Student("zhangsan", 20, "java1711");
		animal.showInfo();
	
		System.out.println("---------------");
		//վ����Person����Ƕ�ȥ�����ѧ��
		AbstractPerson person = new Student("zhangsan", 20, "java1711");
		person.showInfo();
		person.walk();
		person.speak();
		
		System.out.println("---------------");
		Student stu = (Student) person;
		stu.study();
	}
}