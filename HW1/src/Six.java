import java.util.Scanner;

public class Six {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		int a;
		int b;
		int c=0, d=0; //c�� ���� �ڸ� ����, d�� ���� �ڸ� ����
		int i;
		
		System.out.println("����� �Է�: ");
		a = input.nextInt();
		
		d = a%10;
		c = (int) a/10; //c�� int���̹Ƿ� �Ҽ��� �����
		b = 10*d+c;
		
		System.out.println("���: " + b );
	}

}


 