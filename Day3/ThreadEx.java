package Day3;


class Logic extends Thread{
	public void run() {
		System.out.println(Thread.currentThread().getName());
		
		for(int i=0;i<1000;i++) {
			System.out.println("Value "+i+Thread.currentThread().getName());
		}
		
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
}

public class ThreadEx {
	public static void main(String[] args) {
		System.out.println(Thread.currentThread().getName());
//		new Logic().run();
		
		Logic logic = new Logic();
		logic.setName("hi");
		logic.start();
		
		
		Logic l = new Logic();
		l.setPriority(logic.getPriority() + 1);
		l.setName("hello");
		l.start();
		
		for(int i=0;i<1000;i++) {
			System.out.println("Value "+i+Thread.currentThread().getName());
		}
		try {
			logic.join();
			l.join();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
}
