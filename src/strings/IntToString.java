package strings;
import java.util.Scanner;

public class IntToString {
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String s="";
        s+=n;
       // String s= Integer.toString(n); built In Function
        System.out.println(s);
        //String to Int
        String str ="23064269";
        int n1 = Integer.parseInt(str);
        System.out.println(n1+1);
    }
}
