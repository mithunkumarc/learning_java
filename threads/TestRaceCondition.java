package test;

// race condition
/*
When two or more threads are trying to access a variable and one of them wants to modify it, you get a
problem known as a race condition (also known as data race or race hazard). 
*/

class Counter { 
	public static int count = 0;
}

class UseCounter implements Runnable { 
	public void increment() {
		// increments the counter and prints the value
		 // of the counter shared between threads
		
		//synchronized (this) {
			Counter.count++;
			System.out.print(Counter.count + Thread.currentThread().getName() +  " , ");
		//}
		
	}
	
	@Override
	public void run() {
		this.increment();
		this.increment();
		this.increment();
	}
}
public class TestRaceCondition {
	public static void main(String[] args) {
		UseCounter uc = new UseCounter();
		Thread t1 = new Thread(uc);
		Thread t2 = new Thread(uc);
		Thread t3 = new Thread(uc);
		t1.start();
		t2.start();
		t3.start();
		
	}
}
//output : with out synchronization : 
// 3Thread-0 , 4Thread-0 , 5Thread-0 , 3Thread-1 , 6Thread-1 , 7Thread-1 , 3Thread-2 , 8Thread-2 , 9Thread-2 , 
// with synchronized : 
// 1 2 3 4 5 6 7 8 9
/*
 * When the three threads execute, each of them has a local copy of the
value Counter.count and when they update the counter with Counter.count++, they need not immediately
reflect that value in the main memory
 * */

