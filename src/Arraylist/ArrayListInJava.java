package Arraylist;

import java.util.ArrayList;
import java.util.Collections;

public class ArrayListInJava {
    public static void main(String [] args){
        ArrayList<Integer> arr = new ArrayList<>();
        arr.add(25);
        arr.add(67);
        arr.add(84);
        arr.add(65);
        arr.add(62);

        System.out.println(arr.get(2)); //access the value of index 2
        arr.set(2,60); //change the value of arraylist
        System.out.println(arr.get(2));
        arr.add(1,100); //add element at paticular index
        arr.add(3,300);
        Collections.reverse(arr); //reverse arraylist
        for(int ele : arr){
           System.out.print(ele+" ");
        }
    }
}
