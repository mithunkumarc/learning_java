1. Runnable run() : completes task in separate thread but doesn't inform whether task is completed or not.

2. Callable call() : not alternative for Runnable but can be used with thread to inform wheter task is completed or not.

3. if thread/runnable is not used along with Callable, call() method runs inside Main thread.

4. Object which provides implementation for Callable call passed to Future task.

5. Future task object can keep track of task, whether task completed(isDone) or not.

#### Example : without thread, Callable call() runs inside Main thread (not recommended as it block Main thread?)


      class MyCallable implements Callable<String> {
        @Override
        public String call() throws Exception {
          System.out.println("thread sleeping");
          Thread.sleep(5000);
          System.out.println(Thread.currentThread().getName());
          return "completed";
        }
      }

      public class HelloWorld {
        public static void main(String[] args) throws Exception {		  
              // without thread, FutureTask runs callable inside main thread
              FutureTask ft = new FutureTask(new MyCallable());		  
              ft.run(); // calls call() method, runs in Main thread
              System.out.println(ft.get()); // completed
        }
      }


#### Example : Callable running in separate thread, FutureTask can read task completed retunred by call()

        class MyCallable implements Callable<String> {
          @Override
          public String call() throws Exception {
            System.out.println("thread sleeping");
            Thread.sleep(5000);
            System.out.println("callable running in : "+Thread.currentThread().getName());
            return "completed";
          }
        }

        public class HelloWorld {
          public static void main(String[] args) throws Exception {
                FutureTask ft = new FutureTask(new MyCallable());		  
                // run task on separate thread, so that to make an Asynchronous call
                Thread t = new Thread(ft);
                t.start();
                System.out.println("thread start called");
                System.out.println("is thread completed ? : "+ft.isDone());
                System.out.println(ft.get());// "completed"	 
          }
        }

        /*
          thread start called
          thread sleeping
          is thread completed ? : false
          callable running in : Thread-0
          completed
        */
        
readMore : 

      https://www.baeldung.com/java-runnable-callable
