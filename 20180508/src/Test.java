
public class Test {

	public static void main(String[] args) {
		
		//우변의 클라스가 좌변 클라스의 subclass이면 전혀 문제 없다. 우변-->좌변(상속)
		//Upcasting 
		//Animal aaa = new Dog();
		Animal aaa = (Animal) new Dog(); 
		//overriding한 메소드를 호출하면 subclass의 메소드를 수행한다.
		aaa.sing();
		aaa = new Cat();
		aaa.sing();
		
		int a;
		a = (int) 3.1; //형변환 (type casting)
		
		
	}

}
