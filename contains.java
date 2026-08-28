package Day_3;
public class contains {
    public static void main(String [] args){
        String site1= "msmegov.org";
        String site2= "techplus.gov.in";
        if(site1.contains(".gov"))
            System.out.println("Government site");
        else
            System.out.println("Not Government site");

        if(site2.contains(".gov"))
            System.out.println("Government site");
        else
            System.out.println("Not Government site");
    }
}
