import java.util.*;

public class TestQueue {

	public static void main(String[] args) throws InterruptedException {
		//Queue<String> strs = new LinkedList<>();
		Queue<String> strs = new PriorityQueue<>();//���ĺ� ������ �����
		strs.add("trump"); //ť �� ���� ��Ҹ� �߰�
		strs.add("jungeun");
		strs.add("jaein");
		strs.add("joonpyo");
		String str2;
		while(!strs.isEmpty()) { //for (���Ÿ�� ��������: �ݷ��� ����)
			str2 = strs.remove(); //ť �Ǿտ��� ��Ҹ� �����Ͽ� �� ��Ҹ� ��ȯ
			System.out.println(str2);
			Thread.sleep(1000);//2�ʸ��� ���
		
		}
	}

}
