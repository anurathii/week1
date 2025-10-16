import java.util.*;
public class ex25 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int intSqrt = (int) Math.sqrt(n);
        if(intSqrt*intSqrt==n){
            System.out.print("Perfect Square");
        }
        else{
            System.out.print("Not Perfect Square");
        }
        sc.close();

    }
    
}
