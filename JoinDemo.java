package javaL;

import java.util.Scanner;

public class JoinDemo extends Thread {

	static int n , sum = 0 ;
	public static void main(String[] args) {
		
		long currentTimeMillis = System.currentTimeMillis();
		System.out.println("enter number to calculate sum ");
		Scanner scanner =  new Scanner(System.in);
		JoinDemo.n = scanner.nextInt();
		JoinDemo jDemo = new JoinDemo();
		jDemo.start();
		try {
			jDemo.join();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		System.out.println("you answer is " + jDemo.sum);
		long currentTimeMillis2 = System.currentTimeMillis();
		System.out.println("our time uses is"+ (currentTimeMillis2-currentTimeMillis)/1000);

	}
	
	public void run() {
		for(int i = 0 ; i<JoinDemo.n ; i++) {
			JoinDemo.sum += i;
			try {
				Thread.sleep(10);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}

}
