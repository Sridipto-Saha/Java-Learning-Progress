package Day_5;
import java.util.Scanner;
public class parameterized_constructor {
    int id;
    String data;
    public parameterized_constructor(int id, String data){
       this.id=id;
       this.data=data;
    }
    void disp(){
        System.out.println( id +"-->"+ data);
    }
    public static void main(String [] args){
        parameterized_constructor n = new parameterized_constructor(101,"Sridipto");
        n.disp();
    }
}
