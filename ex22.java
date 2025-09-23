import java.util.*;
public class ex22 {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        int n = sc.nextInt();
        int sum=0;
        int n1=n;
        while(n>0){
            int digit=n%10;
            n=n/10;
            sum=digit+n;}
        if (n1%sum==0){
                System.out.print("Harshad Number");
            }
            
        else{
                System.out.print("Not Harshed NUmber");
            }
           
            sc.close();
        
           
    }
    
}
