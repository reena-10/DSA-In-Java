import java.util.Scanner;
public class Sum_of_integers {
    public static void main(String args[]){
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter the number");
    int n1 = sc.nextInt();
    System.out.println("Enter the another Number");
    int n2 = sc.nextInt();
 if(n2 %2==0 && n1 %2 ==0){
    System.out.println("Sum of Even numbers :"+(n1+n2));

 }else if (n2 %2 != 0 && n1%2 !=0 ){
    System.out.println("Sum of Odd Numbers : "+ (n1+n2));
 }else 
{
    System.out.println(" sum is not possible of Odd and even number ");
}
sc.close();
    }
    
}
// sum karwa rahe hai 2 even numbers ka ya 2 odd numbers ka 
// agar ek number even hai or ek odd hai toh sum nhi hoga.