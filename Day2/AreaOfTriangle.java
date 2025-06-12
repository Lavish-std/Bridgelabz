import java.util.Scanner;

public class AreaOfTriangle{
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		
		double base = input.nextInt();
		double height = input.nextInt();
		
		double area = 0.5 * base * height;
		double inches = area/2.54;
		
		System.out.println("The area of triangle in square inches " + inches + " square cm " + area);
	}
}
