
public class Test {

	public static void main(String[] args) {
		
		//�캯�� Ŭ�󽺰� �º� Ŭ���� subclass�̸� ���� ���� ����. �캯-->�º�(���)
		//Upcasting 
		//Animal aaa = new Dog();
		Animal aaa = (Animal) new Dog(); 
		//overriding�� �޼ҵ带 ȣ���ϸ� subclass�� �޼ҵ带 �����Ѵ�.
		aaa.sing();
		aaa = new Cat();
		aaa.sing();
		
		int a;
		a = (int) 3.1; //����ȯ (type casting)
		
		
	}

}
