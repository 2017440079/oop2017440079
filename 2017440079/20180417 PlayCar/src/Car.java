
public class Car {
	//Fields
	private String color;
	private int speed;
	
	public static int numberOfCars = 0; //���� ����, static field
	//Constructor (������) : �޼ҵ���� Ŭ�� �̸��� ����. ��ȯ���� ����.
	//���� �����ڸ� �������� ������ �Ű����� ���� �����ڸ� �ڹٿ��� �ڵ����� �������ش�.
	//������, �����ڸ� �ϳ��� �����ϸ� �ڹٴ� �ƹ� �ϵ� ���Ѵ�.
	
	public Car(String color, int speed) {
		this.color = color;
		this.speed = speed;
		numberOfCars++;
	}
	
		
	public Car() {
		this.color = "White";
		this.speed = 60;
		numberOfCars++;
	}
	//methods
	public static void print() {
		//System.out.println(this.color + "," + this.speed); error
		//���� �޼ҵ�� ���� ������ ������ �� �ִ�.
		System.out.println(numberOfCars);
	}
	
	public String toString() {
		return ("Color is " + this.color + "Speed is " + this.speed);
	}
	public String getColor()
	
	public void setColor(String color) {
	}
}
