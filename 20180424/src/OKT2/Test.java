package OKT2;
import OKT1.*;

public class Test {
	public static void main(String[] args) {
		Basil aBasil = new Basil();
		aBasil.name = "Lilly";
		//aBasil.age = 2; age is a private field
		//Ÿ ��Ű���� Ŭ�󽺸� ����Ϸ��� 
		//1. ��Ű����.Ŭ�󽺸�
		//OKT1.Dog aDog = new OKT1.Dog();
		//2. import ��ɾ ���
		Dog aDog = new Dog();
		aDog.name= "happy";
		//error aDog.IDN = "23232";
		//error aDog.nickName = "kk"; nickName�� ��Ű�� ��������
		Animal aa = new Animal();
		//aa.protectedField = "ddd";
		
		Rosemary rr = new Rosemary();
		}
}
