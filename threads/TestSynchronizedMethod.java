package test;
// if any thread starts using synchronized method on an object, no other thread can access this object.
// below example shows , till increment method completes, decrement method doesnt start
class SynchronizedCounter {
    private int c = 0;
    public synchronized void increment() {
        c++;
        System.out.println("increment");
        try{Thread.sleep(10000);}catch(Exception e) {};
        System.out.println("increment done");
    }

    public synchronized void decrement() {
        c--;
        System.out.println("decrement");
        try{Thread.sleep(20000);}catch(Exception e) {};
        System.out.println("decrement done");
    }

    public synchronized int value() {
        return c;
    }
}

public class TestSynchronizedMethod {
	public static void main(String[] args) {
		SynchronizedCounter counter = new SynchronizedCounter();
		counter.increment();
		counter.decrement();
	}
}
//output : 
//increment
//increment done
//decrement
//decrement done
