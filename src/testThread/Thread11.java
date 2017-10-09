package testThread;

/**
 * Describe class Thread08 here.
 *
 *
 * Created: Sun Oct  8 11:06:16 2017
 *
 * @author <a href="mailto:root@localhost.localdomain">root</a>
 * @version 1.0
 */
public class Thread11 {

    public static void main(String[] args) {
	// main thread
	Thread thread01 = Thread.currentThread(); 
	ThreadTable threadTable = new ThreadTable();


	Runnable runnable09 = new Thread09(threadTable); // job,stack
	Thread thread09 = new Thread(runnable09,"thread09");// worker
	    
	
	Runnable runnable10 = new Thread10(threadTable); // job,stack
	Thread thread10 = new Thread(runnable10,"thread10"); // worker

	
	thread09.start();
	thread10.start();

	try {
	    for (int index = 0; index < 3; index++) {
		Thread.sleep(3000);
		System.out.println("=================");	    
		System.out.println("thread01 thread live =  "+ thread01.isAlive());
		System.out.println("thread09 thread live =  "+ thread09.isAlive());
		System.out.println("thread10 thread live =  "+ thread10.isAlive());
		System.out.println("=================");	    
	    }
	} catch (Exception e) {
	    System.out.println("main thread interrupted");
	}
    }
}
