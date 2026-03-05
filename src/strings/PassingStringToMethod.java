package strings;

public class PassingStringToMethod {
    public static void change(String s){
        s="Vikas";
    }
    public static void main(String[] args){
       String s="Vivek";
       System.out.println(s);
       change(s);
       System.out.println(s);
    }
}
