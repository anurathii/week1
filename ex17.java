import java.util.*;
public class ex17 {
    public static void main(String[] args) {
        Scanner sc= new Scanner (System.in);
        int n = sc.nextInt();
        int fact=1;
        if(n>0){
            for(int i=1; i<=n; i++)
              fact=fact*i;
            System.out.print(fact);
        }
        else{
            System.out.print("Error! Factorial of a negative does't exist.");
        }
        sc.close();
    }
    
}
