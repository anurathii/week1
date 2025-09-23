import java.util.Scanner;

public class ex1 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num=sc.nextInt();
        if (num%2==0){
            System.out.print("The given number is even");
        }
        else{
            System.out.print("The given number is odd");
        }
        sc.close();
    }
}
