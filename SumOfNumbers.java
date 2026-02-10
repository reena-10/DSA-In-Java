import java.util.Scanner;
public class SumOfNumbers {

    public static int SumOfNo(int Num){
        int sum =0;
        while(Num!=0){
        int rem = Num%10;
        sum+=rem;
        Num=Num/10;
        }
        return sum;
    }
    public static void main(String args []){
    Scanner sc = new Scanner(System.in);
    int Num = sc.nextInt();
    int ans = SumOfNo(Num);
    System.out.println(ans);
    sc.close();
    }
}
