//A program to calculate 10% GST.
package Chapter_1;
public class gst {
    public static void main(String[] args){
        int pr=10000;
        double gst,amount;
        gst=(pr*10.0)/100.0;
        amount=pr+gst;
        System.out.println("The GST: "+gst);
        System.out.println("Amount to be paid: "+amount);
    }
}