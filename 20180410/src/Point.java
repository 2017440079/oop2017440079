
public class Point {
	//Fields
	private double x;
	private double y;
	
	//Methods

	
	public void print() {
		System.out.println(this.getX() + ", " + this.getY());
		System.out.println(this.x + ", " + this.y);
	}
	
	public double distance() {
		
		double result;
		
		result = Math.sqrt(x*x+y*y);
				
		return result;
	}
	//method overloading 매개변수가 다름
	public double distance(Point p) {
		
		return Math.sqrt( ( this.x-p.getX() )*( this.x-p.getX() )+( this.y-p.getY() )*( this.y-p.getY() ) );
		
	}
	
	public double getX() {
		return x;
	}
	public void setX(double x) {
		this.x = x;
	}
	public double getY() {
		return y;
	}
	public void setY(double y) {
		this.y = y;
	}
	
	

}
