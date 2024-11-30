import java.util.ArrayList;


 class MyArrayList {
    public static void main(String[] args) {
     ArrayList  list = new ArrayList<>();
       list.add(1);
       list.add(3);
       list.add(1,2);
       list.remove(1);
       list.set(1, 2);
       list.get(0);
     ArrayList  c = new ArrayList<>();
       c.add(3);
       c.add(4);
       c.add(5);
       list.addAll(c);
       
       //System.out.println(list);
       list.addAll(3, c);
       list.removeAll(c);
       //list.retainAll(c);
       //System.out.println(list);
        int i = list.size();
        i = list.lastIndexOf(2);
        //System.out.println(i);
        //System.out.println(list.isEmpty());
        //System.out.println(list.Capacity()); Their is no method named capacity in arrayList;
        list.trimToSize();

        //System.out.println(list.contains(2));
        //list.clear();
        System.out.println(list);
        Object [] value =  list.toArray();
       
        System.out.println(value[1]);
        System.out.println(list.hashCode()); 



        
        
    }
}
