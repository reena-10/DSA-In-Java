import java.util.*;
public class Max_Min {
  public static void fun_Max_Min(int num){
    int mini = Integer.MAX_VALUE;
    int maxi = Integer.MIN_VALUE;
    while (num!=0){
    int rem = num%10;
    mini = Math.min(mini,rem);
    maxi = Math.max(maxi,rem);
    num = num/10;
  }
  System.out.println("Maximum no is " +maxi );
  System.out.println("Minimum no is "+mini);
}
    public static void main(String args []){
    Scanner sc = new Scanner(System.in);
    int num = sc.nextInt();
    fun_Max_Min(num);
    sc.close();
    }
    
}
