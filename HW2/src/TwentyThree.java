
public class TwentyThree {

	public static void main(String[] args) {

		int a=1;
		int i=1;
		int j;

		while(a!=4) {
			
			j=7-2*a;
			
			for(i=1;i<=j;i++) 
			System.out.print("*");
			
			System.out.print(" ");
			
			for(;i<=6;i++)
			System.out.print("*"); //7-2n
			
			a++;
			System.out.println("");
		}
		
	}
}