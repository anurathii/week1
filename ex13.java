import java.util.*;
public class ex13 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        char n = sc. next().charAt(0);
        if(n>='a'&& n<='z' || n>='A' && n<='Z') {
         System.out.println("alphabet");}

        else if (n>='0' && n<='9')
         System.out.println("integer");

        else
         System.out.println("special");
        

         sc.close();
    }
    

}
