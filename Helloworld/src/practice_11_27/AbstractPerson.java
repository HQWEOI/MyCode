package practice_11_27;

public abstract class AbstractPerson extends AbstractAnimal{
	
	public AbstractPerson() {
		super();
	}

	public AbstractPerson(String name, int age) {
		super(name, age);
	}

	public void walk() {
		System.out.println(name + "������·");
	}
	
	public abstract void speak();
}
