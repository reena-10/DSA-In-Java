package strings;

public class SbBuiltInMethods {
    public static void main(String [] args){
        String s= "Aditya";
        StringBuilder sb = new StringBuilder(s);
        sb.reverse();
        sb.deleteCharAt(1);
        sb.insert(1,'y');
        sb.reverse();
        sb.delete(3,6);
        s=sb.toString();
        System.out.println(s);
    }
}
