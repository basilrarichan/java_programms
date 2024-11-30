
import java.util.ArrayList;
import java.util.Collections;
class employee implements Comparable{ 
    private Integer id;
    private String name;
    private String email;
    private String phone;

    public employee(int id,String name,String email,String phone){
        this.id= id;
        this.name = name;
        this.email = email;
        this.phone = phone;
    }

    public String getEmail() {
        return email;
    }

    public Integer getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getPhone() {
        return phone;
    }

    @Override
    public int compareTo(Object o2) {
        Object o1 = this;
        Integer id1 = o1.id;
        Integer id2 = o2.id;
        if (id1>id2) {
            return 1;
        }
        else if(id1<id2){
            return -1;
        }
        else{

            return 0;
        }
    }


    
}

class SortTry{
    public static void main(String[] args) {
        employee e1 = new employee(1, "basil", "basil@gmail.com", "9744266561");
        employee e2 = new employee(2, "bibbin", "bibbin@gmail.com", "9747355899");
        employee e3 = new employee(3, "athul", "athul@gmail.com", "9747355899");
        

        System.out.println(e1.getEmail());
        ArrayList list = new ArrayList();
            list.add(e1);
            list.add(e2);
            list.add(e3);
            Collections.sort(list);
            System.out.print(list);
    }
}