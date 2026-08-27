package Day_5;
import java.util.Scanner;
public class copy_constructor {
    int id;
    String data;
    copy_constructor(int id, String data){
        this.id=id;
        this.data=data;
    }
    copy_constructor(copy_constructor ob){
        id=ob.id;
        data=ob.data;
    }
    void disp(){
        System.out.println(id+"-->"+data);
    }
    public static void main(String [] args){
        copy_constructor n1= new copy_constructor(101, "Sridipto");
        copy_constructor n2= new copy_constructor(102, "Mayurakshi");
        copy_constructor copy= new copy_constructor(n1);
        n1.disp();
        n2.disp();
        copy.disp();
    }
}
