import java.util.Scanner;

public class DistInYard{
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		int feet = input.nextInt();
		
		double yards  = feet/3;
		double miles = yards/1760;
		
		System.out.println("The distance in feet is " + feet + " while in yards " + yards + " and miles is " + miles);
	}
}
	