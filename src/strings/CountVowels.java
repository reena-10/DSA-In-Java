package strings;

public class CountVowels {
    public static void main(String args[]){
        String s = "qwpoosmecabouiasmnvagiryioajbbbcbamxjajkowjdoa";
        int count =0;
        for(int i=0; i<s.length(); i++){
            char ch = s.charAt(i);
            if(ch=='a'||ch=='e'||ch=='i'||ch=='u'||ch=='o') {
                count++;
            }
        }
        System.out.println(count);
    }
}
