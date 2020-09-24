import java.util.Scanner;

public class HowFarAway 
{
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);

        double startLong;
        double startLat;
        double endLong;
        double endLat;

        System.out.print("Enter the latitude of the starting location: ");
        startLat = in.nextDouble();
        
        System.out.print("Enter the longitude of the starting location: ");
        startLong = in.nextDouble();
        
        System.out.print("Enter the latitude of the ending location: ");
        endLat = in.nextDouble();
       
        System.out.print("Enter the longitude of the ending location: ");
        endLong = in.nextDouble();

        GeoLocation locationOne = new GeoLocation(startLat, startLong);
        GeoLocation locationTwo = new GeoLocation(endLat, endLong);

        System.out.print("The distance is " + locationOne.distanceFrom(locationTwo) + " miles.");




    }
}