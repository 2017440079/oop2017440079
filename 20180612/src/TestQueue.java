import java.util.*;

public class TestQueue {

	public static void main(String[] args) throws InterruptedException {
		//Queue<String> strs = new LinkedList<>();
		Queue<String> strs = new PriorityQueue<>();//알파벳 순으로 저장됨
		strs.add("trump"); //큐 맨 끝애 요소를 추가
		strs.add("jungeun");
		strs.add("jaein");
		strs.add("joonpyo");
		String str2;
		while(!strs.isEmpty()) { //for (요소타입 참조변수: 콜렉션 변스)
			str2 = strs.remove(); //큐 맨앞에서 요소를 제거하여 그 요소를 반환
			System.out.println(str2);
			Thread.sleep(1000);//2초마다 출력
		
		}
	}

}
