import java.util.Scanner;

public class Eleven {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int a;
		int i=1;
		int end=0;
		
		do {
		
		System.out.println("정수 입력: ");
		Scanner scan = new Scanner(System.in);
		a = scan.nextInt();
		
		if(a==0)
			break;
		
		System.out.print(+ a + " => ");
		
		while(i<a) {
			if(a%i==0)
				System.out.print(+ i + " ");
			
			i++;
		}
		i=1;
		
		} while(end!=1);
	}

}
