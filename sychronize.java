
class demo1 implements Runnable{
   synchronized  public void  run (){
    String name = Thread.currentThread().getName();
    System.err.println(name+"started printing");
    for(int i=0;i<=3;i++){
        System.err.println(name+"is printing");
        try {
            Thread.sleep(1000);
        } catch (Exception e) {
            System.out.println("some problem occures");
        }
        System.err.println("completed printing");
    }
   }
}
public class sychronize { 
    public static void main(String[] args){
    
        demo1 p1 = new demo1();

        Thread t1 = new Thread(p1);
        Thread t2 = new Thread(p1);
        Thread t3 = new Thread(p1);
        
        t1.setName("men");
        t2.setName("women");
        t3.setName("child");

        t1.start();
        t2.start();
        t3.start();


        


    }
}
