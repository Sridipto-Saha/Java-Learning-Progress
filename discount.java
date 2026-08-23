// A program to calculate discounts.
package Chapter_1;
public class discount {
    public static void main(String[] args) {
        int pr=7200;
        double d1,d2,dis,amt;
        d1=(20.0/100.0)*pr;
        d2=(10.0/100.0)*(pr-d1);
        dis=(d1+d2);
        amt=(pr-dis);
        System.out.println("Total Discount: "+dis);
        System.out.println("Amount to pay: "+amt);
    }
}