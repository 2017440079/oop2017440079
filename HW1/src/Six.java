import java.util.Scanner;

public class Six {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		int a;
		int b;
		int c=0, d=0; //c는 십의 자리 숫자, d는 일의 자리 숫자
		int i;
		
		System.out.println("사용자 입력: ");
		a = input.nextInt();
		
		d = a%10;
		c = (int) a/10; //c는 int형이므로 소수점 사라짐
		b = 10*d+c;
		
		System.out.println("출력: " + b );
	}

}


 