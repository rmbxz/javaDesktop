package testThread;

public class Thread10 implements Runnable {

    ThreadTable table;
    public Thread10(ThreadTable table){
	this.table=table;
    }

    /**
     * Describe <code>run</code> method here.
     *
     */
    public final void run() {
	//	synchronized(table){ if i cant modify class table 
	    table.printTable();
	    //	}
    }
}
