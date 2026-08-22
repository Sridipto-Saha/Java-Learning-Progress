package Day_1;
import java.util.Scanner;
public class user_input_average {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter 1st number");
        int a=sc.nextInt();
        System.out.println("Enter 2nd number");
        int b=sc.nextInt();
        System.out.println("Enter 3rd number");
        int c=sc.nextInt();
        double avg=(a+b+c)/3.0;
        System.out.println("The average is " +avg);
    }
}
