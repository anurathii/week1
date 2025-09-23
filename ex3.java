import java.util.Scanner;

public class ex3 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter a number:");
        int num=sc.nextInt();
        if(num%3==0&&num%5==0){
            System.err.print("The number is divisible by 3 and 5");
        }
        else{
            System.out.print("The number is not divisible by 3 and 5");
        }

        sc.close();
    }
    
        
    
}
