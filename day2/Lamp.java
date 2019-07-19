package day2;

public class Lamp implements RemoteControl{

	@Override
	public void on() {
		System.out.println("Lamp on");
		
	}

	@Override
	public void off() {
		System.out.println("lamp off");
		
	}
	
}
