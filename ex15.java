import java.util.*;
public class ex15 {
    public static void main(String[] args) {
        Scanner sc=new Scanner (System.in);
        int n=sc.nextInt();
        int sum=0;
        for (int i=1; i<=n; i++){
            if (i%2==0)
            sum+=i;
        }
        System.err.print(sum);

        sc.close();
    }
    
}
