package day2;

public class BMW extends FourWheeler{
	public void musicPlayer() {
		System.out.println("Bmw has Sony wala Music player");
	}
	
	public void offRoad() {
		System.out.println("NOt good for off roading");
	}

	@Override
	public void move() {
		System.out.println("Bm moves");
	}

	@Override
	public void stop() {
		System.out.println("BM stops");
	}

	@Override
	public void fuelType(FuelType fuelType) {
		System.out.println("Bm has only Petrol...");
	}
	
}
