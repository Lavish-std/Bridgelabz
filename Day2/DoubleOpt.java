import java.util.Scanner;

public class DoubleOpt{
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		double a = input.nextInt();
		double b = input.nextInt();
		double c = input.nextInt();
		
		double op1 =  a + b *c;
		double op2 = a * b + c;
		double  op3 = c + a / b;
		double op4 = a % b + c;
		
		System.out.println("The result of int Operations are " + op1 + ", " + op2 + ", " + op3 + ", " + "and " + op4);
	}
}

		
		