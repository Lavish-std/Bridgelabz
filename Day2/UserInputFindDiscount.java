import java.util.Scanner;

public class UserInputFindDiscount{
	public static void main(String [] args){
		Scanner input = new Scanner(System.in);
		
		int Fees = input.nextInt();
		int discount = input.nextInt();
		
		int discountAmount = Fees * discount / 100;
		int FinalFees = Fees - discountAmount;
		
		System.out.println("The discount amount is INR " + discountAmount + " and the final discounted fees is INR " + FinalFees);
	}
}

		