import java.util.*;
public class ex27 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n= sc.nextInt();
        int age[] = new int[n];
        for(int i=0; i<n; i++){
            age[i]= sc.nextInt();
        }
        int babycount=0;
        int schoolcount=0;
        int adultcount=0;
        for(int i=0; i<n; i++){  
            if(age[i]<=5){
                 babycount++;
            }
            else if (age[i]<=20){
                schoolcount++;
            }
            else{
                adultcount++;
            }
        }
         System.out.println("Baby:"+babycount);
         System.out.println("Attending school:"+schoolcount);
         System.out.println("Adult:"+adultcount);
         sc.close();
    }
    
    
}
