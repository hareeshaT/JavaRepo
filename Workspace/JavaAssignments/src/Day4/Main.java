package Day4;
import java.text.DecimalFormat;

public class Main {

	public static void main(String[] args) {
		Circle circle = new Circle("Circle", 25);
        Square square = new Square("Square", 4);
        Rectangle rectangle = new Rectangle("Rectangle", 6, 8);
        DecimalFormat df = new DecimalFormat("#.00");
        
        System.out.println("Area of " + circle.getName() + ": " + df.format(circle.calculateArea()));
        System.out.println("Area of " + square.getName() + ": " + df.format(square.calculateArea()));
        System.out.println("Area of " + rectangle.getName() + ": " + df.format(rectangle.calculateArea()));
	}
}
