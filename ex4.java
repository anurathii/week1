import java.util.Scanner;
public class ex4 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter a number:");
        int num=sc.nextInt();
        int year=num/365;
        System.out.println("Year:" +year);
        int mon=(num%365)/30;
        System.out.println("Month:" +mon);
        int days=(num%365)%30;
        System.out.println("Days:" +days);

        sc.close();
    }
}
