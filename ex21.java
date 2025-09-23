import java.util.*;
public class ex21 {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        int n = sc.nextInt();
        int sum=0;
        while(n>0){
         int digit=n%10;
           sum=digit+sum;
            n=n/10;}
           
            System.out.println(sum);
            sc.close();
    }
}
