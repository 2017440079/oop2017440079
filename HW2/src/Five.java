
public class Five {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int number = 1;
		int sum = 0;
		
		do {
			if(number%3 == 0)
				sum = sum + number;
			number++;
		} while(number<100);
		
		System.out.println(sum);
	}

}
