
public class Point {
	//필드의 scope(유효범위)은 클래스 내부이
	private double x;
	private double y;
	
	public void setX(double xx) {
		this.x = 100.0;
	}
	
	public void setY(double yy) {
		this.y = yy;
	}
	
	public double distance() {
		//반환할 변수 선언
		double result; //지역 변수의 유효범위는 메소드 내부
		
		//거리 계산
		result = Math.sqrt(x*x+y*y);
		
		//거리 반환
		return result;
	}
	
	public Point move(Point p) { //매개변수 p의 유효범위는 메소드 내부
		
		//temp 변수 선언
		double a; 
		double b;
		
		//포인트 p만큼 이동
		a = this.x+p.x;
		b = this.y+p.y;
		
		//새로운 포인트 생성
		Point pnt = new Point();
		pnt.x = a;
		pnt.y = b;
		
		//새로운 포인트 반환
		return pnt;
	}
	
}
