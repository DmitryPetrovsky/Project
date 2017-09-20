package homework1;
import java.util.Scanner;
public class Task3 {

	public static void main(String[] args) {
		
		Scanner scann=new Scanner(System.in);
		int r; // r - Radius
		System.out.println("¬ведите радиус:");
		r = scann.nextInt();  
		double l = 2*Math.PI*r; // l - Length
		System.out.println("ƒлина окружности = " + l);
	}
}