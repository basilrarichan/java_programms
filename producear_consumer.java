class Queue{
    int x;
    boolean is_data_present = false;

    synchronized void store(int j){
       try {
        if(is_data_present ==false){
            x = j;
            System.out.println("Pruduced"+x);
            is_data_present = true;
            notify();
                      
        }
        else{
            wait();
        }
           
       } catch (Exception e) {
          System.out.println("some problem occured");
       } 

    }
    synchronized  void retrive(){
        try{
            if(is_data_present==true){
                System.out.println("Consumed"+x);
                is_data_present= false;
                notify();

            }
        }
        catch(Exception e){
            System.err.println("some error occured");
        }
    }
}
class producer extends  Thread{
    Queue a;
    public producer(Queue q){
        a = q;

    }
    @Override
    public void  run(){
        int i = 1;
        for(;;){
            a.store(i++);
    }
}
}
class consumer extends  Thread{
Queue b;
    public consumer(Queue q){
        b = q;

    }
    @Override
    public void run(){
        for(;;){
            b.retrive();
        }
    }

    

}

public class producear_consumer {
    public static void main(String [] args){
        Queue q = new Queue();
        producer p = new producer(q);
        consumer e = new consumer(q);
        p.start();
        e.start();

    }
}
