//Calculating sum and average using function argument.
package Chapter_1;
import java.util.Scanner;
public class sum_average {
    public static void sum_average(int a, int b, int c) {
        int sum = a+b+c;
        double avg = (a+b+c)/3.0;
        System.out.println("The sum is: "+sum);
        System.out.println("The average is: "+avg);
    }
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter 1st number: ");
        int a=sc.nextInt();
        System.out.println("Enter 2nd number: ");
        int b=sc.nextInt();
        System.out.println("Enter 3rd number: ");
        int c=sc.nextInt();
        sum_average(a,b,c);
    }
}
