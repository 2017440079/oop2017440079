import java.util.Scanner;

public class Nineteen {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int a;
		int i;
		int count=0;
		System.out.println("숫자 입력: ");
		Scanner scan = new Scanner(System.in);
		a = scan.nextInt();
		
		for(i=1;i<=a;i++) {
			if((int)a/i==(double)a/i) {
				count++;
				if(count>2) {
				System.out.println("소수가 아닙니다");
				break;
				}
			}
		}
		
		if(count==2)
			System.out.println("소수입니다");
	}
}
