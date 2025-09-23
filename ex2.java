import java.util.Scanner;
public class ex2 {
  public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    System.out.print("Enter a number :");
    int num=sc.nextInt();

    if(num>0){
        System.err.println("It is Positive" );
    }
    else{
        System.out.println("It is Negative");
    }
      sc.close();

  }  
    
}
