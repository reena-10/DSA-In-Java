import java.util.Scanner;
public class Elseif {
    public static void main(String []args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the 1st Numebrs : ");
        int a = sc.nextInt();
        System.out.println("Enter the 2nd Number : ");
        int b = sc.nextInt();
        if(a==b){
           System.out.println(a+" & " +b+" is equal") ;
        }else if(a>b){
            System.out.println(a+" is greater than "+b);
        }else{
            System.out.println(b+" is greater ");
        }
        sc.close();
    }
}
