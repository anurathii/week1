import java.util.*;
public class ex23 {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        int n = sc.nextInt();
        int num=0;
        for (int i=1; i<=n/2; i++){
            if (n%i==0){
                num+=i;
            }
        }
        if(n==num && num!=0){
            System.out.print("Perfect Number");
        }
          

        else{
            System.out.print("Not Perfect Number");
        }    

        sc.close();
    }
}
