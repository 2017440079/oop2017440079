import java.util.Scanner;

public class Nineteen {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int a;
		int i;
		int count=0;
		System.out.println("���� �Է�: ");
		Scanner scan = new Scanner(System.in);
		a = scan.nextInt();
		
		for(i=1;i<=a;i++) {
			if((int)a/i==(double)a/i) {
				count++;
				if(count>2) {
				System.out.println("�Ҽ��� �ƴմϴ�");
				break;
				}
			}
		}
		
		if(count==2)
			System.out.println("�Ҽ��Դϴ�");
	}
}
