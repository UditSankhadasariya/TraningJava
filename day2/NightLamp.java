package day2;

public class NightLamp extends Lamp implements RemoteControl{

	@Override
	public void on() {
		System.out.println("night lamp on");
	}

	@Override
	public void off() {
		System.out.println("night lamp off");
	}
	
}
