package Day_4;
import java.util.Scanner;
public class Employee {
    static int counter=101;
    int id;
    String name,dept;
    double bs,pf,da,hra,total;
    public void insert(){
        Scanner sc=new Scanner(System.in);
        id=counter++;
        System.out.println("Enter name: ");
        name=sc.nextLine();
        System.out.println("Enter department: ");
        dept=sc.nextLine();
        System.out.println("Enter salary :");
        bs=sc.nextDouble();
        calculate();
    }
    public void calculate(){
        pf= 0.075*bs;
        da= 0.10*bs;
        hra=0.095*(bs-pf);
        total=(bs-pf+da+hra);
    }
    public void display() {
        System.out.println("=========================");
        System.out.println("Name -> Dept: " + name + "->" + dept);
        System.out.println("ID: " + id);
        System.out.println("Basic Salary: " + bs);
        System.out.println("Deducted PF: " + pf);
        System.out.println("Added(da+hra): " + (da + hra));
        System.out.println("Total Salary: " + total);
        System.out.println("=========================");
    }
    public static void main(String[] args) {
        Employee e1=new Employee();
        Employee e2=new Employee();
        e1.insert();
        e2.insert();
        e1.display();
        e2.display();
    }
}