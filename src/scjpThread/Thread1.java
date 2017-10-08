package scjpThread;



/**
 * Describe class Thread1 here.
 *
 *
 * Created: Sat Jan 21 14:15:29 2017
 *
 * @author <a href="mailto:root@localhost.localdomain">root</a>
 * @version 1.0
 */
public class Thread1  {

    /**
     * Creates a new <code>Thread1</code> instance.
     *
     */
    public Thread1() {

    }

    public static void main(String[] args) {
	Thread thread1 = Thread.currentThread();
	System.out.println("print thread info "+ thread1);
	// this is the main thread, first one  thread at java  and shutdown or the last one  thread 
	thread1.setName("my first thread "); 
	System.out.println("print thread info "+ thread1);
	System.out.println("get thread name =" + thread1.getName());
	Thread thread2 = new Thread( );
	thread2.setName("thread2");
	int x=0;
	for (int index = 0; index < 5; index++) {
	    try {
		System.out.println("welcome to thread programming");
		Thread.sleep(10000); //sleep one second
		//		int y=1/x;
	    } catch (InterruptedException  e) {
		System.out.println("main thread Interrupted ");
	    }
	    //	    System.out.println("cant access");
	}	
    }
}
