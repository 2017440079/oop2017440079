import java.util.Scanner;

public class TweleveOne {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int a;
		int i,j;
		int count=0;
		int sum=0;
		
		System.out.println("���� �Է�: ");
		Scanner scan = new Scanner(System.in);
		a = scan.nextInt();
		
		for(j=1;j<=a;j++) {
			
		for(i=1;i<=j;i++) {
			if((int)j/i==(double)j/i)
				count++;
			}
		
		if(count==2)
			sum = sum + j;
		
		count=0;
		}
	
		System.out.println(sum);
	}

}
