class demo1 extends Thread{
    @Override
    public void run(){
        
        String current = Thread.currentThread().getName();
        if(current.equals("add")){
            add();
        }
        else if(current.equals("sub")){
            sub();
        }
        else{
            mul();
        }
        
    }
    public void add(){
        System.out.println("Addition started");
        try{
            Thread.sleep(1000);
        }
        catch(Exception e){
            
        }
        System.out.println("Addition ended");
    }
    public void sub(){
        System.out.println("Substraction started");
        try{
            Thread.sleep(1000);
        }
        catch(Exception e){
            
        }
        System.out.println("Substraction ended");
    }
    public void mul(){
        System.out.println("multiplication started");
        try{
            Thread.sleep(1000);
        }
        catch(Exception e){
            
        }
        System.out.println("multiplication ended");
    }
    
}


public class multithreadingwithsinglerunmethod {
    public static void main(String[] args) {
        demo1 d1 = new demo1();
        demo1 d2 = new demo1();
        demo1 d3 = new demo1();
        
        
        d1.setName("add");
        d2.setName("sub");
        d3.setName("mul");
        
        d1.start();
        d2.start();
        d3.start();
         
        
    }
}
