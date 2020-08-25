package NumberFunctions;

public class ThreadImplementation implements Runnable {
	
	Thread thread;
	private String nameOfThread;
	
	ThreadImplementation(String nameOfThread){
		this.nameOfThread=nameOfThread;
	}

	@Override
	public void run() {
		// TODO Auto-generated method stub
		System.out.println("Thread running" + nameOfThread);
		for(int i=0;i<4;i++) {
			System.out.println(i);
			
		}
		
	}

	
}
