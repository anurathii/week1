import java.util.*;
public class ex24 {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        int n = sc.nextInt();
        // boolean prime = n>1;
        for (int i=2; i*i<=n && n>1; i++)
            if (n%i==0){
                // prime=false;
                System.out.println("Not Prime");
                break;
            }
            else{
                System.out.println("Prime");
                break;
            }    
    }
}      
