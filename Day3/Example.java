package Day3;

class xyz{}

class abc extends xyz implements Runnable{
	Thread t;
	public abc(String name,int priority) {
		t= new Thread(this);
		t.setName(name);
		t.setPriority(priority);
		t.start();
		}
	

	@Override
	public void run() {
		// TODO Auto-generated method stub
		System.out.println(Thread.currentThread().getName());
		
		for(int i=0;i<1000;i++) {
			System.out.println("Value "+i+Thread.currentThread().getName());
		}
		
		try {
			Thread.sleep(10);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
}


public class Example {
	public static void main(String[] args) {
		abc obj = new abc("udit",6);
		obj.run();
		
	}
}
