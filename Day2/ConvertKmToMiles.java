public class ConvertKmToMiles{
	public static void main(String[] args){
		double oneKmInMiles = 1.6;
		double distanceInKm = 10.8;
		double distanceInMiles = distanceInKm * oneKmInMiles;
		
		System.out.println("The distance" + distanceInKm + "km in miles is " + distanceInMiles);
	}
}