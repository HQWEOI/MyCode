package practice_11_23;

public class Student {
	String name;
	int age;
	String className;
	String gender;
	
	Student(String name,int age,String className,String gender) {
		this.name = name;
		this.age = age;
		this.className = className;
		this.gender = gender;
	}
	public void traverse() {
		System.out.println("姓名：" + name + "年龄：" + age + "性别：" + gender + "班级：" + className);
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getClassName() {
		return className;
	}
	public void setClassName(String className) {
		this.className = className;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	

}
