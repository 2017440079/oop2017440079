import java.util.ArrayList;
import java.util.List;
import java.util.Iterator;

public class AnimalSing {
	List<Animal> list;//Animal�� �ڽ�Ŭ�󽺸� ���� �� �ִ�.
	AnimalSing() {
		list = new ArrayList<Animal>();
	}
	//�ϴ� ����ȯ�� �ϴ� �ñ����� ������ �޼ҵ��� �Ű������� ��� ������ �� �ִ� ������ ������ �ֱ⿡
	//�׷��ٶ�� ������ �� ������
	void add(Animal ele) {
		list.add(ele);
	}
	//=void add(Cat ele)
	//+void add(Dog ele)
	void sing() {
		Animal ele;
		Iterator<Animal> e = list.iterator();
		while(e.hasNext()) {
			ele = e.next();
			ele.sing();//Polymorphism
		}
	}
}
