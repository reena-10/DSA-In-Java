public class DuplicateElements {
    public static void main(String args[]){
        int [] num = {1,2,3,4};
        boolean duplicateFound = false;

        for(int i=0; i<num.length; i++){
            for(int j =i+1; j < num.length;j++){
                if(num[i]==num[j]){
                    duplicateFound =true;
                    break;
                }
            }
            if (duplicateFound){
              break;
            }
        }
        if(duplicateFound){
            System.out.println("True");

        }else{
            System.out.println("False");
        }
    }
}
