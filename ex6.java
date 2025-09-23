import java.util.*;
public class ex6 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter a number A:");
        int A=sc.nextInt();
        System.out.print("Enter a number B:");
        int B=sc.nextInt();
        System.out.println("Max:" +Math.max(A,B));
        System.out.println("Min:" +Math.min(A, B));

        sc.close();
    }

    
}
