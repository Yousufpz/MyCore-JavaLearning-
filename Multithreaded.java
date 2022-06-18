/**
 * 
 */
package javaL;


public class Multithreaded extends Thread{

	
	
	
	public static void main(String[] args) throws InterruptedException {
		Multithreaded multithreaded = new Multithreaded();
		multithreaded.setPriority(MIN_PRIORITY);
		multithreaded.setName("1");
		multithreaded.start();
		
		Multithreaded multithreaded1 = new Multithreaded();
		multithreaded1.setPriority(MAX_PRIORITY);
		multithreaded1.setName("2");
		multithreaded1.start();
		
//		Thread currentThread = new Thread();
//		System.out.println("this thread name is "+ currentThread.getName());
//		currentThread.setName("inMain");
//		System.out.println("this thread name is "+ currentThread.getName());

		
//		for(int i = 0 ; i<11 ; i++){
//				System.out.print("  i in mains "+ i );
//				Thread.sleep(10);
//			}
//	

	}
	public void run() {

//		Thread currentThread = new Thread();
		System.out.println("this thread name is "+ Thread.currentThread().getName());
//		for(int i = 0 ; i<11 ; i++){
//			System.out.print("i in fun "+ i );
//			try {
//				Thread.sleep(1000);
//			} catch (InterruptedException e) {
//				// TODO Auto-generated catch block
//				System.out.println("in child thread");
//			}
//		}
	}

}
