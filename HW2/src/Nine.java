import java.util.Scanner;

public class Nine {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int a,i;
		int print = 0;
		
		while(print!=1) {
		System.out.println("정수 입력: ");
		Scanner scan = new Scanner(System.in);
		a = scan.nextInt();
		
		if(a<1||a>10)
			System.out.println("1~9사이의 정수가 아닙니다. 다시 입력하세요. ");
		else {
			print=1;
			for(i=1;i<10;i++)
				System.out.println(+ a + " x" + i + " =" + a*i);
		}
		
	}

}
}
