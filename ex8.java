import java.util.*;
public class ex8 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int Age=sc.nextInt();
        int Gender=sc.nextInt();
        if (Gender==1 && Age<25)
         System.out.println("G1");

        else if(Gender==2 && Age>25)
         System.out.println("G2");

        else if (Gender==1 && Age>25 && Age<45)
         System.out.println("G3");

        else if (Gender==2 && Age>25 && Age<45 )
         System.out.println("G4");

        else if (Gender==1|| Gender==2 && Age>45)
         System.out.println("G5");

        else
         System.out.println("Invalid");

         sc.close();
    }
    
}
