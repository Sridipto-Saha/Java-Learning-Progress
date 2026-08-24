package Chapter_1;
import java.util.Scanner;
public class area_perimeter {
    public static void area_perimeter(double p, double b){
        double area=0,peri=0;
        double h=Math.sqrt(p*p+b*b);
        area=(1.0/2.0)*p*b;
        peri=(p+b+h);
        System.out.println("The perimeter is "+peri);
        System.out.println("The area is "+area);
    }
    public static void main(String [] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the perpendicular :");
        double p=sc.nextDouble();
        System.out.println("Enter the base: ");
        double b=sc.nextDouble();
        area_perimeter(p,b);
    }
}