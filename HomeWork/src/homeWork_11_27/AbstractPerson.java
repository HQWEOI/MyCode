package homeWork_11_27;

public abstract class AbstractPerson {
	protected String name;
	protected int age;
	
	public abstract void showInfo();
	
	public AbstractPerson(String name, int age) {
		this.name = name;
		this.age = age;
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
	
	
}
