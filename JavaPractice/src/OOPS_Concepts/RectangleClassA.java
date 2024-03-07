package OOPS_Concepts;

class Rectangle{
	int width;
	int height;
	
	Rectangle(int width, int height){
		this.width=width;
		this.height=height;
	}
	public int getArea() {
		int area = width*height;
		return area;
	}
	
	public int getPerimeter() {
		int perimeter = 2*(width*height);
		return perimeter;
	}
}
/*
public class RectangleClassA {

	public static void main(String[] args) {
		
		Rectangle r = new Rectangle(6,4);
		System.out.println(r.getArea());
		System.out.println(r.getPerimeter());
		
	}
}
*/