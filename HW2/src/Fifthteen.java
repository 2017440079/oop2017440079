import java.util.Scanner;

public class Fifthteen {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int a;
		int count=10;
		
		while(count!=0) {
			System.out.println("숫자 입력: ");
			Scanner scan = new Scanner(System.in);
			a = scan.nextInt();
			
			if(a>25) {
				System.out.println("입력하신 숫자보다 큽니다.");
				count--;
			}
				
			if(a<25) {
				System.out.println("입력하신 숫자보다 작습니다.");
				count--;
			}
			
			if(a==25) {
				System.out.println("정답입니다!");
				break;
			}
		}
		
		if(count==0)
		System.out.println("Game Over");
		
		
	}

}
