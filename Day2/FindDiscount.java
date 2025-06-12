public class FindDiscount{
	public static void main(String [] args){
		int Fees =125000;
		int discount = 10;
		
		int DiscountAmount = 125000*10/100;
		int FinalDiscountedFees = 125000 - DiscountAmount;
		
		System.out.print("The discount amount is INR " + DiscountAmount + " and the final discounted fee is INR " + FinalDiscountedFees);
	}
}