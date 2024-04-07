package Lab_Activity;


	class Ride {
	    double distance; // in kilometers
	    double baseFare; // base fare for the ride
	    double farePerKm; // fare per kilometer

	    public Ride(double distance, double baseFare, double farePerKm) {
	        this.distance = distance;
	        this.baseFare = baseFare;
	        this.farePerKm = farePerKm;
	    }

	    public double calculateFare() {
	        double totalFare = baseFare + (farePerKm * distance);
	        return totalFare;
	    }
	}

	public class Fare_labactivity {
	    public static void main(String[] args) {
	        Ride ride1 = new Ride(10.5, 5.0, 2.0); // Distance: 10.5 km, Base fare: $5.0, Fare per km: $2.0
	        Ride ride2 = new Ride(5.8, 3.0, 1.5); // Distance: 5.8 km, Base fare: $3.0, Fare per km: $1.5

	        double fare1 = ride1.calculateFare();
	        double fare2 = ride2.calculateFare();

	        System.out.println("Fare for ride 1: $" + fare1);
	        System.out.println("Fare for ride 2: $" + fare2);
	    }
	}