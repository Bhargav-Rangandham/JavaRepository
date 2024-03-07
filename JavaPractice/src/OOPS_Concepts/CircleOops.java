package OOPS_Concepts;

class Circle{
	private double Radius;
	
	public Circle(double Radius){
		this.Radius = Radius;
	}
	
	public double getRadius() {
		return Radius;
	}
	
	public double setRadius(double Radius) {
		this.Radius = Radius;
		return Radius;
	}
	
	public double getCirle_Area(){
		double Area = Math.PI*Radius*Radius;
		return Area;
		
	}
	
	public double getCircumference() {
		double Circumference = 2*Math.PI*Radius;
		return Circumference;
		
	}
	
	public void Circle_info() {
		System.out.println("Area of a circle is "+this.getCirle_Area());
		System.out.println("Circumeference of a Circle is "+this.getCircumference());
	}
}
public class CircleOops {

	public static void main(String[] args) {
		//Getting the details of a circle
		Circle c = new Circle(7.6);
		c.Circle_info();
		
		//Setting or Updating the details
		System.out.println("\n");
		c.setRadius(6.6);
		c.Circle_info();
	}
}

