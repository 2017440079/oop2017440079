package OKT2;
import OKT1.*;

public class Test {
	public static void main(String[] args) {
		Basil aBasil = new Basil();
		aBasil.name = "Lilly";
		//aBasil.age = 2; age is a private field
		//타 패키지의 클라스를 사용하려면 
		//1. 패키지명.클라스명
		//OKT1.Dog aDog = new OKT1.Dog();
		//2. import 명령어를 사용
		Dog aDog = new Dog();
		aDog.name= "happy";
		//error aDog.IDN = "23232";
		//error aDog.nickName = "kk"; nickName은 패키지 접근지정
		Animal aa = new Animal();
		//aa.protectedField = "ddd";
		
		Rosemary rr = new Rosemary();
		}
}
