//this program is for testing the interrupt in java
public class interrupt {
    public static void main(String [] args){
        try{
            System.out.println("Main thread has started executing");
            System.out.println("Main thread is executing");
         
            Thread.sleep(100);
                
          
            System.out.println("Main thread is executing");
            Thread.sleep(1000);
            System.out.println("Main thread is executing");
            Thread.currentThread().interrupt();
            Thread.sleep(1000);
            System.err.println("Main thread has completed executing");
        }
        catch(Exception e){
            System.out.println();
            e.printStackTrace();
        }
    }
}

