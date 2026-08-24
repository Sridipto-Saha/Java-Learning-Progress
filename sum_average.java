package Chapter_1;
public class sum_average {
    public static void sum_average(int a, int b, int c) {
        int sum = a+b+c;
        double avg = (a+b+c)/3.0;
        System.out.println("The sum is: "+sum);
        System.out.println("The average is: "+avg);
    }
    public static void main(String [] args){
        sum_average(16,19,28);
    }
}
