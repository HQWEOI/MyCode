package practice_11_13;

public class rectangle_5 {
	int weight;
	int height;
	public void setWeight(int weight) {
		this.weight = weight;
	}
	public void setHeight(int height) {
		this.height = height;
	}
	public int getWeight() {
		return weight;
	}
	public int getHeight() {
		return height;
	}
	private int area() {
		return (weight+height)*2;
	}
	private int perimeter() {
		return weight*height;
	}
}
