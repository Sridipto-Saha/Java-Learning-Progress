package Day_2;
import java.util.Scanner;
public class full_name {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter string: ");
        String name= sc.nextLine();
        System.out.print(name.charAt(0)+".");
        for(int i=1;i<name.length();i++){
            char ch=name.charAt(i);
            if(ch==' ')
                System.out.print(name.charAt(i+1)+".");
        }
    }
}