package homework1;
import java.util.Scanner;
public class Task1 {

	public static void main(String[] args) {
		
		Scanner scann=new Scanner(System.in);
		System.out.println("¬ведите число (до 5 знаков):");
		// declare the type and name of the variable
		int numb = scann.nextInt();
		int numb1 = numb / 10000;
		int numb2 = numb % 10000/1000;
		int numb3 = numb % 1000/100;
		int numb4 = numb % 100/10;
		int numb5 = numb % 10;
		// displaying numbers on the screen
		System.out.println(numb1);
		System.out.println(numb2);
		System.out.println(numb3);
		System.out.println(numb4);
		System.out.println(numb5);
	}
}