
public class TestCar {

	public static void main(String[] args) {
		System.out.println(Math.cos(0)); //Math.cos() : ��ü�� �������� �ʰ� ����� �� �ִ� �޼ҵ�
		Car.print();
		Car myCar = new Car("Space Blue", 300);
		//System.out.println(Car.numberOfCars);
		Car yourCar = new Car(); 
		//System.out.println(yourCar.numberOfCars);
		//���� ������ "Ŭ�󽺸�, ����������" ���ε� ������ �� �ִ�.
		//System.out.println(Car.numberOfCars);
		//myCar.setColor("Black");
		//myCar.setSpeed(100);
	}

}
