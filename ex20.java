import java.util.*;
public class ex20 {
    public static void main(String[] args) {
        Scanner sc  = new Scanner (System.in);
        int n = sc.nextInt();
        int count=0;
        while(n>0){
         int digit=n%10;
           count= count+1;
            n=n/10;}
            System.out.println(count);
            sc.close();
    }
}
