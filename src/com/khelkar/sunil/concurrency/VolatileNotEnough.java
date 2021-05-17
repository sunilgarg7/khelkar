package com.khelkar.sunil.concurrency;

public class VolatileNotEnough {

	private volatile int count =0;
	
	public static void main(String[] args) {
		// driver method or function
		VolatileNotEnough vne = new VolatileNotEnough();
		
		Thread t1 = new Thread(new Runnable() {
			
			@Override
			public void run() {
				vne.inc();
				
			}
		});
		Thread t2 = new Thread( () -> vne.inc() );
		Thread t3 = new Thread( () -> vne.inc() );
		Thread t4 = new Thread( () -> vne.inc() );
		Thread t5 = new Thread( () -> vne.inc() );
		
		t1.start();
		t2.start();
		t3.start();
		t4.start();
		t5.start();
		
		// if we print here we are not giving enough time for these 5 threads to do their work
		// either introduce sleep or join these threads with the main thread
		try {
			Thread.sleep(300);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		System.out.println(vne.count);
	}
	
	
	
	public void inc() {
	//	synchronized (this) {
			for (int i=0; i < 1000; i++) {
				count++;// this instruction is not atomic, first it will read variable and then increment, which happens in CPU local register, 
				// then write back into main memory because of volatile.
				// now two threads can read the value at same time, lets say 9 and both stores and manipulated their local register copy and stores back 
				// to the main memory, this way one thread will override the value of increment by other
			}
	//	}
	}
}
