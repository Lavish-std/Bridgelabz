public class FindVolumeOfEarth{
	public static void main(String [] args){
		double radius = 6378;
		double RadiusInMiles = 6378 * 0.621371;
		
		double pi = 3.14;
		
		double VolumeInKm = (4.0/3) * pi * radius * radius * radius;
		double VolumeInMiles = (4.0/3) * pi * RadiusInMiles *  RadiusInMiles * RadiusInMiles;
		
		System.out.println("Volume of earth in cubic kilometers is " + VolumeInKm + "\n and Volume of earth in Miles is " + VolumeInMiles);
	}
}