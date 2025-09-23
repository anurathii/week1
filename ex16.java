import java.util.*;
public class ex16 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int n = sc.nextInt();
        int odd=0;
        int even=0;
        for(int i=1; i<=n; i++)
         if(i%2==0){
         even=even+i;
        }
        else{
            odd=odd+i;
        }
        System.out.println(odd+" "+even);
        sc.close();
    }
    
}
