import java.util.*;
public class ex26 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int first = 0;
        int second = 1;
        System.out.print(first+" "+second);
        for(int i=2; i<N; i++){
            int next = first + second;
            System.out.print(" "+next);
            first = second;
            second = next;
        }
        sc.close();
    }
    
}
