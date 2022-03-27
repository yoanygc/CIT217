package m2_circle;

public class Circle {

	
	// Atributtes 
	private double radius;
	private String color;

	// Cnstructors
	public Circle() {
		this.radius = 1.0;
		this.color = "red";
	}
	
	public Circle(double radius) {
	
		this.radius = radius;
		this.color = "red";
	}
	
	public Circle(double radius, String color) {
		this.radius = radius;
		this.color = color;
	}

	// Getter and Setters
	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public double getRadius() {
		return radius;
	}

	public void setRadius(double radius) {
		this.radius = radius;
	}
	
	
	public double getArea() {
		return radius * radius * Math.PI;
	}
	
	public double getCircumference() {
		return 2 * Math.PI * radius;
	}
	
	public String toString() {
		return "";
	}
}
