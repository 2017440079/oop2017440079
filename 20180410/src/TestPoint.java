
public class TestPoint {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Point pnt = new Point();
		pnt.setX(1.0); pnt.setY(1.0);
		pnt.print();
		
		Point pnt2 = new Point();
		pnt2.setX(2.0); pnt2.setY(2.0);
		pnt2.print();
		//System.out.println(pnt.getX() + ", " + pnt.getY());
		System.out.println(pnt2);
		System.out.println(pnt2.distance());
		//method overloading: �޼ҵ� �̸��� ����������, �Ű������� ȣ���� �޼ҵ带 ������ �� �ִ�.
		System.out.println(pnt2.distance(pnt));
		}
	}


