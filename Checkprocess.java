package javaL;

public class Checkprocess implements Runnable {

	@Override
	public void run() {
		System.out.println("process checks");
	}

	public static void main(String[] args) {
		//Thread.currentThread().start();
		
		Checkprocess checkprocess  = new Checkprocess();
		Thread thread = new Thread(checkprocess);
		thread.start();
		
	}

}
