package javaL;

public class GcDemo {
	
	int Idobj;
	public GcDemo(int i ) {
		// TODO Auto-generated constructor stub
		this.Idobj = i;
		System.out.println(" Created "+ this.Idobj);
	}
	
	
	
	public static void main(String[] args) {
		new GcDemo(10);
		new GcDemo(11);
		for (int i = 0; i <100; i++) {
			System.gc();
		}
		
	}
	

	@Override
	protected void finalize(){
		// TODO Auto-generated method stub
		System.out.println(" finalize or destroyed "+ Idobj );
	}

}
