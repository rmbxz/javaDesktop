package testThread;

/**
 * Describe class ThreadTable here.
 *
 *
 * Created: Sun Oct  8 14:11:06 2017
 *
 * @author <a href="mailto:root@localhost.localdomain">root</a>
 * @version 1.0
 */
public class ThreadTable {

 public synchronized  void printTable(){ //synchronized method  
   for(int i=1;i<=5;i++){  
     System.out.println(5*i);  
     try{  
      Thread.sleep(400);
      // wait(5000);  //wait() cant  weakup , wait(5000) wake up after 5 sec,
     }catch(Exception e){System.out.println(e);}  
   }
   System.out.println("++++++++++++++++++++");	    
 }
}
