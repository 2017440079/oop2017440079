import java.util.Scanner;

public class Thirteen {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int m,d;
		
		System.out.println("month: ");
		Scanner scan = new Scanner(System.in);
		m = scan.nextInt();
		
		System.out.println("day: ");
		d = scan.nextInt();
		
		switch(m) {
		
		case 1:
			System.out.print(d);
			break;
		
		case 2:
			System.out.print(31+d);
			break;
			
		case 3:
			System.out.print(59+d);
			break;
			
		case 4:
			System.out.print(90+d);
			break;
			
		case 5:
			System.out.print(120+d);
			break;
			
		case 6:
			System.out.print(151+d);
			break;
			
		case 7:
			System.out.print(181+d);
			break;
			
		case 8:
			System.out.print(212+d);
			break;
			
		case 9:
			System.out.print(243+d);
			break;
			
		case 10:
			System.out.print(273+d);
			break;
			
		case 11:
			System.out.print(304+d);
			break;
			
		case 12:
			System.out.print(334);
			break;
		}
		
		System.out.print("¿œ");
	}

}
