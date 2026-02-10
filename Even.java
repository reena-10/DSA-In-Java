import java.util.Scanner;
public class Even {
   public static void isEven(int n) {
      if(n%2==0) {
        System.out.println("Even");
      }else{
        System.out.println("Odd");
      }
    }
    public static void main(String []args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the Number : ");
        int n = sc.nextInt();
        //if(x%2==0){
        //    System.out.println("Number is Even. ");
       // }else{
       //     System.out.println("Number is Odd. ");
       // }
       isEven(n);

        sc.close();
    }
}
