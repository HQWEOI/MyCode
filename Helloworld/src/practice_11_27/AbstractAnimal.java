package practice_11_27;
public abstract class AbstractAnimal {
	protected String name;
	protected int age;

	public AbstractAnimal() {
		super();
	}

	public AbstractAnimal(String name, int age) {
		super();
		this.name = name;
		this.age = age;
	}

	public abstract void showInfo();

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