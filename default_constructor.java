package Day_5;
import java.util.Scanner;
public class default_constructor {
    int id;
    String data;
    public default_constructor(){
        Scanner sc=new Scanner(System.in);
        id=101;
        System.out.println("Enter data: ");
        data=sc.nextLine();
    }
    public static void main(String [] args){
        default_constructor n= new default_constructor();
        System.out.println("ID="+n.id);
        System.out.println("Data="+n.data);
    }
}
