import java.util.Scanner;

public class Four {

	public static void main(String[] args) {

	Scanner input = new Scanner(System.in);
	int score;
	
	System.out.println("점수를 입력하세요: ");
	score = input.nextInt();
	
	if(score >= 80 && score <= 100) 
		System.out.print("등급 : A");
	
	if(score >= 60 && score < 80) 
		System.out.print("등급 : B");
	
	if(score >= 40 && score < 60) 
		System.out.print("등급 : C");

	if(score >= 20 && score < 40) 
		System.out.print("등급 : D");

	if(score >= 0 && score < 20) 
		System.out.print("등급 : E");
	}

}
