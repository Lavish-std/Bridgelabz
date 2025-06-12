import java.util.Scanner;

public class FindPrice{
	public static void main(String [] args){
		Scanner input = new Scanner(System.in);
		double pricePerItem = input.nextDouble();
		int numOfItems = input.nextInt();
		
		double totalPrice = pricePerItem * numOfItems;
		
		System.out.println("The total purchase price is INR " + totalPrice + " if the quantity is " + numOfItems + " unit price is INR " + pricePerItem);
	}
}