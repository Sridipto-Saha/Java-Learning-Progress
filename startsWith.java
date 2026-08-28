package Day_3;

public class startsWith {
    public static void main(String [] args){
        String site="http://techplus.fun";
        if(site.startsWith("https://"))
            System.out.println("SSl activated");
        else
            System.out.println("SSl deactivated");
    }
}
