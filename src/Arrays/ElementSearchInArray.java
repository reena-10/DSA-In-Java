package Arrays;
import java.util.Scanner;
public class ElementSearchInArray {
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Array Size.");
        int n =sc.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter the "+n+" Elements");
        for(int i=0;i<arr.length;i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println("Enter the Target Element.");
        int target =sc.nextInt();
        boolean flag = false;
       for(int i=0;i<arr.length;i++){
            if(arr[i]==target){
                flag =true;
                break;
            }
        }
      if(flag==true) System.out.println("Target existes in Array at index");
      else System.out.println("Target missing in Array");
    }
}
