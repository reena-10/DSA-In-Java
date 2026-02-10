import java.util.Scanner;
class Simple_Interest{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the prinipal Value");
        int P = sc.nextInt();
        System.out.println("Enter the rate ");
        int R = sc.nextInt();
        System.out.println("Enter the Time");
        int T = sc.nextInt();

        int calculate = P*R*T/100; //formula to find simple interest
        System.out.println("Simple Interest is : "+calculate);

        sc.close();

    }
}