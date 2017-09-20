package homework1;

public class Task2 {

	public static void main(String[] args) {
		/* declare the sides of the triangle */
		double a = 0.10;
		double b = 0.11;
		double c = 0.12;
		/* p - semiperimeter, S - Square */
		double p = (a+b+c)/2; // p - Semiperimeter
		double S = Math.sqrt(p*(p-a)*(p-b)*(p-c)); // S - Square
		System.out.println("Площадь треугольника = " +S);
	}
}