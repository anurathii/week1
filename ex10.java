import java.util.*;
public class ex10 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int age1= sc.nextInt();
        int age2= sc.nextInt();
        int code= sc.nextInt();
        int salary= sc.nextInt();
        if(age1>=21 && age1<=60 && age2>18 &&code<=4 && salary<=300000)
         System.out.println("Your are eligible for SBI credit cards");

        else
        System.out.println("Your are not eligible for SBI credit cards");

       sc.close();
    }
    
}
