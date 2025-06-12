import java.util.Scanner;

public class FindHeight{
	public static void main(String [] args){
		Scanner input = new Scanner(System.in);
		int HeightInCm = input.nextInt();
		
		double Cm = 2.54;
		double Inches = HeightInCm/2.54;


		int Feet = (int)Inches/12;
		int inches = (int)Inches%12;
		
		
		
		System.out.println("Your Height in cm is " + HeightInCm + " while in feet is " + Feet + " and inches is " + inches);
	}
}

		
		
		
		