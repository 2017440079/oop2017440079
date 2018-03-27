import java.util.Scanner;

public class Seven {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a; 
		int sum = 0;
			
		do {
			System.out.println("정수 입력: ");
			Scanner scan = new Scanner(System.in);
			a = scan.nextInt();
			
			if(a==0) {
				System.out.println("점수 총합: " + sum);
				break;
			}
			
			sum = sum + a;
			
		} while(a!=0);
	}

}
