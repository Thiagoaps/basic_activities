package entites;

public class Rectangle {
	
	public Double width;
	public Double height;
	
	public double area() {
		return width * height;		
	}
	public double perimeter() {
		return 2 *(width + height);
	}
	public double diagonal() {
		return Math.sqrt(width * width + height * height);
	}

}
