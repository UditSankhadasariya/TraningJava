package day2;

public class DisplayVehicle {
	public static void showVehicle(Vehicle ...vehicles) {
		for(Vehicle temp : vehicles) {
			temp.move();
			temp.stop();
		}
	}
}
