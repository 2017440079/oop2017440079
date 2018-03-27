import java.util.Scanner;

public class Five {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		int number;
		
		System.out.println("choose one of the following");
		System.out.println("1. apple");
		System.out.println("2. orange");
		System.out.println("3. banana");
		System.out.println("4. peach");
		
		System.out.println("enter your choice here (number)");
		number = input.nextInt();
		
		switch(number) {
		
		case 1:
			System.out.println("Your choice is apple");
			break;
		case 2:
			System.out.println("Your choice is orange");
			break;
		case 3:
			System.out.println("Your choice is banana");
			break;
		case 4:
			System.out.println("Your choice is peach");
			break;
		default:
			System.out.println("Nothing");
			break;
		}
		
	}

}
