package Arrays;
import java.util.*;

public class OddMultiplyEvenAdd {
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the Size of an Array.");
        int n = sc.nextInt();
        int arr[] = new int[n];

        System.out.println("Enter "+n+" elements: ");
        for(int i=0;i<arr.length;i++){
           arr[i]=sc.nextInt();
        }
        System.out.print("Original Array : ");
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
        System.out.println("Changed Array : ");
        for(int i=0;i<arr.length;i++){
             if(i%2==0)  {
                 arr[i]+=10;
             }else{
                 arr[i]*=arr[i];
             }
             System.out.print(arr[i]+" ");
        }
    }
}
