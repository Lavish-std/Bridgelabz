import java.util.Scanner;
public class UserInputKmToMiles{
	public static void main(String[] args){
		Scanner sc  = new Scanner(System.in);
		double km = sc.nextInt();
		
		double Miles = km * 0.62;
		
		System.out.println("The total miles is " + Miles + " mile for the given " + km + "km");
		
	}
}

