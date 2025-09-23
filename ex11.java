import java.util.*;
public class ex11 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n1= sc.nextInt();
        int n2 = sc.nextInt();
        int n3 =sc.nextInt();
        if(n1==n2 && n2==n3)
         System.out.println("Equilateral triangle");
        
        else if (n1==n2 || n2==n3 || n1==n3)
         System.out.println("Isosceles triangle");

        else
         System.out.println("Scalene triangle");

        sc.close();
    }
    
    
}
