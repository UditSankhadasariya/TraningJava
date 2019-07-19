package day2;

public class VehicleIImp {
	public static void main(String[] args) {
		Vehicle []  vehicles = new Vehicle[5]; 
		vehicles[0] = new BMW (2, FuelType.PETROL,"Sony");
		
		
		
		DisplayVehicle.showVehicle(vehicles);
	}
}
