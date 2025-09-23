import java.util.Scanner;

public class ex5 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the initial milage:");
        float initial=sc.nextFloat();
        System.out.print("Enter the finial milage:");
        float end=sc.nextFloat();
        float a=(end - initial);
        int milage=(int)(a*25);
        System.out.print("Finial Minage:" +milage);

        sc.close();
    }
    
}
