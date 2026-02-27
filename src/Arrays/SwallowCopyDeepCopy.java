package Arrays;
import java.util.Arrays;

public class SwallowCopyDeepCopy {
    public static void main(String []args){
        int arr[] ={10,20,30,40,50};

        //Swallow copy
        int[] x=arr;
        x[0] =100;
        System.out.println("Shallow copy : "+x[0]);
        System.out.println("Original value: "+arr[0]);
        //Deep Copy
        int[] y=Arrays.copyOf(arr,arr.length);
        y[0] = 1000;
        System.out.println("Deep Copy: "+y[0]);
        System.out.println("Original value: "+arr[0]);
    }
}
