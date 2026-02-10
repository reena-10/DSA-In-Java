import java.util.Scanner;
public class Average {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter 3 Numbers");
    int a = sc.nextInt();
    int b = sc.nextInt();
    int c =sc.nextInt();

    int sum = (a+b+c)/3;  //Formula to calculate average
    System.out.println(sum);
    sc.close();
    }
}
