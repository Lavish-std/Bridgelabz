import java.util.Scanner;

public class MaxHandshakes{
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		int students = input.nextInt();
		int n = students;
		
		int maxhandshakes = (n*(n-1)) /2;
		
		System.out.println("The maximum number of handshakes possible are " + maxhandshakes);
	}
}