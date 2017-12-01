package homeWork_11_26;

public class Vehicle {
	int speed;
	int size;
	
	public Vehicle(int speed, int size) {
		this.speed = speed;
		this.size = size;
	}
	public int getSpeed() {
		return speed;
	}
	public int getSize() {
		return size;
	}
	public void speedUp() {
		speed += 10;
	}
	public void speedDowm() {
		speed -= 10;
	}
	
	public static void main(String[] args) {
		Vehicle car = new Vehicle(100 , 200);
		
		System.out.println(car.getSpeed());
		car.speedUp();
		System.out.println(car.getSpeed());
		
	}
}