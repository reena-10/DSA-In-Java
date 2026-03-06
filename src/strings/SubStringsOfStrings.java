package strings;

public class SubStringsOfStrings {
    public static void main(String args[]){
        String s = "Jayshankar";
        System.out.println(s.substring(3));
        System.out.println(s.substring(1,6));
        System.out.println(s.substring(0,s.length()));
        //print all substring
        String str = "gopi";
        for(int i =0;i<=str.length();i++){
            for(int j=i+1; j<=str.length();j++){
                System.out.print(str.substring(i,j)+" ");
            }
            System.out.println();
        }
    }
}
