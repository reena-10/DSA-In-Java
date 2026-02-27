package Arrays;

public class SecondMax {
    public static void main(String [] args){
        int [] arr ={4,10,10,6,7,8};
        int max = Integer.MIN_VALUE;
        int smax = Integer.MIN_VALUE;

        //calculate max (largest)
        for(int i=0;i<arr.length;i++){
            if(arr[i]>max) max=arr[i];
        }
        //calculate smax (Second largest)
        for(int i=0; i<arr.length;i++){
            if(arr[i]>smax && arr[i]!=max) smax=arr[i];
        }
        System.out.println("Largest "+max);
        System.out.println("Second Largest "+smax);
    }
}
