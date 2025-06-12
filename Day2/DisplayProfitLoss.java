public class DisplayProfitLoss{
public static void main(String[] args){
	int costPrice = 129;
	int sellingPrice = 191;
	
    float  profit = sellingPrice - costPrice;
	float profitPercentage = (profit/costPrice)*100f;
	
	System.out.println("The Cost Price is INR " + costPrice +
	                   "and Selling Price is INR " + sellingPrice +
 					   "\nThe Profit  is INR" + profit + 
					   "and The Profit Percentage is " + profitPercentage + "%");
}
}
