package Day_3;
public class endsWith {
    public static void main(String args[]){
        String site= "google.com";
        if(site.endsWith(".com"))
            System.out.println("Commercial site");
        else if(site.endsWith(".org"))
            System.out.println("Organizational site");
        else if(site.endsWith(".gov"))
            System.out.println("Government site");
        else if(site.endsWith(".in"))
            System.out.println("Indian business site");
        else
            System.out.println("Personal startup");
    }
}
