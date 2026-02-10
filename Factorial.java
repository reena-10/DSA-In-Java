import java.util.Scanner;
public class Factorial {
    int factorial(int n){
        if(n==0)
        return 1;
        return n*factorial(n-1);
    }
    public static void main(String args []){
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter the Number");
    int n = sc.nextInt();
    Factorial obj = new Factorial();
    System.out.println("Factorial of "+n+" is "+obj.factorial(n));
    sc.close();
    }
}
