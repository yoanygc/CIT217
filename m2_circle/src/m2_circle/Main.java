package m2_circle;

public class Main {

	public static void main(String[] args) {

//		Circle myCircle1 = new Circle(10, "blue");
//	
//		
//		System.out.println("Circle radius: " + myCircle1.getRadius());
//		System.out.println("Circle color: " + myCircle1.getColor());
//		
//		System.out.println("Circle Area: " + myCircle1.getArea());
//		System.out.println("Circle Circumference: " + myCircle1.getCircumference());

		
		// Test constructors and toString()
		// You need to append a 'f' or 'F' to a float literal
		Rectangle r1 = new Rectangle(1.2, 3.4);
		System.out.println(r1); // toString()
		
		
		Rectangle r2 = new Rectangle(); // default constructor
		System.out.println(r2);
		// Test setters and getters
		r1.setLength(5.6f);
		r1.setWidth(7.8f);
		System.out.println(r1); // toString()
		System.out.println("length is: " + r1.getLength());
		System.out.println("width is: " + r1.getWidth());
		// Test getArea() and getPerimeter()
		System.out.printf("area is: %.2f%n", r1.getArea());
		System.out.printf("perimeter is: %.2f%n", r1.getPerimeter());		
	
	}

}
