import java.util.Scanner;

public class Fifthteen {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int a;
		int count=10;
		
		while(count!=0) {
			System.out.println("���� �Է�: ");
			Scanner scan = new Scanner(System.in);
			a = scan.nextInt();
			
			if(a>25) {
				System.out.println("�Է��Ͻ� ���ں��� Ů�ϴ�.");
				count--;
			}
				
			if(a<25) {
				System.out.println("�Է��Ͻ� ���ں��� �۽��ϴ�.");
				count--;
			}
			
			if(a==25) {
				System.out.println("�����Դϴ�!");
				break;
			}
		}
		
		if(count==0)
		System.out.println("Game Over");
		
		
	}

}
