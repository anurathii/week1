import java.util.*;
public class ex9 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int num1 = sc.nextInt();
        int num2 = sc.nextInt();
        int num3 = sc.nextInt();
        int num4 = sc.nextInt();
        int first = Math.max(Math.max(num1, num2),Math.max(num3, num4));
        int second = Math.max(Math.min(num1,num2),Math.min(num3, num4));
        int third = Math.min(Math.max(num1,num2),Math.max(num3,num4));
        int last = Math.min(Math.min(num1, num2),Math.min(num3, num4));
        if(second>third)
        System.out.println(first+">"+second+">"+third+">"+last);
        else
        System.out.println(first+">"+third+">"+second+">"+last);

        sc. close();
    }
}
