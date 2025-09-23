import java.util.*;
public class ex7 {
     public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter a number A:");
        int A=sc.nextInt();
        System.out.print("Enter a number B:");
        int B=sc.nextInt();
        System.out.print("Enter a number c:");
        int C=sc.nextInt();
        System.out.println("Max:" +Math.max(Math.max(A, B), C));
        System.out.println("Min:" +Math.min(Math.min(A, B), C));

        sc.close();
    }

}
